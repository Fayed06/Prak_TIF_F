package UTP_PBO;

public class Pegawai {
    private String nama,nomorPegawai;

    public Pegawai(String nama, String nomorPegawai) {
        this.nama = nama;
        this.nomorPegawai = nomorPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }

    public void tampilkanInfoPegawai(){
        System.out.println("                Info Pegawai");
        System.out.println("=================================================");
        System.out.println("Nama : " + getNama() +"\nNomor Pegawai : "+getNomorPegawai());
    }
    public void  menambahPelanggan(String nama, String nomorPelanggan){
        for (Pelanggan plg : Perpustakaan.listPelanggan) {
            if(plg == null) {
                continue;
            }
            if (plg.getNama().equals(nama)) {
                return;
            }
        }
        Pelanggan baru = new Pelanggan(nama, nomorPelanggan);
        Perpustakaan.listPelanggan[Perpustakaan.indexP] = baru;
        Perpustakaan.indexP++;
    }
    public void menambahBuku(String judul, String penulis, int jumlah){
        for (Buku buk : Perpustakaan.listBuku) {
            if(buk == null) {
                continue;
            }
            if (buk.getJudul().equals(judul)) {
                return;
            }
        }
        Buku baru = new Buku(judul, penulis, jumlah);
        Perpustakaan.listBuku[Perpustakaan.indexB] = baru;
        Perpustakaan.indexB++;

    }
}
