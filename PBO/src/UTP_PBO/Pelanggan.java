package UTP_PBO;

public class Pelanggan {
    private String nama,nomorPelanggan;
    Buku BukuPinjaman[]= new Buku[3];
    private int indexBP;

    public Pelanggan(String nama, String nomorPelanggan) {
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public void setNomorPelanggan(String nomorPelanggan) {
        this.nomorPelanggan = nomorPelanggan;
    }

    public void tampilkanInfoPelanggan(){
        System.out.println("                Info Pelanggan");
        System.out.println("=================================================");
        System.out.println("Nama : " + getNama() +"\nNomor Pelanggan : "+getNomorPelanggan());
        System.out.println("Buku yang dipinjam: ");
        for (Buku buk : BukuPinjaman) {
            if(buk != null) {
                System.out.println(buk.getJudul());
            }
        }
        System.out.println("");
    }
    public void tambahBuku(Buku bukuPinjaman){
        if(indexBP == BukuPinjaman.length) {
            return;
        }
        this.BukuPinjaman[indexBP] = bukuPinjaman;
        indexBP++;
    }
}
