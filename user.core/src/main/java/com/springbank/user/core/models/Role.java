package com.springbank.user.core.models;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    READ_PRIVILAGE,WRITE_PRIVILAGE;

    @Override
    public String getAuthority() {
        return name();
    }
}
