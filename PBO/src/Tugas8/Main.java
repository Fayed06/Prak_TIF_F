package Tugas8;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Main {
    public static Character enemy = new Titan();
    public static Character hero;
    public static String nama;
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("================Attack on Filkom==============");
        System.out.print("Masukan Nama : ");
        nama = read.nextLine();
        boolean stop= false;
        String  pilih;
        while (!stop) {
            System.out.print("Silahkan Pilih : \n" +
                    "1. Magician\n" +
                    "2. Healer\n" +
                    "3. Warrior\n");
            System.out.print("Pilihan anda  : ");
            pilih = read.next();
            System.out.println();
            if (isInt(pilih)){
                int choose = Integer.valueOf(pilih);
                switch (choose){
                    case 1:
                        hero = new Magician();
                        break;
                    case 2:
                        hero = new Healer();
                        break;
                    case 3:
                        hero = new Warrior();
                        break;
                }
            }
            if(hero!=null){
                start();
                stop= true;
            }else {
                continue;
            }
        }

    }
    static void start(){
        int turn = 1;
        while((hero.getHp() > 0) && (enemy.getHp() > 0)){

            System.out.println("==================Turn " + turn +"======================");
            System.out.println("Titan's HP : " + enemy.getHp());
            System.out.println(nama + "'s HP : " + hero.getHp());
            if(enemy.attack()){
                hero.receiveDamage(enemy.getAttack());
                System.out.println("\nmusuh berhasil menyerang");
            }
            if(hero.attack()){
                enemy.receiveDamage(hero.getAttack());
                System.out.println(nama +" berhasil menyerang\n");
            }
            turn++;
        }
        System.out.println("\n===================Result======================");
        if(hero.getHp() <= 0){
            System.out.println("YOU LOSE, TITAN WIN");
        } else {
            System.out.println(nama + " WIN, GGWP");
        }
        System.out.println("===================Final Stat=================");
        hero.info();
        System.out.println("==============================================");
        enemy.info();
        System.out.println("==============================================");
    }

    static boolean isInt(String a){
        try {
            Integer.parseInt(a);
        } catch(NumberFormatException err) {
            return false;
        } catch(NullPointerException err) {
            return false;
        }
        return true;
    }
}
