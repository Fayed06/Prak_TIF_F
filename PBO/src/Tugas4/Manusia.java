package Tugas4;

public class Manusia {
    private static int banyak_manusia;
    private double Tunjangan;
    private String nama, NIK;
    private boolean jenisKelamin, menikah;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
        banyak_manusia++;
    }

    static public int getBanyakManusia(){
        return banyak_manusia;
    }

    public String getNama() {
        return nama;
    }

    public String getNIK() {
        return NIK;
    }

    public boolean isjenisKelamin() {
        return jenisKelamin;
    }

    public boolean ismenikah() {
        return menikah;
    }

    public void setTunjangan(double tunjangan){
        this.Tunjangan = Tunjangan;
    }

    public double getTunjangan() {
        Tunjangan = 0;
        if (ismenikah() && isjenisKelamin()) {
            Tunjangan += 25;
        } else if (ismenikah() && !isjenisKelamin()) {
            Tunjangan += 20;
        } else {
            Tunjangan += 15;
        }
        return Tunjangan;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        String output = "\n============================"
                + "\n      Manusia"
                + "\n============================"
                + "\nNama          : " + getNama()
                + "\nNIK           : " + getNIK()
                + "\nJenis Kelamin : " + (isjenisKelamin() ? "Laki-Laki" : "Perempuan")
                + "\nPendapatan    : " + getPendapatan() + "$\n"
                + "\n============================";
        return output;
    }
}