package realSpring.aopAdvanced.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import realSpring.aopAdvanced.services.DBRuntimeException;

@Component
@Aspect
public class ExceptionHandlerAspect {

    @AfterThrowing(pointcut = "execution(* realSpring.aopAdvanced.dao.*.*(..))",throwing = "ex")
    public void handleDbException (DBRuntimeException ex){
        System.out.println("sending mails " + ex.getMessage());
    }
}
