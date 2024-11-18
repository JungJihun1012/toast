package kr.hs.sdh.toast.config;

import com.mysql.cj.protocol.AuthenticationProvider;
import kr.hs.sdh.toast.entity.User;
import kr.hs.sdh.toast.provider.AccountAthenticationProvider;
import kr.hs.sdh.toast.repository.UserRepository;
import kr.hs.sdh.toast.service.UserService;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.util.Set;

@Configuration
public class SecurityConfiguration {

    private final UserRepository userRepository;

    public SecurityConfiguration(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(registry -> {
                    registry.requestMatchers("/login", "/register").anonymous()
                            .requestMatchers("/image/**").permitAll()
                            .anyRequest().authenticated();
                })
                .formLogin(
                        config ->
                                config.loginPage("/login")
                                        .loginProcessingUrl("/user")
                                        .defaultSuccessUrl("/login")
                                        .usernameParameter("userId")
                                        .passwordParameter("userPassword")
                )
                .userDetailsService(userid -> {
                    User user = this.userRepository.findById(userid);

                    if(userid == null) {
                        throw new UsernameNotFoundException("User not found");
                    }

                    return org.springframework.security.core.userdetails.User.withUsername(user.getUserId())
                            .password(user.getUserPassword())
                            .build();
                })
                .build();
    }
    @Bean
    PasswordEncoder passwordEncoder() {
        return new PasswordEncoder() {
            @Override
            public String encode(CharSequence rawPassword) {
                return rawPassword.toString();
            }

            @Override
            public boolean matches(CharSequence rawPassword, String encodedPassword) {
                return encodedPassword.contentEquals(rawPassword);
            }
        };
    }
}
