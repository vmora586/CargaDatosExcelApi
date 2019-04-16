package co.com.konecta.appCargaDatosCobranzasSufi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.konecta.appCargaDatosCobranzasSufi.entity.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Serializable>{

	public abstract User findByUsername(String username);

}
