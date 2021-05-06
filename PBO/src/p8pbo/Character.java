
package p8pbo;

abstract class Character {
    private int defense, attack, HP;
    
    abstract boolean attack();
    
    public void receiveDamage(int damage){
        int dmg = damage - defense;
        this.HP -= dmg;
    }
    
    public void info(){
        System.out.println("Class   : " + this.getClass().getSimpleName());
        System.out.println("HP      : " + this.HP);
        System.out.println("Attack  : " + this.attack);
        System.out.println("Defense : " + this.defense);
    }
    
    public void setDefense(int defense){
        this.defense = defense;
    }
    
    public int getDefense(){
        return defense;
    }
    
    public void setAttack(int attack){
        this.attack = attack;
    }
    
    public int getAttack(){
        return attack;
    }
    
    public void setHP(int HP){
        this.HP = HP;
    }
    
    public int getHP(){
        return HP;
    }
}
