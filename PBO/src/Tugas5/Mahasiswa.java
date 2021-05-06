package Tugas5;

class Mahasiswa extends CivitasAkademik {
   private String nim;
   private Mahasiswa MahasiswaList[];
    public Mahasiswa(String nim,String nama, String prodi, String fakultas ) {
        super(nama, prodi, fakultas);
        this.nim = nim;
    }
    public Mahasiswa(String nama,String nim, Mahasiswa[] mahasiswaList) {
        super(nama);
        this.nim = nim;
        MahasiswaList = mahasiswaList;
    }
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return super.getNama();
    }


    public String getProdi() {
        return super.getProdi();
    }

    public String getFakultas() {
        return super.getFakultas();
    }

    public String toString() {
        String output = "=================Data Mahasiswa=================\n"
                + "\nNama Mahasiswa     : " + getNama() + "\n"
                + "NIM                : " + nim + "\n"
                + "Fakultas           : " + getFakultas() + "\n"
                + "Prodi              : " + getProdi() + "\n";
        return output;
    }

}
