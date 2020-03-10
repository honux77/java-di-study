package honux;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public Turtle turtle(Move move) {
        return new Turtle();
    }

    @Bean
    public FastStep fastStep() {
        return new FastStep();
    }
}

