package Tugas4;

class Mahasiswa extends Manusia {

    static int banyak_mahasiswa;
    private String NIM;
    private double IPK;

    public Mahasiswa(String NIM, double IPK, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
        banyak_mahasiswa++;
    }

    static public int getBanyakMahasiswa(){
        return banyak_mahasiswa;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public String getStatus() {
        String output, prodi = null;
        String angkatan = NIM.substring(0, 2);
        int Noprodi = Integer.parseInt(NIM.substring(6, 7));
        switch (Noprodi){
            case 2:
                prodi = "Teknik Meniup Gelembung";
                break;
            case 3:
                prodi = "Teknik Berburu Ubur Ubur";
                break;
            case 4:
                prodi = "Sistem Perhamburgeran";
                break;
            case 6:
                prodi = "pendidikan Chum Bucket";
                break;
            case 7:
                prodi = "Teknologi Telepon Kerang";
                break;
        }

        angkatan = "20" + angkatan;
        output = prodi + "," + angkatan;
        return output;
    }

    public double getBeasiswa() {
        double Beasiswa = 0;
        if (IPK > 3.5) {
            Beasiswa = 75;
        } else if (IPK > 3.0) {
            Beasiswa = 50;
        }
        return Beasiswa;
    }

    @Override
    public String toString() {
        String output = "===========================\n"
                + "        Mahasiswa"
                + "\n============================"
                + "\nNama           : " + getNama()
                + "\nNIK            : " + getNIK()
                + "\nJenis Kelamin  : " + (isjenisKelamin() ? "Laki-Laki" : "Perempuan")
                + "\nPendapatan     : " + (getPendapatan() + getBeasiswa()) + "$"
                + "\nNIM            : " + getNIM()
                + "\nIPK            : " + getIPK()
                + "\nStatus         : " + getStatus()
                + "\n============================";
        return output;
    }
}
