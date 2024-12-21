package com.arena.domain.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String firstname;
    private final String name;
    private final String email;
    private final String password;

    public RegistrationRequest(String firstname, String name, String email, String password) {
        this.firstname = firstname;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
