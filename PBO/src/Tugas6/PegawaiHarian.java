package Tugas6;

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public String toString() {
        String output = "\n============================"
                + "\n      Pegawai harian"
                + "\n============================"
                + "\nNama            : " + super.getNama()
                + "\nNo.KTP          : " + super.getNoKTP()
                + "\nUpah Pegawai    : " + getUpahPerJam()
                + "\nTotal Jam Kerja : " + getTotalJam() + " Jam"
                + "\nPendapatan      : Rp." + gaji();
        return output;
    }

    @Override
    public double gaji() {
        double gaji =0;
        if(totalJam >= 40){
            int jamLembur = totalJam - 40;
            gaji += jamLembur * upahPerJam * 1.5;
            totalJam = 40;
        }
        gaji += upahPerJam * totalJam;
        return gaji;
    }
}
