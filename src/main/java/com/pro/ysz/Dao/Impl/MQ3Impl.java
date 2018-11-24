package com.pro.ysz.Dao.Impl;

import com.pro.ysz.Dao.MQ3Dao;
import com.pro.ysz.Entity.MQ3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class MQ3Impl implements MQ3Dao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int add(MQ3 mq3) {
        return jdbcTemplate.update("insert into mq3(time,data) values(?,?)",mq3.getTime(),mq3.getData());
    }

    @Override
    public List<MQ3> get() {
        return jdbcTemplate.query("select * from mq3 order by time desc limit 10",new Object[]{},new BeanPropertyRowMapper<>(MQ3.class));
    }

}
