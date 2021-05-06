package Tugas7;

public class Lingkaran extends BangunDatar implements Hitung{
    private double jari;
    private final double pi = 3.14;

    public Lingkaran(String nama, double jari) {
        super(nama);
        this.jari = jari;
    }
    public double hitungLuas() {
        double hasil =  pi * jari * jari;
        return hasil;
    }
    public double hitungKeliling() {
        double hasil = pi * jari * 2;
        return hasil;
    }
    public double hitungSpesial() {
        double juring = hitungLuas()/4;
        double segitiga = jari * jari / 2;
        double hasil =juring - segitiga;
        return hasil;
    }

    public void info(){
        System.out.println("" +
                "Nama bangun datar  : " + super.getNama() + "\n" +
                "Panjang jari-jari  : " + jari);
        System.out.printf("" +
                "Luas               : %.2f\n", hitungLuas());
        System.out.printf("" +
                "Keliling           : %.2f\n", hitungKeliling());
        System.out.printf("" +
                "Nilai Spesial      : %.2f\n\n", hitungSpesial());
    }
}
