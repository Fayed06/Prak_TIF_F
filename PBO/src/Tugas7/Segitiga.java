package Tugas7;

public class Segitiga extends BangunDatar implements Hitung{
    private double alas,tinggi;

    public Segitiga(String nama, double alas, double tinggi) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        double hasil =  alas * tinggi / 2;
        return hasil;
    }

    public double hitungKeliling() {
        double hasil = alas + tinggi + hitungSpesial();
        return hasil;
    }

    public double hitungSpesial() {
        double hasil = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return hasil;
    }

    public void info() {
        System.out.println("" +
                "Nama bangun datar : " + super.getNama() + "\n" +
                "Panjang alas      : " + alas + "\n" +
                "Panjang tinggi    : " + tinggi);
        System.out.printf("" +
                "Luas              : %.2f\n", hitungLuas());
        System.out.printf("" +
                "Keliling          : %.2f\n", hitungKeliling());
        System.out.printf("" +
                "Nilai Spesial     : %.2f\n\n", hitungSpesial());
    }
}
