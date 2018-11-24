package com.pro.ysz.Service.Impl;

import com.pro.ysz.Dao.MQ3Dao;
import com.pro.ysz.Entity.MQ3;
import com.pro.ysz.Service.MQ3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MQ3ServiceImpl implements MQ3Service {
    @Autowired
    MQ3Dao mq3Dao;
    @Override
    public int add(MQ3 mq3) {
        return mq3Dao.add(mq3);
    }

    @Override
    public List<MQ3> get() {
        return mq3Dao.get();
    }
}
