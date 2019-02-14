package com.feng.aspect;

import com.feng.excetion.BusinessException;
import org.apache.commons.lang.time.DateUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * @desc：日志切面
 * @title：LogAspect
 * @author: tianfengluyao
 * @date: 2019/2/14 15:25
 */
@Aspect
@Configuration
public class LogAspect {


    /**
     * 切入点：
     * execution - 匹配方法执行的连接点，这是你将会用到的Spring的最主要的切入点指示符。
     *
     * within - 限定匹配特定类型的连接点（在使用Spring AOP的时候，在匹配的类型中定义的方法的执行）。
     *
     * this - 限定匹配特定的连接点（使用Spring AOP的时候方法的执行），其中bean reference（Spring AOP 代理）是指定类型的实例。
     *
     * target - 限定匹配特定的连接点（使用Spring AOP的时候方法的执行），其中目标对象（被代理的应用对象）是指定类型的实例。
     *
     * args - 限定匹配特定的连接点（使用Spring AOP的时候方法的执行），其中参数是指定类型的实例。
     *
     * @target - 限定匹配特定的连接点（使用Spring AOP的时候方法的执行），其中正执行对象的类持有指定类型的注解。
     *
     * @args - 限定匹配特定的连接点（使用Spring AOP的时候方法的执行），其中实际传入参数的运行时类型持有指定类型的注解。
     *
     * @within - 限定匹配特定的连接点，其中连接点所在类型已指定注解（在使用Spring AOP的时候，所执行的方法所在类型已指定注解）。
     *
     * @annotation - 限定匹配特定的连接点（使用Spring AOP的时候方法的执行），其中连接点的主题持有指定的注解。
     */
    @Pointcut("execution(* com.feng.service.HelloService.sayHello*(..))")
    public void excuteService(){}

    /**
     * 前置通知
     */
//    @Before("excuteService()")
//    public void printTimeLog(){
//        System.out.println("it is:"+ DateUtils.format(new Date(),DateUtils.ISO8601_DATETIME_PATTERN));
//    }

    /**
     * 异常通知
     */
//    @AfterThrowing(throwing = "ex",pointcut = "execution(* com.feng.service.*.*(..))")
//    public void returnStr(BusinessException ex){
//        System.out.println("BusinessException be found!");
//    }

    /**
     * 环绕通知
     */
     @Around("excuteService()")
     public String printTimeAroundLog(ProceedingJoinPoint thisJoinPoint){
         try {
             System.out.println("around" + DateUtils.format(new Date(),DateUtils.ISO8601_DATETIME_PATTERN));
             thisJoinPoint.proceed ();
         } catch (BusinessException ex){
             return "lsdasdasdasd";
         }
         catch (Throwable throwable) {
             throwable.printStackTrace();
         }
         return null;
     }
}
