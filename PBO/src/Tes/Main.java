package Tes;

class CivitasAkademik {

    private String nama, prodi, fakultas;

    public CivitasAkademik() {
    }

    public CivitasAkademik(String nama, String prodi, String fakultas) {
        this.nama = nama;
        this.prodi = prodi;
        this.fakultas = fakultas;

    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public String getFakultas() {
        return fakultas;
    }

}

class Mahasiswa extends CivitasAkademik {

    private String nim;
    static int m;

    public Mahasiswa() {
        m+=1;
    }

    public Mahasiswa(String nim, String nama, String prodi, String fakultas) {
        super(nama, prodi, fakultas);
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
        String output = "Nama Mahasiswa\t: " + getNama() + "\n"
                + "NIM\t\t: " + nim + "\n"
                + "Fakultas\t: " + getFakultas() + "\n"
                + "Prodi\t\t: " + getProdi() + "\n";
        return output;
    }
}

class Dosen extends CivitasAkademik {

    private String nidn;

    public Dosen() {
    }

    public Dosen(String nidn, String nama, String prodi, String fakultas) {
        super(nama, prodi, fakultas);
        this.nidn = nidn;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    public String getProdi() {
        return super.getProdi();
    }

    public String getFakultas() {
        return super.getFakultas();
    }

}

class MataKuliah {

    private String kodeMatkul, namaMatkul;
    private int sks;
    private Dosen dosen;

    public MataKuliah() {
    }

    public MataKuliah(String kodeMatkul, String namaMatkul, int sks, Dosen dosen) {
        this.kodeMatkul = kodeMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
        this.dosen = dosen;
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public String getNamaMatku() {
        return namaMatkul;
    }

    public int getSks() {
        return sks;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public String getDosenNama() {
        return dosen.getNama();
    }

}

class KRS {

    private Mahasiswa mahasiswa;
    private MataKuliah[] matkul = new MataKuliah[10];
    static final int maxSKS = 24;
    private int SKS, banyakMatkul = 0;

    public KRS() {
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void tambahMatkul(MataKuliah matakuliah) {
        if (matakuliah.getSks() + SKS <= maxSKS) {
            this.matkul[banyakMatkul] = matakuliah;
            SKS += matakuliah.getSks();
            banyakMatkul++;
            System.out.println("Mata Kuliah " + matakuliah.getNamaMatku() +" Berhasil Ditambahkan\n"
                    + "Sisa kuota SKS anda tersisa\t: " + (maxSKS - SKS) + "\n");
        } else {
            System.out.println("Penambahan MataKuliah " + matakuliah.getNamaMatku()+" Gagal Karena Melebihi Batas SKS\n");
        }
    }

    public void tampilKRS() {
        System.out.println(mahasiswa.toString());
        System.out.println("=========Mata Kuliah Yang Telah Dipilih=========");
        System.out.println("|Kode Matkul|Mata Kuliah|Beban SKS|Dosen Pengampu|");
        for (int i = 0; i < matkul.length; i++) {
            if (matkul[i] == null) {
                return;
            }
            System.out.printf("|%-11s|%-11s|%-9s|%-14s|%n" , matkul[i].getKodeMatkul() , matkul[i].getNamaMatku()
                    , matkul[i].getSks()+ " SKS" , matkul[i].getDosenNama());
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("123", "Ir. ramdan S.Ag M.Ag ", "TEKKOM", "FILKOM");
        Dosen dosen2 = new Dosen("420", "hafidz S.Kom, M.Kom", "TIF", "FILKOM");
        Dosen dosen3 = new Dosen("741", "Ilhamudin S.Sos M.Sos", "Sosiologi", "FISIP");
        Dosen dosen4 = new Dosen("741", "Dr. Muchlis S.kom M.kom", "Sosiologi", "FISIP");
        KRS krsAri = new KRS();
        MataKuliah PKN = new MataKuliah("KWN153", "PKN", 3,dosen3);
        MataKuliah Aljabar = new MataKuliah("AL0912", "Aljabar", 4, dosen4);
        MataKuliah SISOP = new MataKuliah("SOP941", "SISOP", 4,dosen2);
        MataKuliah Agama = new MataKuliah("AG701", "Agama", 2,dosen1);
        MataKuliah Kalkulus = new MataKuliah("SOP941", "SISOP", 4,dosen2);
        MataKuliah PBO = new MataKuliah("SOP941", "PBO", 5,dosen4);
        MataKuliah BINDO = new MataKuliah("BI635", "BINDO", 3, dosen3);
        Mahasiswa ari = new Mahasiswa("205150200111077", "Harun Asrori", "TIF", "FILKOM");
        krsAri.setMahasiswa(ari);
        krsAri.tambahMatkul(PKN);
        krsAri.tambahMatkul(Aljabar);
        krsAri.tambahMatkul(SISOP);
        krsAri.tambahMatkul(Agama);
        krsAri.tambahMatkul(PBO);
        krsAri.tambahMatkul(Kalkulus);
        krsAri.tambahMatkul(BINDO);
        krsAri.tampilKRS();
        Mahasiswa a1 = new Mahasiswa();
        Mahasiswa a2 = new Mahasiswa();
        Mahasiswa a3 = new Mahasiswa();
        System.out.println(a3.m);

    }

}