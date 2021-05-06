package Tugas8;

public class Magician extends Character{
    public Magician() {
        super(10, 60, 100);
    }

    @Override
    public int getDefense() {
        return super.getDefense();
    }

    @Override
    public void setDefense(int defense) {
        super.setDefense(defense);
    }

    @Override
    public int getAttack() {
        return super.getAttack();
    }

    @Override
    public void setAttack(int attack) {
        super.setAttack(attack);
    }

    @Override
    public int getHp() {
        return super.getHp();
    }

    @Override
    public void setHp(int hp) {
        super.setHp(hp);
    }

    @Override
    public void info() {
        super.info();
    }

    @Override
    boolean attack() {
        int gacha = (int) (100 * Math.random());
        return gacha < 35;
    }

    @Override
    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
    }

}
