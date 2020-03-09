package honux;

public class MainApp {

    public final static int DISTANCE = 100;

    public static void main(String[] args) {
        Move m = new Walk();
        Turtle t = new Turtle();
        t.setMove(m);
        t.go(DISTANCE);
    }
}
