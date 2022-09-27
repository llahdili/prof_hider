package com.io.prof_hider.DAO;

import com.io.prof_hider.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {

    List<Role> findAll();
    List<Role> findByRole(String role);
}
