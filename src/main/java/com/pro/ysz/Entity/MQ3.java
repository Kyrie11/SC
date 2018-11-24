package com.pro.ysz.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="mq3")
public class MQ3 {
    @GeneratedValue
    @Id
    int id;
    int data;
    String time;


    public MQ3(){}

    public MQ3(int data,String time){
        this.data = data;
        this.time = time;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setTime(String time){
        this.time = time;
    }

    public int getData(){
        return this.data;
    }

    public String getTime(){
        return this.time;
    }
}
