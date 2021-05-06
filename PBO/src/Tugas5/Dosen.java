package Tugas5;

public class Dosen  extends CivitasAkademik {
    private String nidn;

    public Dosen(String nidn, String nama, String prodi, String fakultas ) {
        super(nama, prodi, fakultas);
        this.nidn = nidn;
    }
    public String getNama() {
        return super.getNama();
    }
    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

}
