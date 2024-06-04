package com.hutech.kt_b5.Services;

import com.hutech.kt_b5.Entities.Role;
import com.hutech.kt_b5.Repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServices {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
    public  void addRole(Role role) {
        roleRepository.save(role);
    }
}
