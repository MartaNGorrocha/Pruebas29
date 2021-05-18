package com.marta.LectorNoticias.reader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GenericDao {

	Connection conn = null;

	public static final String DB_USER ="postgres";
	public static final String DB_USER_PWD ="Abc123..";
	public static final String DB_CONNECTION_URI ="jdbc:postgresql://localhost:5432/Noticias?client_encoding=auto";
 
	public GenericDao() {
		// TODO Auto-generated constructor stub
	}
	
	
	protected Connection connect() { 
		//	Connection conn = null;
			try {
				conn = DriverManager.getConnection(DB_CONNECTION_URI,DB_USER, DB_USER_PWD);
				// conn = DriverManager.getConnection(database_connection_string,
				// database_user_name, database_user_password);
//				conn = DriverManager.getConnection(ConfigAplication.getInstance().getDataBaseConnectionURI(),
//						ConfigAplication.getInstance().getDataBaseUser(),
//						ConfigAplication.getInstance().getDataBaseUserPwd());

				System.out.println("You are successfully connected to the PostgreSQL database server.");
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			return conn;
	}
	protected void closeAll(Statement st, ResultSet rs, Connection conn) {
		closeResultSet(rs);
		closePreparedStatement(st);
		closeConnection(conn);
	}
	
	protected void closeAll(PreparedStatement st, ResultSet rs) {
		closeResultSet(rs);
		closePreparedStatement(st);
	}


	protected void closeAll(PreparedStatement st) {
		closePreparedStatement(st);
	}
	//en los proximos metodos cerramos cada uno de los elementos de la conexion,
	//individualmente para poder usarlos en los anteriores
	
	protected void closeResultSet(ResultSet rs) {
		try {
			if (rs != null) {
					rs.close();
					rs = null;
				}
			} catch (Exception e) {
				System.err.print("No se ha podido cerrar el ResultSet: \n" + e.getLocalizedMessage());
			}
	}
	
	protected void closePreparedStatement(Statement st) {
			try {
				if (st != null) {
					st.close();
					st = null;
				}
			} catch (Exception e) {
				System.err.print("No se ha podido cerrar el PreparedStatement: \n" + e.getLocalizedMessage());
			}
	}

	protected void closeConnection(Connection conn) {
		try {
			if (conn != null) {
				if (!conn.isClosed()) {
					conn.close();
				}
				conn = null;
			}
		} catch (Exception e) {
			System.err.print("No se ha podido cerrar la conexion: \n" + e.getLocalizedMessage());
		}

}
}
