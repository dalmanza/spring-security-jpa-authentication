package com.example.spring.security.jpa.springSecurityJPA;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails {

	private static final long serialVersionUID = -5678877331616250293L;
	private String username;
	private String password;
	private boolean active;
	private List<GrantedAuthority> roles;

	public MyUserDetails(final User user) {

		this.username = user.getUsername();
		this.password = user.getPassword();
		this.active = user.isActive();
		this.roles = Arrays.asList(user.getRoles().split(",")).stream()
				.map(SimpleGrantedAuthority::new).collect(Collectors.toList());
	}

	public MyUserDetails() {
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.roles;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return this.active;
	}

	@Override
	public boolean isAccountNonLocked() {
		return this.active;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return this.active;
	}

	@Override
	public boolean isEnabled() {
		return this.active;
	}

}
