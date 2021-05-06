package Tugas7;

public class Layang extends BangunDatar implements Hitung {
    private double diagonal1,diagonal2,sisiMiring1,sisiMiring2;

    public Layang(String nama, double diagonal1, double diagonal2, double sisiMiring1, double sisiMiring2) {
        super(nama);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiMiring1 = sisiMiring1;
        this.sisiMiring2 = sisiMiring2;
    }

    public double hitungLuas() {
        double hasil = diagonal1 * diagonal2 / 2;
        return hasil;
    }
    public double hitungKeliling() {
        double hasil = 2*sisiMiring1 + 2*sisiMiring2;
        return hasil;
    }
    public double hitungSpesial() {
        double x = Math.min(diagonal1, diagonal2)/2;
        double z = Math.min(sisiMiring1, sisiMiring2);
        double y = Math.sqrt(Math.pow(z,2)-Math.pow(x,2));
        double hasil = x * y;
        return hasil;
    }
    public void info(){
        System.out.println("" +
                "Nama bangun datar      : " + super.getNama() + "\n" +
                "Panjang diagonal 1     : " + diagonal1 + "\n" +
                "Panjang diagonal 2     : " + diagonal2 + "\n" +
                "Panjang sisi miring 1  : " + sisiMiring1 + "\n" +
                "Panjang sisi miring 2  : " + sisiMiring2);
        System.out.printf("" +
                "Luas                   : %.2f\n", hitungLuas());
        System.out.printf("" +
                "Keliling               : %.2f\n", hitungKeliling());
        System.out.printf("" +
                "Nilai Spesial          : %.2f\n\n", hitungSpesial());

    }

}
