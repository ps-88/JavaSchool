package realSpring.quoters;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class QuoterAspect {

    @Before("execution(* realSpring.quoters..*.say*(..))")
    public void beforeSayMethods(JoinPoint joinPoint) {

        System.out.print(joinPoint.getTarget().getClass().getSimpleName()+ " Say quote: ");
    }
}

