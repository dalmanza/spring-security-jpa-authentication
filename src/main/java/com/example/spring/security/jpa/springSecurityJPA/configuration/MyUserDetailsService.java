package com.example.spring.security.jpa.springSecurityJPA.configuration;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.spring.security.jpa.springSecurityJPA.MyUserDetails;
import com.example.spring.security.jpa.springSecurityJPA.User;
import com.example.spring.security.jpa.springSecurityJPA.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(final String username)
			throws UsernameNotFoundException {
		final Optional<User> userDetails =
				userRepository.findByUsername(username);
		userDetails.orElseThrow(
				() -> new UsernameNotFoundException("not found: " + username));
		return userDetails.map(MyUserDetails::new).get();
	}

}
