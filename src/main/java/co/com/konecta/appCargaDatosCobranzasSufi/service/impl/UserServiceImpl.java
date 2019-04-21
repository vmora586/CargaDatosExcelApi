package co.com.konecta.appCargaDatosCobranzasSufi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.konecta.appCargaDatosCobranzasSufi.entity.User;
import co.com.konecta.appCargaDatosCobranzasSufi.repository.UserRepository;
import co.com.konecta.appCargaDatosCobranzasSufi.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User authenticateUser(String id, String password) {
		return userRepository.authentiatedUser(id, password);
	}

}
