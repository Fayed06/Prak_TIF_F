/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        Pelanggan pelanggan = new Pelanggan();
        Mobil mobil = new Mobil("RI 1", 1945, "Black", 690000);
        Supir supir = new Supir("Arthur Pendragon", "0812-8578-5187", "Lambo", 250000);
        
        System.out.println("===============================");
        System.out.println("Silahkan mengisi data pelanggan");
        System.out.println("===============================");
      
        System.out.print("Nama: ");
        pelanggan.setNama(read.nextLine());

        System.out.print("Nomor KTP: ");
        pelanggan.setKTP(read.nextLine());

        System.out.print("Alamat: ");
        pelanggan.setAlamat(read.nextLine());
        System.out.println("");
        
        System.out.println("===============================");
        System.out.println("        Data Supir");
        System.out.println("===============================");
        System.out.println(supir);
        System.out.println("");
        System.out.println("===============================");
        System.out.println("        Data Mobil");
        System.out.println("===============================");
        System.out.println(mobil);
        
    }
    
}
