package com.io.prof_hider.domaine;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@Table(name = "role")
public class Role {
    @Id @GeneratedValue(strategy = AUTO)
    @Column(name = "role_id")
    private Long id;
    @Column(name = "role")
    private String role;

}
