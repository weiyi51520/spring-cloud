package com.weiyi.service;

import com.weiyi.enums.ResultEnum;
import com.weiyi.exception.GirlException;
import com.weiyi.repository.GirlRepository;
import com.weiyi.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by weiyi on 2017/8/3/003.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional //spring控制事务
    public void insertTwo(){
        Girl girlA = new Girl("B",20);
        girlRepository.save(girlA);
        Girl girlB = new Girl("C",25);
        girlRepository.save(girlB);
    }

    public Girl findOne(Integer id){
        return girlRepository.findOne(id);
    }

    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        if(age<10){
            throw  new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if(age<16){
            throw  new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }


}
