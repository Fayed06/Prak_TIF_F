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
public class Mobil {
    private String plat;
    private int tahun;
    private String warna;
    private int hargaSewa;

    public Mobil(String nomor, int tahun, String warna, int harga) {
        this.plat = nomor;
        this.tahun = tahun;
        this.warna = warna;
        this.hargaSewa = harga;
    }
    public String toString() {
        return "Nomor Polisi: " + this.plat  + "\n" +"Tahun: " + this.tahun + "\n" +"Warna Mobil: " + this.warna + "\n" +"Harga Sewa: " + "Rp" + this.hargaSewa;
    }
}
