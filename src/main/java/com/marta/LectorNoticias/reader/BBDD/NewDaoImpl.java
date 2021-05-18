package com.marta.LectorNoticias.reader.BBDD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.marta.LectorNoticias.model.New;

import com.marta.LectorNoticias.reader.INewsCreator;

public class NewDaoImpl extends GenericDao implements INewDao, INewsCreator {
	Logger LOG = LoggerFactory.getLogger(NewDaoImpl.class);
	public NewDaoImpl() {
		super();
	}

	@Override
	public List<New> findAll() throws SQLException {
		List<New> lista ;
//		GenericDao genericDao= new GenericDao();
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			conn = connect();
			st = conn.prepareStatement ("select * from t_noticia");
			 lista = new ArrayList<>();
				rs =  st.executeQuery();
				while(rs.next()) {
					New notice = new New();
					notice.setId(rs.getInt("a_id_new"));
					notice.setTitle(rs.getString("a_title"));
					notice.setDescription(rs.getString("a_description"));
					notice.setLink(rs.getString("a_link"));
					notice.setPublicationDate(rs.getDate("a_pub_date"));
					lista.add(notice);
				}
				rs.close();
				st.close();
		} catch (SQLException e) {
			throw e;
		} finally {
			closeAll(st, rs, conn);
		}
		LOG.info("noticias dentro de lista");
		return lista;
	
	}

	@Override
	public List<New> findByDate(Date date) throws SQLException {
		List<New> lista =null;
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			conn = connect();
			st = conn.prepareStatement ("select * from t_noticia where a_pub_date= ? ;");
			  st.setDate(1, date);
			  lista = new ArrayList<>();
				rs =  st.executeQuery();
				while(rs.next()) {
					New notice = new New();
					notice.setId(rs.getInt("a_id_new"));
					notice.setTitle(rs.getString("a_title"));
					notice.setDescription(rs.getString("a_description"));
					notice.setLink(rs.getString("a_link"));
					notice.setPublicationDate(rs.getDate("a_pub_date"));
					lista.add(notice);
				}
				rs.close();
				st.close();
		} catch (SQLException e) {
			throw e;
		} finally {
			closeAll(st, rs, conn);
		}			
		return lista;
	}
	

	@Override
	public List<New> findbyString(String text) throws SQLException {
		List<New> lista =null ;
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			conn = connect();
			st = conn.prepareStatement ("select * from t_noticia  where a_title = ?");
				st.setString(1, text);
//				st.setString(2, "'%"+text+"%'");
			 lista = new ArrayList<>();
				rs =  st.executeQuery();
				while(rs.next()) {
					New notice = new New();
					notice.setId(rs.getInt("a_id_new"));
					notice.setTitle(rs.getString("a_title"));
					notice.setDescription(rs.getString("a_description"));
					notice.setLink(rs.getString("a_link"));
					notice.setPublicationDate(rs.getDate("a_pub_date"));
					lista.add(notice);
				}
				rs.close();
				st.close();
		} catch (SQLException e) {
			throw e;
		} finally {
			closeAll(st, rs, conn);
		}			
		return lista;
	}

}
