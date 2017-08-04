package com.weiyi.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.weiyi.domain.Result;
import com.weiyi.repository.GirlRepository;
import com.weiyi.domain.Girl;
import com.weiyi.service.GirlService;
import com.weiyi.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by weiyi on 2017/8/3/003.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;

    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    @RequestMapping(value = "/girls/{age}")
    public List<Girl> getGirlsByAge(@PathVariable("age") Integer age){
        return  girlRepository.findByAge(age);
    }

    @PostMapping("/girls")
    public Result<Girl> girlAdd(@Valid Girl girl, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtil.success(girlRepository.save(girl));
    }

    @PostMapping("/girls/two")
    public void girlTwo(){
        girlService.insertTwo();
    }

    @GetMapping("girls/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception {
            girlService.getAge(id);
    }
}
