package com.mysqlsecurity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mysqlsecurity.model.User;
import com.mysqlsecurity.model.UserDetailsImpl;
import com.mysqlsecurity.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findByUserName(username);
		System.out.println(user.get().getUserName() + "      " + user.get().getPassword() + "    "
				+ user.get().getRoles() + "    " + user.get().isActive());
		user.orElseThrow(() -> new UsernameNotFoundException("Username not found with userName: " + username));
		// return new UserDetailsImpl(user.get());//or use below return statement
		return user.map(UserDetailsImpl::new).get();
	}

}
