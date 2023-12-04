package it.Team3.PCBuilder.admin.security;

import it.Team3.PCBuilder.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    UserService userService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    protected SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                //csrf disabilita token, quindi lascia meno sicurezza ma evita problemi durante i test
//				metodo alternativo suggerito dall'IDE
//				.csrf(AbstractHttpConfigurer::disable)
                .csrf(c -> c.disable())
//                .csrf(csfr -> csfr.ignoringRequestMatchers("/register"))
                .authorizeHttpRequests((authz) -> authz
                        .requestMatchers("/cpu/**").permitAll()
                        .requestMatchers("/ram/**").permitAll()
                        .requestMatchers("/motherboard/**").permitAll()
                        .requestMatchers("/case/**").permitAll()
                        .requestMatchers("/gpu/**").permitAll()
                        .requestMatchers("/cpucooler/**").permitAll()
                        .requestMatchers("/storage/**").permitAll()
                        .requestMatchers("/powersupply/**").permitAll()
                        .requestMatchers("/buildcomputer/**").permitAll()
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN")
                        .anyRequest().authenticated()
                );
        return http.build();
    }

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .userDetailsService(userService)
//                .passwordEncoder(passwordEncoder());
//    }
}