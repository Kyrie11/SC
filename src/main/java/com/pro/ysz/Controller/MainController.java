package com.pro.ysz.Controller;

import com.pro.ysz.Entity.AM2302;
import com.pro.ysz.Entity.MQ3;
import com.pro.ysz.Entity.MQ7;
import com.pro.ysz.Service.AM2302Service;
import com.pro.ysz.Service.MQ3Service;
import com.pro.ysz.Service.MQ7Service;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    MQ3Service mq3Service;

    @Autowired
    MQ7Service mq7Service;

    @Autowired
    AM2302Service am2302Service;

    @RequestMapping("/")
    public String visit(Model model){
        List<MQ3> mq3s = mq3Service.get();
        List<MQ7> mq7s = mq7Service.get();
        List<AM2302> am2302s = am2302Service.get();
        model.addAttribute("mq3s",mq3s);
        model.addAttribute("mq7s",mq7s);
        model.addAttribute("am2302s",am2302s);
        return "index";
    }

    @RequestMapping(value="/test",method = RequestMethod.GET)
    @ResponseBody
    public String test(){
        return "Success";
    }


    @RequestMapping(value="/addMq3")
    @ResponseBody
    public MQ3 addMq3(@RequestParam(value="data") int data){
        SimpleDateFormat timeFormat =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = timeFormat.format(System.currentTimeMillis());
        MQ3 mq3 = new MQ3(data,time);
        mq3Service.add(mq3);
        return mq3;
    }

    @RequestMapping(value="/addMq7")
    @ResponseBody
    public MQ7 addMq7(@RequestParam(name="data")int data){
        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = timeFormat.format(System.currentTimeMillis());
        MQ7 mq7 = new MQ7(data,time);
        mq7Service.add(mq7);
        return mq7;
    }

    @RequestMapping(value="/addAM2302")
    @ResponseBody
    public AM2302 addAM2302(@RequestParam(name="temperature")float temperature,@RequestParam(name="humidity")float humidity){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = dateFormat.format(System.currentTimeMillis());
        AM2302 am2302 = new AM2302(temperature,humidity,time);
        am2302Service.add(am2302);
        return am2302;
    }
}


