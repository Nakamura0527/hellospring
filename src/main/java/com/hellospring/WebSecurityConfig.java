package com.hellospring;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.hellospring.service.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private DataSource dataSource;

	@Autowired
	private MyUserDetailsService userDetailsService;

	@Autowired
    public void configure(AuthenticationManagerBuilder auth, PasswordEncoder passwordEncoder) throws Exception {
        auth.inMemoryAuthentication()
            .passwordEncoder(passwordEncoder)
            .withUser("hoge")
//            .password("$2a$08$CekzJRYhb5bzp5mx/eZmX.grG92fRXo267QVVyRs0IE.V.zeCIw8S")
            .password(passwordEncoder().encode("pass"))
            .roles("USER");
    }
//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
////    	auth.userDetailsService(userDetailsService);
//    	auth.inMemoryAuthentication()
//    	.withUser("test")
//    	.password(passwordEncoder().encode("pass"));
//    }

    @Override
	protected void configure(HttpSecurity http) throws Exception {
//        http.sessionManagement().maximumSessions(2);
        http
			.authorizeRequests()
				.antMatchers("/", "/home").permitAll()
//				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				.loginProcessingUrl("/login")
//				.usernameParameter("username")
//				.passwordParameter("password")
				.defaultSuccessUrl("/list")
				.failureUrl("/login-error")
				.permitAll()
				.and()
			.logout()
				.permitAll();
	}

    //パスワードのアルゴリズムをBCryptに設定
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
//    @Bean
//	@Override
//	public UserDetailsService userDetailsService() {
//		UserDetails user =
//			 User.withDefaultPasswordEncoder()
//				.username("username")
//				.password("password")
//				.roles("USER")
//				.build();
//
//		return new InMemoryUserDetailsManager(user);
//	}
}