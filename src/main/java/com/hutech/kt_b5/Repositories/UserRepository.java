package com.hutech.kt_b5.Repositories;

import com.hutech.kt_b5.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, String> {
}
