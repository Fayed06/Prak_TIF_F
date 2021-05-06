package Tugas4;

class Pekerja extends Manusia {

    static int banyak_pekerja;
    private double gaji, bonus;
    private int jamKerja, hariKerja;
    private String NIP;

    public Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
        setGaji();
        banyak_pekerja++;
    }

    static public int getBanyakPekerja(){
        return banyak_pekerja;
    }

    public void setGaji() {
        int hariBiasa = 0, hariLembur = 0;
        while (hariKerja != 0) {
            hariBiasa += 5;
            hariKerja -= 5;
            hariLembur += 2;
            hariKerja -= 2;
            if (hariKerja < 5) {
                hariBiasa += hariKerja;
                hariKerja = 0;
            }
        }
        if (jamKerja >= 7) {
            gaji += 7 * 10 * (hariBiasa + hariLembur);
            bonus += 7 * 20 * hariLembur;
            bonus += (jamKerja - 7) * 15 * hariBiasa;
            bonus += (jamKerja - 7) * 35 * hariLembur;
        } else {
            gaji += jamKerja * 10 * hariBiasa;
            gaji += jamKerja * 20 * hariLembur;
        }
    }

    public String getNIP() {
        return NIP;
    }

    public double getGaji(){
        return gaji;
    }

    public double getBonus(){
        return bonus;
    }

    public String getStatus() {
        String output = null;
        int cabangNo = Integer.parseInt(getNIP().substring(0, 1));
        String cabangKe = getNIP().substring(2, 3);
        int departemenNo = Integer.parseInt(getNIP().substring(6, 7));
        String cabang = null;
        String departemen = null;
        switch (departemenNo) {
            case 1:
                departemen = "Pemasaran";
                break;
            case 2:
                departemen = "Humas";
                break;
            case 3:
                departemen = "Riset";
                break;
            case 4:
                departemen = "Teknologi";
                break;
            case 5:
                departemen = "Personalia";
                break;
            case 6:
                departemen = "Akademik";
                break;
            case 7:
                departemen = "Administrasi";
                break;
            case 8:
                departemen = "Operasional";
                break;
            case 9:
                departemen = "pembangunan";
                break;

        }
        switch (cabangNo) {
            case 1:
                cabang = "Mondstadt";
                break;
            case 2:
                cabang = "Liyue";
                break;
            case 3:
                cabang = "Inazuma";
                break;
            case 4:
                cabang = "Sumeru";
                break;
            case 5:
                cabang = "Fontaine";
                break;
            case 6:
                cabang = "Natlan";
                break;
            case 7:
                cabang = "Snezhnaya";
                break;
        }
        return departemen + ", " + cabang + " cabang ke-" + cabangKe;
    }

    @Override
    public String toString() {
        String output = "\n============================"
                + "\n      Pekerja"
                + "\n============================"
                + "\nNama           : " + getNama()
                + "\nNIK            : " + getNIK()
                + "\nJenis Kelamin  : " + (isjenisKelamin() ? "Laki-Laki" : "Perempuan")
                + "\nPendapatan     : " + (getPendapatan() + getGaji() + getBonus()) + "$"
                + "\nBonus          : " + getBonus() + "$"
                + "\nGaji           : " + getGaji() +"$"
                + "\nStatus         : " + getStatus()
                + "\n============================";
        return output;
    }
}