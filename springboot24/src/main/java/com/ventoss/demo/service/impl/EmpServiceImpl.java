package com.ventoss.demo.service.impl;

import com.ventoss.demo.bean.Emp;
import com.ventoss.demo.mapper.EmpMapper;
import com.ventoss.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Date:2022/8/11
 * Author:Vent
 * Description:
 **/
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpMapper empMapper;


    public Emp getById(Integer eid) {
        return empMapper.getById(eid);
    }


    public void insert(Emp temp) {
        empMapper.insert(temp);
    }
}
