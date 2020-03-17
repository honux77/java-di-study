package honux;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ReadyAspect {
    @Before("execution(* honux.Animal.go(..))")
    public void readyAndGo(JoinPoint joinPoint) {
        System.out.println("준비, 땅!");
    }

    @After("execution(* honux.Animal.go(..))")
    public void finish(JoinPoint joinPoint) {
        System.out.println("경기가 끝났습니다!");
    }
}
