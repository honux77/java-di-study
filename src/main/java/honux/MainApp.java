package honux;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public final static int DISTANCE = 100;
    private static final Logger logger
            = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) {
        logger.info("======== {} Start =============", MainApp.class.getSimpleName());

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Turtle t = (Turtle) ctx.getBean("turtle");
        int result = t.go(DISTANCE);
        logger.debug("race result: {}", result);
        logger.info("======== End ============");

    }
}
