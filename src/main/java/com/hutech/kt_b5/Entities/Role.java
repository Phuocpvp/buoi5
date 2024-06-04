package com.hutech.kt_b5.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Role {
    @Id
    private String role_id;
    private String role_name;

    @OneToMany(mappedBy = "Role")
    private List<User> users;
}
