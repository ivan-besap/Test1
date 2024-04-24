//
//package com.GreenFleet.GreenFleet.Configurations;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.WebAttributes;
//import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//@EnableWebSecurity
//@Configuration
//public class WebAuthorization extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/api/login").permitAll()
//                .antMatchers("/**").permitAll()
//                .anyRequest().permitAll()
//                .and()
//
//                .formLogin()
//                .loginPage("/api/login")
//                .usernameParameter("email")
//                .passwordParameter("password")
//                .permitAll()
//                .and()
//
//                .logout()
//                .logoutUrl("/api/logout")
//                .deleteCookies("JSESSIONID")
//                .logoutSuccessHandler(new SimpleUrlLogoutSuccessHandler())
//                .and() // Aquí va el 'and' para continuar con la configuración
//
//                .csrf().disable()
//                .headers().frameOptions().disable()
//                .and()
//
//                .exceptionHandling()
//                .authenticationEntryPoint((req, res, exc) -> res.sendError(HttpServletResponse.SC_UNAUTHORIZED))
//                .and()
//
//                .formLogin()
//                .successHandler((req, res, auth) -> clearAuthenticationAttributes(req))
//                .failureHandler((req, res, exc) -> res.sendError(HttpServletResponse.SC_UNAUTHORIZED))
//                .and()
//
//                .logout()
//                .logoutSuccessHandler(new SimpleUrlLogoutSuccessHandler());
//    }
//
//    private void clearAuthenticationAttributes(HttpServletRequest request) {
//        HttpSession session = request.getSession(true);
//        if (session != null) {
//            session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
//        }
//    }
//}
