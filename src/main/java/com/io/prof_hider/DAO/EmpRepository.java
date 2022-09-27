package com.io.prof_hider.DAO;

import com.io.prof_hider.entities.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpRepository extends JpaRepository<Emp, Long> {
    List<Emp> findBySalary(float salary);

    List<Emp> findByFunction(String designation);

    List<Emp> findBySalaryAndFunction(float salary, String function);

    @Query("SELECT e from Emp e where e.salary=(select MAX(salary) as salary FROM Emp)")
    Emp getEmpHavaingMaxSalary();
}
