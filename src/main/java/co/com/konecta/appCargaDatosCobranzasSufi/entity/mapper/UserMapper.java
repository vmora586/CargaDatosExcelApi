package co.com.konecta.appCargaDatosCobranzasSufi.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.konecta.appCargaDatosCobranzasSufi.entity.User;

public class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId(Integer.parseInt(rs.getString("id")));
		user.setName(rs.getString("name"));
		return user;
	}
}
