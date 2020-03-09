package honux;

public class Turtle {

    private Move move;

    public void setMove(Move move) {
        this.move = move;
    }

    public int go(int finalLength) {
        int time = 0;
        int distance = 0;
        while (distance < finalLength && time != 999) {
            distance += move.forward();
            time++;
        }

        if (time == 999) {
            System.out.println(String.format("%s 움직여서 %d초만에 기권!", move.effect(), time));
            return time;
        }
        System.out.println(String.format("%s 움직여서 %d초 걸렸습니다!", move.effect(), time));
        return time;
    }

}
