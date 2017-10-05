package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcDaoImpl implements JdbcDao{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void details(){
		System.out.println(this.dataSource);
		System.out.println(this.jdbcTemplate);
	}

/*	public void insertUser(User user) {
		String sql = "insert into users (age, user_login, user_pass) values(?,?,?)";
		
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, user.getAge());
			ps.setString(2, user.getUser_login());
			ps.setString(3, user.getUser_pass());
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println("Could not close jdbc connection");
				}
			}
		}
		
		
	}
*/
	
	public void insertUser(User user) {
		String sql = "insert into users (age, user_login, user_pass) values(?,?,?)";
		jdbcTemplate.update(sql, user.getAge(), user.getUser_login(), user.getUser_pass());
		
		
	}
	
}
