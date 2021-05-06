package Tugas8;

abstract class Character {
    private int defense , attack, hp;

    public Character(int defense, int attack, int hp) {
        this.defense = defense;
        this.attack = attack;
        this.hp = hp;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void info(){
        System.out.println("Class   : " + this.getClass().getSimpleName());
        System.out.println("HP      : " + this.hp);
        System.out.println("Attack  : " + this.attack);
        System.out.println("Defense : " + this.defense);
    }

    abstract boolean attack();

    public void receiveDamage(int damage){
        int dmg = damage - defense;
        this.hp -= dmg;
    }
}
