package com.io.prof_hider.domaine;

import lombok.Data;

@Data
public class EmpVo {
    private Long id;
    private String name;
    private float salary;
    private String function;

    public  EmpVo(){
        super();
    }

    public EmpVo(Long id, String name, float salary, String function) {
        this(name,salary,function);
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.function = function;
    }

    public EmpVo(String name, float salary, String function) {
        super();
        this.name = name;
        this.salary = salary;
        this.function = function;
    }
}
