package kr.hs.sdh.toast.config;

import kr.hs.sdh.toast.entity.BankAccount;
import kr.hs.sdh.toast.entity.Customer;
import kr.hs.sdh.toast.model.CustomerDetails;
import kr.hs.sdh.toast.repository.BankAccountRepository;
import kr.hs.sdh.toast.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.util.List;

@Configuration
public class SecurityConfiguration {

    private final UserRepository userRepository;
    private final BankAccountRepository bankAccountRepository;

    public SecurityConfiguration(UserRepository userRepository, BankAccountRepository bankAccountRepository) {
        this.userRepository = userRepository;
        this.bankAccountRepository = bankAccountRepository;
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
                                    .defaultSuccessUrl("/index ")
                                    .usernameParameter("userId")
                                    .passwordParameter("userPassword")
                )
                .userDetailsService(userid -> {
                    final Customer customer = this.userRepository.findById(userid);

                    if(customer == null) {
                        throw new UsernameNotFoundException("User not found");
                    }
                    final String identity = customer.getPeople().getIdentity();
                    final List<BankAccount> account = this.bankAccountRepository.findAllByIdentity(identity);

                    return new CustomerDetails(customer, account);

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
