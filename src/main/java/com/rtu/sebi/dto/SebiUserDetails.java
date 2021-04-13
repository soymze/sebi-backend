package com.rtu.sebi.dto;

import com.rtu.sebi.document.SebiUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class SebiUserDetails implements UserDetails {

    private SebiUser user;

    public SebiUserDetails(SebiUser user) {
        this.user = user;
    }

    public SebiUser getUser() {
        return user;
    }

    public void setUser(SebiUser user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return getUser().getPassword();
    }

    @Override
    public String getUsername() {
        return getUser().getSebiId();
    }

    @Override
    public boolean isAccountNonExpired() {
        return getUser().isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return getUser().isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return getUser().isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return getUser().isEnabled();
    }
}