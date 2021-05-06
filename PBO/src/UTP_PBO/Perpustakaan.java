package UTP_PBO;

public class Perpustakaan {
    static Buku listBuku[] = new Buku[100];
    private Pegawai pegawaiPerpus;
    static Pelanggan listPelanggan[] = new Pelanggan[20];
    int count = 0;
    int jmlh =0;
    public static int indexP = 0;
    public static int indexB = 0;

    Perpustakaan(Pegawai pegawaiperpus) {
        this.pegawaiPerpus = pegawaiperpus;
    }

    public void pinjam(String NamaPelanggan, String JudulBuku){
        Buku bukuCari = cariBuku(JudulBuku);

        if(bukuCari == null) {
            return;
        }
        for(int i = 0; i < listPelanggan.length; i++) {
            if(listPelanggan[i] == null) {
                continue;
            }
            if(listPelanggan[i].getNama().equals(NamaPelanggan)) {
                listPelanggan[i].tambahBuku(bukuCari);
            }
        }

    }
    public Buku cariBuku(String judulBuku) {
        for (Buku buk : Perpustakaan.listBuku) {
            if(buk == null) {
                return null;
            }
            if (buk.getJudul().equals(judulBuku)) {
                return buk;
            }
        }

        return null;
    }

    public void tampilkanInfoPerpustakaan(){
        System.out.println("Pegawai: ");
        System.out.println("Nama: " + pegawaiPerpus.getNama());
        System.out.println("Nomor Pegawai: " + pegawaiPerpus.getNomorPegawai());
        System.out.println("");
        for(Pelanggan plg : listPelanggan) {
            if(plg != null) {
                plg.tampilkanInfoPelanggan();
            }
        }

        System.out.println("");
        System.out.println("Buku-buku");
        for(Buku buk : listBuku) {
            if( buk != null) {
                buk.tampilkanInfoBuku();
            }
        }
    }

}
