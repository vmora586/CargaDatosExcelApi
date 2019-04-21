package co.com.konecta.appCargaDatosCobranzasSufi.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import co.com.konecta.appCargaDatosCobranzasSufi.entity.User;
import co.com.konecta.appCargaDatosCobranzasSufi.entity.mapper.UserMapper;
import co.com.konecta.appCargaDatosCobranzasSufi.repository.UserRepository;

@Repository("userRepository")
public class UserRepositoryImp extends JdbcDaoSupport implements UserRepository {

	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public User authentiatedUser(String username, String password) {
		
		String sql = "SELECT * FROM employee WHERE empId = ?,?";
		
		RowMapper<User> userMapper = new UserMapper();
		User user= jdbcTemplate.queryForObject(sql, userMapper);
		return user;
	}

}
