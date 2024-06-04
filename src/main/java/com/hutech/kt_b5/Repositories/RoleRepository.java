package com.hutech.kt_b5.Repositories;

import com.hutech.kt_b5.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RoleRepository extends JpaRepository<Role, String> {
}
