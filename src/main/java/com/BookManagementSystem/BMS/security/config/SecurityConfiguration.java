package com.BookManagementSystem.BMS.security.config;

import com.BookManagementSystem.BMS.security.service.MyUserDetailservice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    private final MyUserDetailservice myUserDetailservice;

    public SecurityConfiguration(MyUserDetailservice myUserDetailservice) {
        this.myUserDetailservice = myUserDetailservice;
    }

    @Bean
    public UserDetailsService userDetailsService(){
        return new MyUserDetailservice();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(
                (auth) -> auth.requestMatchers("/","/registration")
                        .permitAll()
                        .anyRequest()
                        .authenticated()
                );
        http.authenticationProvider(authenticationProvider());
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
       return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider doa = new DaoAuthenticationProvider();
        doa.setUserDetailsService(userDetailsService());
        doa.setPasswordEncoder(passwordEncoder());
        return doa;
    }

}
