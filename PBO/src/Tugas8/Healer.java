package Tugas8;

public class Healer extends Character{
    private boolean skill = true;
    public Healer() {
        super(10, 10, 70);
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
        if(skill){
            skill = false;
        }else{
            skill = true;
            heal();
        }
        int chance = (int) (100 * Math.random());
        return chance < 85;    }

    @Override
    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
    }

    public void heal(){
        System.out.println("SKill Heal Aktif");
        super.setHp(super.getHp() + super.getAttack());
    }

}
