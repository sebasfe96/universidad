package com.uni.desa.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.uni.desa.dto.usuariosDTO;

@Repository
public class usuariosRepositoryImpl extends JdbcDaoSupport{

	@Autowired
	public usuariosRepositoryImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
	public usuariosDTO getUsuariosByUsuacodi(Long usuacodi) {
		String SQL="select t.* from usuarios t where t.usuacodi =?";
		
				PreparedStatementSetter setter = new PreparedStatementSetter() {
					
					@Override
					public void setValues(PreparedStatement ps) throws SQLException {
						ps.setLong(1, usuacodi);
					}
				};
				
				return getJdbcTemplate().query(SQL, setter, new getUsuariosByUsuacodiResult());
	}
	
	public static class getUsuariosByUsuacodiResult implements ResultSetExtractor<usuariosDTO>{

		@Override
		public usuariosDTO extractData(ResultSet rs) throws SQLException, DataAccessException {
			usuariosDTO user = new usuariosDTO();
			
			while(rs.next()) {
				user.setUsuacodi(rs.getLong("usuacodi"));
				user.setUsuanomb(rs.getString("usuanomb"));
				user.setUsuaedad(rs.getLong("usuaedad"));
				user.setUsuadire(rs.getString("usuadire"));
				user.setUsuatele(rs.getString("usuatele"));
				user.setUsuaemail(rs.getString("usuaemail"));
			}
			System.out.println("aquisebas ; " + user.getUsuacodi());
			return user;
		}
		
	}
}
