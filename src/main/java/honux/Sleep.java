package honux;

public class Sleep implements Move {

    @Override
    public int forward() {
        return 0;
    }

    @Override
    public String effect() {
        return "쿨쿨...";
    }
}
