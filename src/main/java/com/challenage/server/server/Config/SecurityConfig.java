package com.challenage.server.server.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig {
//    @Configuration
//    public static class WebSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter{
//        @Override
//        protected void configure(HttpSecurity http) throws Exception{
//            http.csrf().disable();
//            //访问index需要ADMIN权限
//            http.authorizeRequests().antMatchers("/").hasRole("ADMIN").anyRequest().permitAll().and().httpBasic();
//        }
//    }
}
