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

    public static void main(String[] args) {
        Turtle t = new Turtle();
        for (int i = 0; i < 10; i++) {
            System.out.print(t.move());
        }
        System.out.println();
    }
}
