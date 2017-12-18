package it.hysen.springreactordemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.MapUserDetailsRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsRepository;

@Configuration
public class SecurityConfiguration {
	
	@Bean
	UserDetailsRepository userDetailsRepository() {
	    UserDetails tom = User.withUsername("tom").password("password").roles("USER").build();
	    UserDetails harry = User.withUsername("harry").password("password").roles("USER", "ADMIN").build();
	    return new MapUserDetailsRepository(tom, harry);
	}
	
}
