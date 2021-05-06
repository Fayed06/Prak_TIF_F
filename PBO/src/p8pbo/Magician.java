
package p8pbo;

public class Magician extends Character{
    
    Magician(){
        super.setHP(100);
        super.setAttack(60);
        super.setDefense(10);
    }
    
    @Override
    boolean attack() {
        int chance = (int) (100 * Math.random());
        return chance < 35;
    }
    
}
