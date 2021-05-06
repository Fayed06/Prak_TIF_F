package UTP_PBO;

public class Main {
    public static void main(String[] args) {
        Pegawai pegawaiPerpus = new Pegawai("Fayed", "205150207111058");

        Perpustakaan perpus = new Perpustakaan(pegawaiPerpus);


        pegawaiPerpus.menambahPelanggan("Hayasaka", "99001110009");
        pegawaiPerpus.menambahPelanggan("Miyuki", "99001100008");
        pegawaiPerpus.menambahPelanggan("Kei", "990011110077");
        pegawaiPerpus.menambahBuku("Heavens", "Tiancan", 3);
        pegawaiPerpus.menambahBuku("Kaguya-sama ", "Akasaka", 3);
        pegawaiPerpus.menambahBuku(" Solo Leveling ", "Chugong", 1);
        perpus.pinjam("Hayasaka", "Overlord");
        perpus.pinjam("Miyuki", "Solo Leveling");
        perpus.pinjam("Kei", "Solo Leveling");
        pegawaiPerpus.menambahBuku(" Overlord ", "Maruyama", 3);
        pegawaiPerpus.menambahBuku(" Solo Leveling ", "Chugong", 1);
        pegawaiPerpus.menambahBuku(" Solo Leveling ", "Chugong", 1);
        perpus.pinjam("Miyuki", "Solo Leveling");
        perpus.pinjam("Miyuki", "Solo Leveling");
        perpus.pinjam("Miyuki", "Solo Leveling");
        pegawaiPerpus.menambahBuku(" Solo Leveling ", "Chugong", 1);
        pegawaiPerpus.menambahBuku(" Solo Leveling ", "Chugong", 1);
        perpus.pinjam("Miyuki", "Solo Leveling");
        perpus.pinjam("Miyuki", "Solo Leveling");

        perpus.tampilkanInfoPerpustakaan();
    }
}