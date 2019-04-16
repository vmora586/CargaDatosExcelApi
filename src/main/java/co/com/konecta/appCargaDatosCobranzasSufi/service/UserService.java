package co.com.konecta.appCargaDatosCobranzasSufi.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import co.com.konecta.appCargaDatosCobranzasSufi.entity.UserRole;
import co.com.konecta.appCargaDatosCobranzasSufi.repository.UserRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

@Service("userService")
public class UserService implements UserDetailsService {

	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		co.com.konecta.appCargaDatosCobranzasSufi.entity.User user= userRepository.findByUsername(username);
		List<GrantedAuthority>auths=builAuthorities(user.getRol());
		return buildUser(user, auths);
	}

	private User buildUser(co.com.konecta.appCargaDatosCobranzasSufi.entity.User user,List<GrantedAuthority>authorities) {
		
		return new User(user.getName(),user.getPassword(),true,true,true,true, authorities);
	}
	
	
	private List<GrantedAuthority>builAuthorities (Set<UserRole> userRoles){
		Set<GrantedAuthority>auths=new HashSet<GrantedAuthority>();
		
		for(UserRole userRole: userRoles){
			auths.add(new SimpleGrantedAuthority(userRole.getName()));
		}
		
		return new ArrayList<GrantedAuthority>(auths);
		
	}
}
