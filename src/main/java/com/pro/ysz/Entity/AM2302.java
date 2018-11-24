package com.pro.ysz.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AM2302")
public class AM2302 {
    private String time;
    private float temperature;//温度
    private float humidity;//湿度
    @Id
    @GeneratedValue
    private int id;

    public AM2302(){}

    public AM2302(float temperature,float humidity,String time){
        this.temperature = temperature;
        this.humidity = humidity;
        this.time = time;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime(){
        return this.time;
    }

    public void setTime(String time){
        this.time =time;
    }
}
