package com.ventoss.demo.service;

import com.ventoss.demo.bean.Emp;

/**
 * Date:2022/8/12
 * Author:Vent
 * Description:
 **/
public interface EmpService {

    public Emp getById(Integer eid);

    public void insert(Emp temp);

}
