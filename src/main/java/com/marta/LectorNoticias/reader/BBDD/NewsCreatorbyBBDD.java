package com.marta.LectorNoticias.reader.BBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.marta.LectorNoticias.model.New;
import com.marta.LectorNoticias.reader.INewsCreator;

public class NewsCreatorbyBBDD implements INewsCreator {

//	Logger logger = LoggerFactory.getLogger(NewsCreatorbyRSS.class);
	NewsCreatorbyBBDD creator = null;
	final String SQL_QUERY="SELECT * from t_noticia";

	
	public NewsCreatorbyBBDD() {
		// TODO Auto-generated constructor stub
	}
	
//	public List<New> extractingData(String SQL_query) throws SQLException {
//		List<New> lista ;
//		GenericDao genericDao= new GenericDao();
//		Connection conn = null;
//		PreparedStatement st = null;
//		ResultSet rs = null;
//		try {
//			conn = genericDao.connect();
//			st = conn.prepareStatement (SQL_QUERY);
//			 lista = new ArrayList<>();
//				rs =  st.executeQuery();
//				while(rs.next()) {
//					New notice = new New();
//					notice.setId(rs.getInt("a_id_new"));
//					notice.setTitle(rs.getString("a_title"));
//					notice.setDescription(rs.getString("a_description"));
//					notice.setLink(rs.getString("a_link"));
//					notice.setPublicationDate(rs.getDate("a_pub_date"));
//					lista.add(notice);
//				}
//				rs.close();
//				st.close();
//		} catch (SQLException e) {
//			throw e;
//		} finally {
//			genericDao.closeAll(st, rs, conn);
//		}			
//		return lista;
//	}
}
		
//		
//	
//	protected Connection connect() { 
//		//	Connection conn = null;
//			try {
//				conn = DriverManager.getConnection(DB_CONNECTION_URI,DB_USER, DB_USER_PWD);
//				// conn = DriverManager.getConnection(database_connection_string,
//				// database_user_name, database_user_password);
////				conn = DriverManager.getConnection(ConfigAplication.getInstance().getDataBaseConnectionURI(),
////						ConfigAplication.getInstance().getDataBaseUser(),
////						ConfigAplication.getInstance().getDataBaseUserPwd());
//
//				System.out.println("You are successfully connected to the PostgreSQL database server.");
//			} catch (SQLException e) {
//				System.out.println(e.getMessage());
//			}
//			return conn;
//	}
//	protected void closeAll(Statement st, ResultSet rs, Connection conn) {
//		closeResultSet(rs);
//		closePreparedStatement(st);
//		closeConnection(conn);
//	}
//	
//	protected void closeAll(PreparedStatement st, ResultSet rs) {
//		closeResultSet(rs);
//		closePreparedStatement(st);
//	}
//
//
//	protected void closeAll(PreparedStatement st) {
//		closePreparedStatement(st);
//	}
//	//en los proximos metodos cerramos cada uno de los elementos de la conexion,
//	//individualmente para poder usarlos en los anteriores
//	
//	protected void closeResultSet(ResultSet rs) {
//		try {
//			if (rs != null) {
//					rs.close();
//					rs = null;
//				}
//			} catch (Exception e) {
//				System.err.print("No se ha podido cerrar el ResultSet: \n" + e.getLocalizedMessage());
//			}
//	}
//	
//	protected void closePreparedStatement(Statement st) {
//			try {
//				if (st != null) {
//					st.close();
//					st = null;
//				}
//			} catch (Exception e) {
//				System.err.print("No se ha podido cerrar el PreparedStatement: \n" + e.getLocalizedMessage());
//			}
//	}
//
//	protected void closeConnection(Connection conn) {
//		try {
//			if (conn != null) {
//				if (!conn.isClosed()) {
//					conn.close();
//				}
//				conn = null;
//			}
//		} catch (Exception e) {
//			System.err.print("No se ha podido cerrar la conexion: \n" + e.getLocalizedMessage());
//		}
//
//}
//}
