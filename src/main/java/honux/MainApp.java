package honux;

public class MainApp {
    public static void main(String[] args) {
        Turtle t = new Turtle();
        for (int i = 0; i < 10; i++) {
            System.out.print(t.move());
        }
        System.out.println();
    }
}
