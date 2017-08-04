package com.weiyi.repository;

import com.weiyi.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by weiyi on 2017/8/3/003.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>{

    //按照格式写才能查询
    public List<Girl> findByAge(Integer age);
}
