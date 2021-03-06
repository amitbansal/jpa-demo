package com.amitbansal.spring.restfuldemo.jpa.jpademo;


import org.slf4j.Logger;
//import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{

	@Autowired
	private UserDaoService userEntityDaoService; 
	
	private static final Logger log = LoggerFactory.getLogger(UserDaoService.class);
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user = new User("Jack", "Admin");
		long id = userEntityDaoService.insert(user);
		log.info("New user is created"+user);
	}

}
