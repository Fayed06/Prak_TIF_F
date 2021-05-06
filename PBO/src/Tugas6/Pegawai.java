package Tugas6;

public abstract class Pegawai {
    private String nama, noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public abstract String toString();

    public  abstract  double gaji();
}
