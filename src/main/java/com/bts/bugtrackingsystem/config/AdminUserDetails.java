package com.bts.bugtrackingsystem.config;


import java.util.Collection;
import java.util.List;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.bts.bugtrackingsystem.model.Admin;
import com.bts.bugtrackingsystem.model.Role;

public class AdminUserDetails implements UserDetails{
	
	private String fName;
	private String password;
	private List<GrantedAuthority> authorities;
	
	

	public AdminUserDetails(Admin admin) {
		fName = admin.getfName();
		password = admin.getPassword();
		Role role = admin.getRoleID();
        authorities = List.of(new SimpleGrantedAuthority(role.getRoleName()));
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return fName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
