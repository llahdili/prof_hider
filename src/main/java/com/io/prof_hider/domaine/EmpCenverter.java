package com.io.prof_hider.domaine;

import com.io.prof_hider.entities.Emp;

import java.util.ArrayList;
import java.util.List;

public class EmpCenverter {
    public static EmpVo toVo(Emp bo){
        if(bo==null || bo.getId() == null)
            return null;
        EmpVo vo = new EmpVo();
        vo.setId(bo.getId());
        vo.setName(bo.getName());
        vo.setSalary(bo.getSalary());
        vo.setFunction(bo.getFunction());
        return vo;
    }
    public static Emp toBo(EmpVo vo) {
        Emp bo = new Emp();
        bo.setId(vo.getId());
        bo.setName(vo.getName());
        bo.setSalary(vo.getSalary());
        bo.setFunction(vo.getFunction());
        return bo;
    }
    public static List<EmpVo> toListVo(List<Emp> listBo) {
        List<EmpVo> listVo = new ArrayList<>();
        for (Emp emp : listBo) {
            listVo.add(toVo(emp));
        }
        return listVo;
    }
}
