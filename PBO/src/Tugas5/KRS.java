package Tugas5;
import java.util.Scanner;

public class KRS {
    Scanner read = new Scanner(System.in);
    private Mahasiswa mahasiswa;
    private MataKuliah[] matkul = new MataKuliah[99];
    static final int maxSKS = 24;
    private static int SKS = 0, banyakDosen = 0, banyakMatkul = 0;
    Dosen dosen[] = new Dosen[99];

    public KRS() {
    }

    public KRS(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void tambahMatkul() {
        String kode, Matkul;
        int sks;
        int pilih = 0;
        System.out.print("Masukkan Kode Matkul     : ");kode = read.nextLine();
        System.out.print("Masukkan Nama Matkul     : ");Matkul = read.nextLine();
        System.out.print("Masukkan Beban SKS       : ");sks = read.nextInt();
        System.out.printf("\n=================================================\n");
        System.out.println("List Dosen           :");
        for (int i = 0; i < banyakDosen; i++) {
            if (dosen[i] == null) {
                System.out.printf("\n=================================================\n");
                break;
            }
            System.out.printf((i + 1)+". "+dosen[i].getNama()+"\n");
        }
        System.out.print("Pilih Dosen         :");int pildos = read.nextInt();
        if (pildos > banyakDosen) {
            System.out.println("Pilihan Tidak Tersedia");
            return;
        }

        if (sks + SKS <= maxSKS) {
            matkul[banyakMatkul] = new MataKuliah(kode, Matkul, sks, dosen[pildos - 1]);
            SKS += sks;
            banyakMatkul++;
            System.out.printf("=================================================\n");
            System.out.println("Berhasil menambahkan MatKul : "+ Matkul);
            System.out.println("Sisa SKS : " + (maxSKS - SKS) + "\n");

        }
        else {
            System.out.printf("=================================================\n");
            System.out.println("Gagal menambahkan MatKul        : " + Matkul);
            System.out.println("Melebihi batas SKS, Sisa SKS    : " +  (maxSKS - SKS)  + "\n");
        }

        System.out.printf("=================================================\n");
        System.out.println("1. tambah Matkul lagi");
        System.out.println("2. selesai menambahkan");
        System.out.printf("=================================================\n");
        System.out.print(" pilih menu : ");pilih = read.nextInt();
        if (pilih == 1) {
            read.nextLine();
            tambahMatkul();
        } else {
            return;
        }
    }

    public void tambahDosen() {
        String nama,NIDN,prod,fak;
        System.out.println("            Masukkan Data Dosen");
        System.out.printf("=================================================\n");
        System.out.print("Nama      : ");nama = read.nextLine();
        System.out.print("NIDN      : ");NIDN = read.nextLine();
        System.out.print("Prodi     : ");prod = read.nextLine();
        System.out.print("Fakultas  : ");fak = read.nextLine();
        if (dosen[dosen.length - 1] != null) {
            dosen = resizeArr(dosen);
        }
        dosen[banyakDosen] = new Dosen(NIDN,nama,prod,fak);
        banyakDosen++;
        System.out.println("\nDosen Berhasil Ditambahkan\n");
        System.out.println("=================================================");

    }

    public Dosen[] resizeArr(Dosen[] arr) {
        Dosen[] baru = new Dosen[arr.length * 2];
        System.arraycopy(arr, 0, baru, 0, arr.length);
        return baru;
    }

    public Mahasiswa[] resizeArr(Mahasiswa[] arr) {
        Mahasiswa[] baru = new Mahasiswa[arr.length * 2];
        System.arraycopy(arr, 0, baru, 0, arr.length);
        return baru;
    }

    public void tampilKRS() {
        System.out.println(mahasiswa.toString());
        System.out.println("=========Mata Kuliah Yang Telah Dipilih=========");
        for (int i = 0; i < matkul.length; i++) {
            if (matkul[i] == null) {
                return;
            }
            System.out.printf("Kode Matkul     : " + matkul[i].getKodeMatkul());
            System.out.printf("\nNama Matkul     : " + matkul[i].getNamaMatkul());
            System.out.printf("\nKode Matkul     : " + matkul[i].getSks());
            System.out.printf("\nKode Matkul     : " + matkul[i].getDosenNama());
            System.out.printf("\n=================================================\n");
        }

    }
}
