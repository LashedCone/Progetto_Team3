package it.Team3.PCBuilder.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

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
                        .requestMatchers( "/buildcomputer/**").permitAll()
                        .requestMatchers("/security/**").permitAll()
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .requestMatchers("/user/**").hasAnyRole("USER", "ADMIN")
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    public UserDetailsService users() {
        // The builder will ensure the passwords are encoded before saving in memory
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        UserDetails user = User.builder()
                .username("user")
                .password("{noop}password") //{noop} per evitare la codifica della password
                .roles("USER")
                .build();
        UserDetails admin = User.builder()
                .username("admin")
                .password(encoder.encode("password"))
                .roles("USER", "ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user, admin);
    }
}