package honux;

import java.util.Random;

public class Turtle {

    private Random random = new Random();

    public int move() {
        int p = random.nextInt(2);
        if (p < 1) {
            return 1;
        }
        return 0;
    }

}
