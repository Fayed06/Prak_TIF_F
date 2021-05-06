package Tugas6;

public class Main {
    public static void main(String[] args) {
        Pegawai tetap[] = new PegawaiTetap[3];
        Pegawai harian[] = new PegawaiHarian[3];
        Pegawai sales[] = new Sales[3];

        tetap[0] = new PegawaiTetap("Udin","111",4000000);
        harian[0] = new PegawaiHarian("Arthur" , "222", 5000, 35);
        sales[0] = new Sales("Isma", "333", 10, 50000);

        tetap[1] = new PegawaiTetap("Akbar","444",3000000);
        harian[1] = new PegawaiHarian("Zaki" , "555", 4500, 40);
        sales[1] = new Sales("Rosa", "666", 15, 40000);

        tetap[2] = new PegawaiTetap("Wicak","777",3500000);
        harian[2] = new PegawaiHarian("Rey" , "888", 4000, 45);
        sales[2] = new Sales("Dinda", "999", 20, 30000);

        for (Pegawai pegawai : tetap){
            System.out.println(pegawai.toString());
        }

        for (Pegawai pegawai : harian){
            System.out.println(pegawai.toString());
        }

        for (Pegawai pegawai : sales){
            System.out.println(pegawai.toString());
        }
    }
}
