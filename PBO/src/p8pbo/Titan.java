
package p8pbo;

public class Titan extends Character{

    Titan(){
        super.setHP(200);
        super.setAttack(45);
        super.setDefense(0);
    }
    
    @Override
    boolean attack() {
        int chance = (int) (10 * Math.random());
        return chance < 4;
    }
    
}
