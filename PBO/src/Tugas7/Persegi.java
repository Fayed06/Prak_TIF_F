package Tugas7;

public class Persegi extends BangunDatar implements Hitung{
    private double panjangSisi;

    public Persegi(String nama, double panjangSisi) {
        super(nama);
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas() {
        double hasil = panjangSisi * panjangSisi;
        return hasil;
    }

    public double hitungKeliling() {
        double hasil = 4* panjangSisi;
        return hasil;
    }

    public double hitungSpesial() {
        double hasil =Math.sqrt(Math.pow(panjangSisi, 2) + Math.pow(panjangSisi, 2));
        return hasil;
    }

    public void info() {
        System.out.print("" +
                "Nama bangun datar  : " + super.getNama() + "\n" +
                "Panjang sisi       : " + panjangSisi+ "\n");
        System.out.printf("" +
                "Luas               : %.2f\n", hitungLuas());
        System.out.printf("" +
                "Keliling           : %.2f\n", hitungKeliling());
        System.out.printf("" +
                "Nilai Spesial      : %.2f\n\n", hitungSpesial());
    }
}
