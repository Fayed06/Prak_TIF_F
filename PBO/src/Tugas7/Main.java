package Tugas7;

public class Main {
    public static void main(String[] args) {
        BangunDatar bd[] = new BangunDatar[7];
        bd[0] = new Lingkaran("Lingkaran", 37);
        bd[1] = new Trapesium("Trapesium", 24, 77, 40);
        bd[2] = new Segitiga("Segitiga", 56, 67);
        bd[3] = new Persegi("Persegi", 33);
        bd[4] = new Layang("Layang", 30, 12, 8, 7);
        bd[5] = new Trapesium("Trapesium", 10, 35, 8);
        bd[6] = new Layang("Layang", 12, 24, 7, 9);
        BangunDatar b = new fungsiBangunDatar();
        b.info();
        for(int i = 0; i < bd.length; i++) {
            System.out.printf("================ Bangun Datar %d ====================\n", i+1);
            bd[i].info();
        }
        b.search("layang");
        b.search("LinGkarAn");
        b.search("kubus");

    }
}
//        BangunDatar[] shape = new BangunDatar[5];
//        shape[0] = new Segitiga("Segitiga", 11, 15);
//        shape[1] = new Persegi("Persegi", 8);
//        shape[2] = new Lingkaran("Lingkaran", 7);
//        shape[3] = new Trapesium("Trapesium", 6, 10, 7);
//        shape[4] = new Layang("Layang", 10, 5, 7, 12);
//        BangunDatar bentuk = new fungsiBangunDatar();
//        bentuk.info();
//        for (int i = 0; i < shape.length; i++) {
//            System.out.print("============================\n");
//            System.out.print("Bangun Datar ke-" + (i+1)+"\n");
//            System.out.print("============================\n");
//            shape[i].info();
//        }
//        Hitung[] hitungs = new Hitung[5];
//        hitungs[0] = new Persegi("Persegi", 10);
//        hitungs[1] = new Segitiga("Segitiga",6,8);
//        hitungs[2] = new Layang("Layang", 10, 20, 15, 25);
//        hitungs[3] = new Trapesium("Trapesium",20,25,10);
//        hitungs[4] = new Lingkaran("Lingkaran",21);
//        for(Hitung bangun : hitungs){
//            BangunDatar bangunDatar = BangunDatar.getInstanceBangunDatarOf(bangun);
//            bangunDatar.info();
//        }