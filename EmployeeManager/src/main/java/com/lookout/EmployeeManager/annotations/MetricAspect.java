package com.lookout.EmployeeManager.annotations;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

@Aspect
@Component
public class MetricAspect{

    Long startTime;
    Long endTime;

    String methodName;
    @Around("@annotation(Metric)")
    public Object trace(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        methodName = proceedingJoinPoint.toString();
        Object result = proceedingJoinPoint.proceed();
        return result;
    }

    @Before("@annotation(Metric)")
    public void traceBefore() throws Throwable {
        startTime = System.currentTimeMillis();
    }

    @After("@annotation(Metric)")
    public void traceAfter() throws Throwable {
        endTime = System.currentTimeMillis();
        System.out.println("The Runtime of "+ methodName +" method was : " + (endTime-startTime) + " milliseconds.");
    }
}
