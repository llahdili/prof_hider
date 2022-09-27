package com.io.prof_hider.service;

import com.io.prof_hider.domaine.EmpVo;

import java.util.List;

public interface IEmpService {
    List<EmpVo> getEmployees();
    void save(EmpVo emp);
    EmpVo getEmpById(Long id);
    void delete(Long id);

    List<EmpVo> findBySalary(float salary);

    List<EmpVo> findByFunction(String designation);

    List<EmpVo> findBySalaryAndFunction(float salary, String function);

    EmpVo getEmpHavaingMaxSalary();
    //Pour la pagination
    List<EmpVo> findAll(int pageId, int size);
    //pour le tri
    List<EmpVo> sortBy(String fieldName);
}
