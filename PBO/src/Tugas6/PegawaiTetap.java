package Tugas6;

public class PegawaiTetap extends Pegawai{
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public String toString() {
        String output = "\n============================"
                + "\n      Pegawai Tetap"
                + "\n============================"
                + "\nNama          : " + super.getNama()
                + "\nNo.KTP        : " + super.getNoKTP()
                + "\nUpah Pegawai  : " + getUpah()
                + "\nPendapatan    : Rp. " + gaji();
        return output;
    }

    @Override
    public double gaji() {
        return getUpah();
    }
}
