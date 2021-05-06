package Tugas5;

public class MataKuliah {
    private String kodeMatkul, namaMatkul;
    private int sks;
    private Dosen dosen;

    public MataKuliah(String kodeMatkul, String namaMatkul, int sks, Dosen dosen) {
        this.kodeMatkul = kodeMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
        this.dosen = dosen;
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getDosenNama() {
        return dosen.getNama();
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }
}
