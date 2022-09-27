package com.io.prof_hider.DAO;

import com.io.prof_hider.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String userName);
    boolean existsByUsername(String username);
}
