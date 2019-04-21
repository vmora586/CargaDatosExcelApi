package co.com.konecta.appCargaDatosCobranzasSufi.service;

import co.com.konecta.appCargaDatosCobranzasSufi.entity.User;

public interface UserService {

	public User authenticateUser(String id, String password);
	
}
