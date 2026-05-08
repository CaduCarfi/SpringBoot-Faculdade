package com.spring.security.repositories;

import com.spring.security.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

    UserDetails ;findByLogin(String role);
}
