package com.ventoss.demo;

import com.ventoss.demo.bean.User;
import com.ventoss.demo.mapper.UserMapper;
import com.ventoss.demo.service.impl.EmpServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Autowired
    EmpServiceImpl empServiceImpl;

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        Long aLong = jdbcTemplate.queryForObject("select count(*) from t_dept", Long.class);
        log.info("计数：{}",aLong);

        User byId = userMapper.selectById(1);

        log.info("成员为：{}", byId);



    }

}
