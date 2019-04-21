package co.com.konecta.appCargaDatosCobranzasSufi.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import co.com.konecta.appCargaDatosCobranzasSufi.entity.User;

public class UserRowMapper implements RowMapper<User> {
	
	@Override
	public User mapRow(ResultSet row, int rowNum) throws SQLException {
		User user = new User();
		user.setId(row.getInt("id"));
		user.setUsername(row.getString("usuario"));
		return user;
	}
}
