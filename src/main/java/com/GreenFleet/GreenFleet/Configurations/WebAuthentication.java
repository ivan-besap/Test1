//package com.GreenFleet.GreenFleet.Configurations;
//
//
//import com.GreenFleet.GreenFleet.Models.Company.Employee;
//import com.GreenFleet.GreenFleet.Models.TransactionDetail.Client;
//import com.GreenFleet.GreenFleet.Repositories.Company.EmployeeRepository;
//import com.GreenFleet.GreenFleet.Repositories.TransactionDetail.ClientRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//public class WebAuthentication extends GlobalAuthenticationConfigurerAdapter {
//    @Autowired
//   private EmployeeRepository EmployeeRepository;
//    @Autowired
//    private ClientRepository clientRepository;
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//    }
//
//    @Override
//    public void init(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(inputName -> {
//            Employee employee = EmployeeRepository.findByEmail(inputName);
//            Client client = clientRepository.findByEmail(inputName);
//
//            if (employee != null) {
//                if (employee.getEmail().contains("@admin.com")){
//                    return new User(employee.getEmail(), employee.getPassword(),
//                            AuthorityUtils.createAuthorityList("ADMIN"));
//                }
//                return new User(employee.getEmail(), employee.getPassword(),
//                        AuthorityUtils.createAuthorityList("employee"));
//            }
//            if (client != null) {
//                if (client.getEmail().contains("@admin.com")){
//                    return new User(client.getEmail(), client.getPassword(),
//                            AuthorityUtils.createAuthorityList("ADMIN"));
//                }
//                return new User(client.getEmail(), client.getPassword(),
//                        AuthorityUtils.createAuthorityList("CLIENT"));
//            }
//            else {
//                throw new UsernameNotFoundException("Unknown user: " + inputName);
//            }
//        });
//    }
//}