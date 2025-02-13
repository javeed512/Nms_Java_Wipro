package com.wipro.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig {

	
	
	@Autowired
	  UserDetailsService  userDetailsService; // new  MyUserDetailsServiceImp();
	

		@Bean
		public AuthenticationProvider    authProvider() {
			
			
			DaoAuthenticationProvider provider=		new DaoAuthenticationProvider();
			
			provider.setUserDetailsService(userDetailsService);
			provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
			
			//provider.setPasswordEncoder(new BCryptPasswordEncoder());
			
			return provider;
		}
	
	
	
	
	/*
	 * @Bean protected UserDetailsService userDetailsService() {
	 * 
	 * 
	 * List<UserDetails> users = new ArrayList<UserDetails>();
	 * 
	 * users.add(User.withDefaultPasswordEncoder().username("javeed").password(
	 * "tiger").roles("USER").build());
	 * users.add(User.withDefaultPasswordEncoder().username("king").password("lion")
	 * .roles("ADMIN").build());
	 * 
	 * 
	 * users.add(User.withDefaultPasswordEncoder().username("wipro").password(
	 * "wipro123") .roles("TRAINEE").build());
	 * 
	 * 
	 * return new InMemoryUserDetailsManager(users);
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	
	
}
