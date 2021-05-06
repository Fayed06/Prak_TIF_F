package Tugas7;

public class Trapesium extends BangunDatar implements Hitung{
    private double alasAtas,alasBawah,tinggi;

    public Trapesium(String nama, double alasAtas, double alasBawah, double tinggi) {
        super(nama);
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi = tinggi;
    }
    public double hitungLuas() {
        double hasil = (alasBawah + alasAtas) / 2 * tinggi;
        return hasil;
    }
    public double hitungKeliling() {
        double selisih = Math.abs((alasAtas-alasBawah))/2;
        double miring = Math.sqrt(Math.pow(selisih, 2) + Math.pow(tinggi, 2));
        double hasil = alasAtas + alasBawah + 2 * miring;
        return hasil;
    }
    public double hitungSpesial() {
        double sisi = Math.min(alasAtas, alasBawah);
        double hasil = sisi * tinggi;
        return hasil;
    }

    public void info(){
        System.out.println("" +
                "Nama bangun datar  : " + super.getNama() + "\n" +
                "Panjang alas atas  : " + alasAtas + "\n" +
                "Panjang alas bawah : " + alasBawah + "\n" +
                "Panjang tinggi     : " + tinggi);
        System.out.printf("" +
                "Luas               : %.2f\n", hitungLuas());
        System.out.printf("" +
                "Keliling           : %.2f\n", hitungKeliling());
        System.out.printf("" +
                "Nilai Spesial      : %.2f\n\n", hitungSpesial());
    }

}
