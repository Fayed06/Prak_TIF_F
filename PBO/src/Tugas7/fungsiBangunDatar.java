package Tugas7;

public class fungsiBangunDatar extends BangunDatar{
    public fungsiBangunDatar() {

    }
    public void info() {
        System.out.println("============================");
        System.out.println("    List Bangun Datar");
        System.out.println("============================");
        for (int i = 0; i < listBangunDatar.length; i++) {
            if (listBangunDatar[i] == null) break;
            System.out.println((i+1)+"."+(listBangunDatar[i]));
        }
        System.out.println();
    }
}

