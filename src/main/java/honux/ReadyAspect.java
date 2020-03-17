package honux;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

@Aspect
public class ReadyAspect {

    private Logger logger = LoggerFactory.getLogger(ReadyAspect.class);

    @Before("execution(* honux.Animal.go(..))")
    public void start(JoinPoint joinPoint) {
        System.out.println("경기를 시작합니다!");
    }

    @Around("execution(* honux.Animal.go(..))")
    public Object readyAndGo(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object proceed = joinPoint.proceed();

        stopWatch.stop();
        logger.info(stopWatch.prettyPrint());

        return proceed;
    }

    @After("execution(* honux.Animal.go(..))")
    public void finish(JoinPoint joinPoint) {
        System.out.println("경기가 끝났습니다!");
    }
}
