package Tugas6;

public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public String toString() {
        String output = "\n============================"
                + "\n           Sales"
                + "\n============================"
                + "\nNama            : " + super.getNama()
                + "\nNo.KTP          : " + super.getNoKTP()
                + "\nTotal Penjualan : " + getPenjualan() + " unit"
                + "\nBesaran Komisi  : Rp." + getKomisi()
                + "\nPendapatan      : Rp." + gaji();
        return output;
    }

    @Override
    public double gaji() {
        return penjualan*komisi;
    }
}
