package com.io.prof_hider.service;

import com.io.prof_hider.DAO.EmpRepository;
import com.io.prof_hider.domaine.EmpCenverter;
import com.io.prof_hider.domaine.EmpVo;
import com.io.prof_hider.entities.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements IEmpService {
    @Autowired
    private EmpRepository empRepository;
    @Override
    public List<EmpVo> getEmployees() {
        List<Emp> list = empRepository.findAll();
        return EmpCenverter.toListVo(list);
    } @Override
    public void save(EmpVo emp) {
        empRepository.save(EmpCenverter.toBo(emp));
    } @Override
    public EmpVo getEmpById(Long id) {
        boolean trouve = empRepository.existsById(id);
        if (!trouve)
            return null;
        return EmpCenverter.toVo(empRepository.getById(id));
    } @Override
    public void delete(Long id) {
        empRepository.deleteById(id);
    }
    @Override
    public List<EmpVo> findBySalary(float salary) {
        List<Emp> list = empRepository.findBySalary(salary);
        return EmpCenverter.toListVo(list);
    } @Override
    public List<EmpVo> findByFunction(String function) {
        List<Emp> list = empRepository.findByFunction(function);
        return EmpCenverter.toListVo(list);
    }
    @Override
    public List<EmpVo> findBySalaryAndFunction(float salary, String function) {
        List<Emp> list = empRepository.findBySalaryAndFunction(salary, function);
        return EmpCenverter.toListVo(list);
    } @Override
    public EmpVo getEmpHavaingMaxSalary() {
        return EmpCenverter.toVo(empRepository.getEmpHavaingMaxSalary());
    } @Override
    public List<EmpVo> findAll(int pageId, int size) {
        Page<Emp> result = empRepository.findAll(PageRequest.of(pageId, size, Sort.Direction.ASC, "name"));
        return EmpCenverter.toListVo(result.getContent());
    } @Override
    public List<EmpVo> sortBy(String fieldName) {
        return EmpCenverter.toListVo(empRepository.findAll(Sort.by(fieldName)));
    }
}
