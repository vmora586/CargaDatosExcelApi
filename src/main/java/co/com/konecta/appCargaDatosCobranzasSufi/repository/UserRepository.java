package co.com.konecta.appCargaDatosCobranzasSufi.repository;

import co.com.konecta.appCargaDatosCobranzasSufi.entity.User;

/**
 * usually this class extends from jpa repository, but in this
 * case we are working with jdbc
 * @author victorm
 *
 */


public interface UserRepository {

	public  User authentiatedUser(String username, String password);

}
