package com.weiyi.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by weiyi on 2017/8/3/003.
 */
@Aspect
@Component
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);
    //@Before("execution(public * com.weiyi.controller.GirlController.girlList(..))") 只对girlList方法切面
    //@Before("execution(public * com.weiyi.controller.GirlController.*(..))")
    @Pointcut("execution(public * com.weiyi.controller.GirlController.*(..))") //定义切面
    public void log(){
        //System.out.println("11111111");
    }
    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url
        logger.info("url={}",request.getRequestURL());
        //method
        logger.info("method={}",request.getMethod());
        //ip
        logger.info("ip={}",request.getRemoteAddr());
        //classmethod
        logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        //args
        logger.info("args={}",joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter(){
        logger.info("2222222");
    }
    @AfterReturning(returning ="object",pointcut = "log()")
    public void doAfterReturning(Object object){
        logger.info("response={}",object);
    }
}
