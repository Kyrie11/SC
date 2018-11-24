package com.pro.ysz.Dao.Impl;

import com.pro.ysz.Dao.AM2302Dao;
import com.pro.ysz.Entity.AM2302;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AM2302Impl implements AM2302Dao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(AM2302 am2302) {
        return jdbcTemplate.update("insert into AM2302(temperature,humidity,time) values(?,?,?)",am2302.getTemperature(),am2302.getHumidity(),am2302.getTime());
    }

    @Override
    public List<AM2302> get() {
        return jdbcTemplate.query("select * from AM2302 order by time desc limit 10",new Object[]{},new BeanPropertyRowMapper<>(AM2302.class));
    }
}
