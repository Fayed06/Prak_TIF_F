package Tugas2;


class Mahasiswa {
    String nama, alamat, nim, kelamin, prodi, status;
    int nilai_akhir; 
    static int tambah, tambah_lulus, tambah_gagal;
    static final int KKM = 80;

    Mahasiswa(String nama, String nim, String alamat,String kelamin, String prodi, int nilai_akhir) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.kelamin = kelamin;
        this.prodi = prodi;
        this.nilai_akhir = nilai_akhir;
        if(nilai_akhir >= KKM) {
            status = "LULUS";
            tambah_lulus++;
        } else {
            status = "TIDAK LULUS";
            tambah_gagal++;        
        }
        tambah++;
    }
    
    public String getName(){
        return nama;
    }
    
    public String getNIM(){
        return nim;
    }
    
    @Override
    public String toString() {
        return "Mahasiswa" + "%n" + 
               "Nama             : " + nama + "%n" + 
               "NIM              : " + nim + "%n" + 
               "Alamat           : " + alamat + "%n" +
               "Jenis Kelamin    : " + kelamin + "%n" +
               "Program Studi    : " + prodi + "%n" +
               "Status Kelulusan : " + status + "%n";
    }
    
    
    public static void jumlah() {
        System.out.println("Jumlah mahasiswa : " + tambah);
        System.out.println("Jumlah kelulusan : " + tambah_lulus);
        System.out.println("Jumlah Gagal : " + tambah_gagal);
    }
}