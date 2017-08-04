package com.weiyi.controller;

import com.weiyi.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by weiyi on 2017/8/3/003.
 */
//@RestController
@Controller
public class HelloController {

    @Value("${girl.cupSize}")
    private String cupSize;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String Hello(){
        //return girlProperties.toString();
        return "index";
    }
}
