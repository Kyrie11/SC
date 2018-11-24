package com.pro.ysz.Dao.Impl;

import com.pro.ysz.Dao.MQ7Dao;
import com.pro.ysz.Entity.MQ7;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class MQ7Impl implements MQ7Dao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<MQ7> get() {
        return jdbcTemplate.query("select * from mq7 order by time desc limit 10",new Object[]{},new BeanPropertyRowMapper<>(MQ7.class));
    }

    @Override
    public int add(MQ7 mq7){
        return jdbcTemplate.update("insert into mq7(time,data) values(?,?)",mq7.getTime(),mq7.getData());
    }
}
