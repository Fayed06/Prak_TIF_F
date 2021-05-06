
package p8pbo;
import java.util.Scanner;


public class P8PBO {
    public static Character player;
    public static String name;
    public static Titan jumbo = new Titan();

    static boolean isInt(String a){
        try { 
            Integer.parseInt(a); 
        } catch(NumberFormatException e) { 
            return false; 
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }
    
    static void battle(){
        int counter = 1;
        while((player.getHP() > 0) && (jumbo.getHP() > 0)){
            if(jumbo.attack()){
                player.receiveDamage(jumbo.getAttack());
            }
            if(player.attack()){
                jumbo.receiveDamage(player.getAttack());
            }
            System.out.println("==================Round" + counter +"======================");
            System.out.println("Titan's HP : " + jumbo.getHP());
            System.out.println(name + "'s HP : " + player.getHP());
            System.out.println("==============================================");
            counter++;
        }
        if(player.getHP() <= 0 && jumbo.getHP() <= 0){
            System.out.println("Hasil imbang");
        } else if(player.getHP() <= 0){
            System.out.println("Titan menghancurkan FILKOM");
        } else {
            System.out.println(name + " berhasil melindungi FILKOM");
        }
        System.out.println("==============================================");
        player.info();
        System.out.println("==============================================");
        jumbo.info();
        System.out.println("==============================================");
    }
    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.println("Selamat datang di permaindan Defend of the Filkom");
        System.out.print("Silahkan masukkan nama : ");
        name = masuk.nextLine();
        boolean l = true;
        while(l){
            System.out.println("Silahkan pilih role");
            System.out.println("1.Warrior");
            System.out.println("2.Healer");
            System.out.println("3.Magician");
            String option = masuk.next();
            if(isInt(option)){
                int temp = Integer.valueOf(option);
                switch (temp) {
                    case 1:
                        player = new Warrior();
                        System.out.println("Character telah di set menjadi Warrior");
                        System.out.println("==============================================");
                        System.out.println("Informasi character");
                        System.out.println("Nama    : " + name);
                        player.info();
                        l = false;
                    break;
                    case 2:
                        player = new Healer();
                        System.out.println("Character telah di set menjadi Healer");
                        System.out.println("==============================================");
                        System.out.println("Informasi character");
                        System.out.println("Nama    : " + name);
                        player.info();
                        l = false;
                    break;
                    case 3:
                        player = new Magician();
                        System.out.println("Character telah di set menjadi Magician");
                        System.out.println("==============================================");
                        System.out.println("Informasi character");
                        System.out.println("Nama    : " + name);
                        player.info();
                        l = false;
                    break;
                    default:
                        System.out.println("Input Salah");
                    break;
                    
                }
            } else{
                System.out.println("Input Harus Integer");
            }
            System.out.println("==============================================");
        }
        battle();
        battle();
    }
    
}
