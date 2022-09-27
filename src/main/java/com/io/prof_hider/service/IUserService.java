package com.io.prof_hider.service;

import com.io.prof_hider.domaine.RoleVo;
import com.io.prof_hider.domaine.UserVo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {
    void save(UserVo user);
    void save(RoleVo role);
    List<UserVo> getAllUsers();
    List<RoleVo> getAllRoles();
    RoleVo getRoleByName(String role);
    void cleanDataBase();
    boolean existsByUsername(String username);
    UserVo findByUsername(String username);
}
