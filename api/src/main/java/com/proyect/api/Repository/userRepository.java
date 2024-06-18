package com.proyect.api.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyect.api.user;

@Repository
public interface userRepository extends JpaRepository<user, Long> {
    user findByEmail(String email);
}