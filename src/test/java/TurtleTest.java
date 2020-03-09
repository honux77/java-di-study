import honux.Turtle;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

public class TurtleTest {

    private Turtle turtle;

    @BeforeEach
    void setup() {
        turtle = new Turtle();

    }

    @Test
    void 이동() {
        assertThat(turtle.move()).isEqualTo(1);
    }

    @Test
    void 정지() {
        assertThat(turtle.move()).isEqualTo(0);
    }

}