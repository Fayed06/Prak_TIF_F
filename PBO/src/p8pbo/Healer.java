package p8pbo;

public class Healer extends Character{
    private boolean counter = true;
    
    Healer(){
        super.setHP(70);
        super.setAttack(10);
        super.setDefense(10);
    }
    
    @Override
    boolean attack() {
        if(counter){
            counter = false;
        }else{
            counter = true;
            heal();
        }
        int chance = (int) (100 * Math.random());
        return chance < 85;
    }
    
    void heal(){
        System.out.println("Character menggunakan heal");
        super.setHP(super.getHP() + super.getAttack());
    }
    
}