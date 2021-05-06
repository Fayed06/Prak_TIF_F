/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author ASUS
 */
public class Supir {
   private String nama;
    private String sim;
    private String alamat;
    private int gaji;

    public Supir(String nama, String sim, String alamat, int gajiHarian) {
        this.nama = nama;
        this.sim = sim;
        this.alamat = alamat;
        this.gaji = gajiHarian;
    }

    public String toString() {
        return "Nama Sopir: " + this.nama + "\n" + "SIM: " + this.sim + "\n" + "Alamat: " + this.alamat + "\n" +"Gaji Harian: " + "Rp" + this.gaji;
    }
}
