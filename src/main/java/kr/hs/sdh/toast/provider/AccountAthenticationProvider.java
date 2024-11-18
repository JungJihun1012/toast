package kr.hs.sdh.toast.provider;

import org.springframework.security.authentication.dao.DaoAuthenticationProvider;

public final class AccountAthenticationProvider extends DaoAuthenticationProvider {
    public AccountAthenticationProvider() {
        super.hideUserNotFoundExceptions = false;
    }
}
