package Tugas4;

class Manager extends Pekerja {

    static int banyak_manager;
    private int lamaKerja;

    public Manager(int lamaKerja, int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
        banyak_manager++;
    }

    static public int getBanyakManager(){
        return banyak_manager;
    }

    @Override
    public String toString() {
        String output = "\n============================"
                + "\n      Manager"
                + "\n============================"
                + "\nNama           : " + getNama()
                + "\nNIK            : " + getNIK()
                + "\nJenis Kelamin  : " + (isjenisKelamin() ? "Laki-Laki" : "Perempuan")
                + "\nPendapatan     : " + (getPendapatan() + 15 + getGaji() + (getBonus()* 135 / 100)) + "$"
                + "\nBonus          : " + (getBonus()* 135 / 100) + "$"
                + "\nGaji           : " + getGaji() + "$"
                + "\nStatus         : " + getStatus()
                + "\nLama Kerja     : " + lamaKerja + " Tahun"
                + "\n============================";
        return output;
    }

}
