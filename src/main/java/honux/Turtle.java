package honux;

import org.springframework.beans.factory.annotation.Autowired;

public class Turtle implements Animal {

    @Autowired
    private Move move;

    @Override
    public int go(int distance) {
        int time = 0;
        int d = 0;
        while (d < distance && time != 999) {
            d += move.forward();
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
