package com.io.prof_hider.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private float salary;
    private String function;

    public Emp(String name, float salary, String function) {
        this.name = name;
        this.salary = salary;
        this.function = function;
    }
}
