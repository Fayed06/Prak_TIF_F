package Tugas8;

public class Warrior extends Character {
    public Warrior() {
        super(30, 25, 80);
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
        int gacha = (int) (10 * Math.random());
        return gacha < 6;
    }

    @Override
    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
    }
}
