package ru.otus.spring.logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import ru.otus.spring.service.PersonServiceImpl;

import java.util.Arrays;

@Component
@Aspect
public class LoggingAspect {

    @Around("execution(* ru.otus.spring.dao.PersonDaoSimple.*(..))")
    public Object logBefore(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Прокси : " + joinPoint.getThis().getClass().getName());
        System.out.println("Класс : " + joinPoint.getTarget().getClass().getName());

        System.out.println("Вызов метода : " + joinPoint.getSignature().getName());
        System.out.println("Аргументы метода " + Arrays.toString(joinPoint.getArgs()));
        var res = joinPoint.proceed();
        System.out.println("После вызова метода : " + res);

        return res;

    }
}
