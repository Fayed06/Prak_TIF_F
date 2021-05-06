package Tugas8;

public class Titan extends Character {
    public Titan() {
        super(0, 45, 200 );
    }

    @Override
    boolean attack() {
        int gacha = (int) (10 * Math.random());
        return gacha < 4;
    }

    @Override
    public void info() {
        super.info();
    }
}
