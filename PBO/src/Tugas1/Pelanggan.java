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
public class Pelanggan {
    private String nama;
    private String ktp;
    private String alamat;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKTP(String nomor) {
        this.ktp = nomor;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    } 
    
       public String toString() {
        return "Nama: " + this.nama  + "\n" + "Nomor KTP: " + this.ktp + "\n" + "Alamat: " + this.alamat;
    }
}
