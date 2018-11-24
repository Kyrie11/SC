package com.pro.ysz.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="mq7")
public class MQ7 {

    @Id
    @GeneratedValue
    int id;

    int data;
    String time;
    public MQ7(){}
    
    public MQ7(int data,String time){
        this.data = data;
        this.time = time;
    }

    public int getData(){
        return this.data;
    }

    public String getTime(){
        return this.time;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setTime(String time){
        this.time = time;
    }

}
