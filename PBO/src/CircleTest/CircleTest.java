/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircleTest;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CircleTest {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        int jari;
        Circle Circle1 =new Circle();
        System.out.print("Masukan Jari-jari : ");
        jari=read.nextInt();
        System.out.println();
        Circle1.setRadius(jari);
        System.out.println("Luas Lingkaran      : "+Circle1.getArea());
        System.out.println("keliling Lingkaran  : "+Circle1.getPerimeter());
        
        
    }
    
}
