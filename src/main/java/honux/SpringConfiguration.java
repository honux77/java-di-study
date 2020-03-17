package honux;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfiguration {

    @Bean
    public Turtle turtle(Move move) {
        return new Turtle();
    }

    @Bean
    public FastStep fastStep() {
        return new FastStep();
    }

    @Bean
    public ReadyAspect readyAspect() {
        return new ReadyAspect();
    }
}

