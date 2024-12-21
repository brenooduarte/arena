package com.arena.repositories;


import com.arena.domain.user.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
@Repository
public interface UserRepository {
    Optional<User> findByEmail(String email);
}