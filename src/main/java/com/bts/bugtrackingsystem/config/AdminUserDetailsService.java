package com.bts.bugtrackingsystem.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.bts.bugtrackingsystem.model.Admin;
import com.bts.bugtrackingsystem.repository.AdminRepository;

@Component
public class AdminUserDetailsService implements UserDetailsService 
{
	@Autowired
	private AdminRepository arepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<Admin> adminInfo = arepo.findByName(username);
		return adminInfo.map(AdminUserDetails::new)
				.orElseThrow(()-> new UsernameNotFoundException("user not found "+username));
	}

}
