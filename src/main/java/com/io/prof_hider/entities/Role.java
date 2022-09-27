package com.io.prof_hider.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@Table(name = "role")
@NoArgsConstructor
public class Role {
    @Id @GeneratedValue(strategy = AUTO)
    @Column(name = "role_id")
    private Long id;
    @Column(name = "role")
    private String role;

    public Role(String role) {
        this.role = role;
    }

}
