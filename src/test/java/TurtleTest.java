import honux.Move;
import honux.Turtle;
import honux.Walk;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

public class TurtleTest {


    @BeforeEach
    void setup() {
        System.out.println("테스트 시작");
    }

    @Test
    void 항상_전진() {
        Turtle t = new Turtle(new Move(){
            @Override
            public int forward() {
                return 1;
            }

            @Override
            public String effect() {
                return "착착";
            }
        });
        assertThat(t.go(100)).isEqualTo(100);
    }

    @Test
    void 항싱_기권() {
        Turtle t = new Turtle(new Walk(){
            @Override
            public int forward() {
                return 0;
            }
        });
        assertThat(t.go(100)).isEqualTo(999);
    }

    @Test
    void 평범한_거북이() {
        Turtle t = new Turtle(new Walk());
        assertThat(t.go(100)).isBetween(100, 400);
    }

}