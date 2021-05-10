package Tugas9;

import java.util.Scanner;

public class Barang {
    private String nama, kode, jenis;
    private double berat;
    private int harga;

    public Barang(String nama, String kode, double berat, String jenis, int harga) {
        this.nama = nama;
        this.kode = kode;
        this.jenis = jenis;
        this.berat = berat;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public static Barang read(){
        Scanner read = new Scanner(System.in);
        String tempKode, tempNama, tempJenis;
        int tempHarga;
        double tempBerat;
        System.out.print("Nama Barang       : ");tempNama = read.nextLine();
        System.out.print("Kode Barang       : ");tempKode = read.nextLine();
        System.out.print("Berat Barang      : ");tempBerat = read.nextDouble();
        read.nextLine();
        System.out.print("Jenis Barang      : ");tempJenis = read.nextLine();
        System.out.print("Harga Barang      : ");tempHarga = read.nextInt();
        switch (tempJenis.toLowerCase()) {
            case "perabot kayu": {
                return new Kayu(tempNama, tempKode,tempBerat, tempJenis, tempHarga);
            }
            case "elektronik": {
                return new Elektronik(tempNama, tempKode,tempBerat, tempJenis, tempHarga);
            }
            default: {
                System.out.println("\nInputan Salah! silahkan ulang\n");
                return read();
            }
        }
    }
}