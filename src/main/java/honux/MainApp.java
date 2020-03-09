package honux;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public final static int DISTANCE = 100;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        Turtle t = (Turtle) ctx.getBean("turtle");
        t.go(DISTANCE);
    }
}
