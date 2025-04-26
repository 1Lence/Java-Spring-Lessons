package org.example.javaspringlessons.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Aspect
@Component
@Slf4j
public class SomeAspect {
    @Value("${MyValues.someData}")
    private Integer timesToUse;

    @Pointcut("execution(String job(int))")
    public void someMethod() {}

    @Around("someMethod()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("======= Around Work Starts =======");
        timesToUse--;
        Object[] args = joinPoint.getArgs();
        args[0] = timesToUse;
        return joinPoint.proceed(args);
    }

    @Around("@annotation(org.example.javaspringlessons.annotation.RateLimited)")
    public Object rateLimited(ProceedingJoinPoint joinPoint) throws Throwable {
        if (timesToUse <= 0) {
            throw new ResponseStatusException(HttpStatus.TOO_MANY_REQUESTS, "Something went wrong");
        }
        return joinPoint.proceed();
    }
}