package Tugas4;

public class Main {
    public static void main(String[] args) {
        Manusia[] orang = new Manusia[3];
        orang[0] = new Manusia("Alghi", "3573051411010001", true, true);
        System.out.println(orang[0].toString());
        orang[1] = new Manusia("Zaki", "3503110101010001", true, false);
        System.out.println(orang[1].toString());
        orang[2] = new Manusia("Ghina", "3872111411010001", false, false);
        System.out.println(orang[2].toString());

        Mahasiswa[] mhs = new Mahasiswa[3];
        mhs[0] = new Mahasiswa("205150407111055", 4.0, "Fayed", "111", true, false);
        System.out.println(mhs[0].toString());
        mhs[1] = new Mahasiswa("195150700120456", 3.5, "Machsun", "112", false, false);
        System.out.println(mhs[1].toString());
        mhs[2] = new Mahasiswa("185150200111077", 3.0, "Chantika", "113", false, false);
        System.out.println(mhs[2].toString());

        Pekerja[] worker = new Pekerja[3];
        worker[0] = new Pekerja(9, 28, "2017777110232", "Udin", "333", true, true);
        System.out.println(worker[0].toString());
        worker[1] = new Pekerja(8, 30, "182119421555", "Anggi", "444", false, true);
        System.out.println(worker[1].toString());
        worker[2] = new Pekerja(9, 20, "1985283012858", "Habibi", "555", true, false);
        System.out.println(worker[2].toString());

        Manager leader[] = new Manager[3];
        leader[0] = new Manager(1 ,9, 28, "121951208393", "Rosa", "420", false, true);
        System.out.println(leader[0].toString());
        leader[1] = new Manager(2 ,5, 35, "1828901824241", "Ivan", "333", false, true);
        System.out.println(leader[1].toString());
        leader[2] = new Manager(3 ,12, 14, "1629442958025", "Arman", "121", true, false);
        System.out.println(leader[2].toString());

        System.out.println("\nBanyak Manusia      : " + Manusia.getBanyakManusia());
        System.out.println("Banyak Mahasiswa    : " + Mahasiswa.getBanyakMahasiswa());
        System.out.println("Banyak Pekerja      : " + Pekerja.getBanyakPekerja());
        System.out.println("Banyak Manager      : " + Manager.getBanyakManager());

    }
}
