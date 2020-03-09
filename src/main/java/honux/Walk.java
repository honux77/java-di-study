package honux;

import java.util.Random;

public class Walk implements Move {

    private Random r = new Random();

    @Override
    public int forward() {
        int p = r.nextInt(2);
        if (p < 1) {
            return 1;
        }
        return 0;
    }

    @Override
    public String effect() {
        return "엉금엉금";
    }
}
