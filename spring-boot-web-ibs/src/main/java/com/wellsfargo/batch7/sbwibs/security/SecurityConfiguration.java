package com.wellsfargo.batch7.sbwibs.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
		
	}
	@Autowired
	private IBSAuthenticationSuccessHandler successHandler;
	
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		// Setting Service to find User in the database.
		// And Setting PassswordEncoder
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());

	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**","/signup/trackRegistration/**","/forgotPassword/**","/resetPassword/**","/upload/**");
	}
	
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
		.antMatchers("/").permitAll();
//		.antMatchers("/home").hasAnyAuthority("USER","ADMIN").antMatchers("/signin/home").hasAuthority("USER").anyRequest().authenticated();
		
//		http.formLogin().successHandler(successHandler).loginPage("/home").failureUrl("/signin?error=true").defaultSuccessUrl("/signin/home")
//				.usernameParameter("userName").passwordParameter("password");
		
		http.formLogin().successHandler(successHandler).loginPage("/home").permitAll().failureUrl("/signin?error=true").usernameParameter("userName").passwordParameter("password");

		http.logout().logoutRequestMatcher(new AntPathRequestMatcher("/signout")).logoutSuccessUrl("/");
		
		http.exceptionHandling().accessDeniedPage("/pages/access-denied-page.jsp");
	}

	
	

}
