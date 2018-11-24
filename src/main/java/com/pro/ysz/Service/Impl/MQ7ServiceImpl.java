package com.pro.ysz.Service.Impl;

import com.pro.ysz.Dao.MQ7Dao;
import com.pro.ysz.Entity.MQ7;
import com.pro.ysz.Service.MQ7Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MQ7ServiceImpl implements MQ7Service {

    @Autowired
    MQ7Dao mq7Dao;

    @Override
    public List<MQ7> get() {
        return mq7Dao.get();
    }

    @Override
    public int add(MQ7 mq7){
        return mq7Dao.add(mq7);
    }
}
