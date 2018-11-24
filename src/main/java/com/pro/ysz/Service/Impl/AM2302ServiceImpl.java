package com.pro.ysz.Service.Impl;

import com.pro.ysz.Dao.AM2302Dao;
import com.pro.ysz.Entity.AM2302;
import com.pro.ysz.Service.AM2302Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AM2302ServiceImpl implements AM2302Service {
    @Autowired
    AM2302Dao am2302Dao;

    @Override
    public int add(AM2302 am2302) {
        return am2302Dao.add(am2302);
    }

    @Override
    public List<AM2302> get() {
        return am2302Dao.get();
    }
}
