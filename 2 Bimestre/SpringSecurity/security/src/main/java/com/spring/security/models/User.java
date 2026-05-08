package com.spring.security.models;

import com.spring.security.enums.UserRole;

import java.util.List;

@Entity
@Table(name = "USERS")
public class User implements UserDatails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;
    private UserRole role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(this.role == UserRole.ADMIN) return
            List.of(new SimpleGrantedAuthority("ADMIN"), new SimpleGrantedAuthority("USER"));
        else return List.of(new SImpleGrantedAuthority("USER"));
    }
}
