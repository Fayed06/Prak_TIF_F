
package p8pbo;

public class Warrior extends Character{
    
    Warrior(){
        super.setHP(80);
        super.setAttack(25);
        super.setDefense(30);
    }
    
    @Override
    boolean attack() {
        int chance = (int) (10 * Math.random());
        return chance < 6;
    }
    
}
