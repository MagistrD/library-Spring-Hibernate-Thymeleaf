//package com.itsm.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(securedEnabled = true)
//public class SecurityConfig /*extends WebSecurityConfigurerAdapter*/ {
//
////    @Autowired
////    private UserDetailsServiceImpl userDetailsService;
////
////    public void registerGlobalAuthentication(AuthenticationManagerBuilder auth) throws Exception {
////        auth.userDetailsService(userDetailsService);
////    }
////
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http.csrf()
////                .disable()
////                .authorizeRequests()
////                .antMatchers("/../resources", "/**").permitAll()
////                .anyRequest().permitAll()
////                .and();
////
////        http.formLogin()
////                .loginPage("/../webapp/WEB-INF/pages/login.jsp")
////                .loginProcessingUrl("/j_spring_security_check")
////                .failureUrl("/login?error")
////                .usernameParameter("j_username")
////                .passwordParameter("j_password")
////                .permitAll();
////        http.logout()
////                .permitAll()
////                .logoutUrl("/logout")
////                // указываем URL при удачном логауте
////                .logoutSuccessUrl("/login?logout")
////                // делаем не валидной текущую сессию
////                .invalidateHttpSession(true);
////    }
//}
