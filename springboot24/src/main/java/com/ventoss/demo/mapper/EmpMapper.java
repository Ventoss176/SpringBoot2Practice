package com.ventoss.demo.mapper;

import com.ventoss.demo.bean.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Date:2022/8/11
 * Author:Vent
 * Description:
 **/
@Mapper
public interface EmpMapper {


    @Select("select * from t_emp where eid=#{eid}")
    public Emp getById(Integer eid);

    public void insert(Emp temp);

}
