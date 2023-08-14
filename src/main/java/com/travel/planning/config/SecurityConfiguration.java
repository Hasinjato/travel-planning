package com.travel.planning.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

import com.travel.planning.service.UserService;

@Configuration
@EnableWebSecurity	
public class SecurityConfiguration extends WsConfigurerAdapter {

	@Autowired
	private UserService userService;
	
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
    
    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
    	DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
    	auth.setUserDetailsService((UserDetailsService) userService);
    	auth.setPasswordEncoder(passwordEncoder());
    	return auth;
    }

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
	}
	
	protected void configure(HttpSecurity http) throws Exception {
    http
    	.authorizeHttpRequests(authorizeRequests -> authorizeRequests.requestMatchers(
            "/registration**",
            "/travels**",
            "/js/**",
            "/css/**",
            "/img/**").permitAll()
            .anyRequest().authenticated()
            )
	        .formLogin(login -> login
	                .loginPage("/loginn")
	                .defaultSuccessUrl("/home").failureUrl("/loginn?error=true")
	                .loginProcessingUrl("/loginn")
// 					.failureUrl("/loginn?error")
// 					.loginProcessingUrl("/registration")
//	                .failureUrl("/loginn?eror")
	                .permitAll())
            .logout(logout -> logout
                    .invalidateHttpSession(true)
                    .clearAuthentication(true)
                    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                    .logoutSuccessUrl("/loginn?logout")
                    .permitAll());
	}
}
