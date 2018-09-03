package com.amitbansal.spring.restfuldemo.jpa.jpademo;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
//import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository; 
	
	private static final Logger log = LoggerFactory.getLogger(UserDaoService.class);
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("Jill", "Admin");
		userRepository.save(user);
		log.info("New user is created"+user);
		Optional<User> userWithIdOne = userRepository.findById(1L);
		log.info("user is found "+userWithIdOne);
		List<User> users = userRepository.findAll();
		log.info("all users"+users);
		
	}

}
