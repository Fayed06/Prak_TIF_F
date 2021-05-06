package Tugas5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int pilih=0;
        String name,nomor,jurusan,fkltas;
        System.out.println("=================================================");
        System.out.println("                Civitas Akademik");
        System.out.println("=================================================");
        System.out.print("Nama Mahasiswa     : ");name = read.nextLine();
        System.out.print("NIM  Mahasiswa     : ");nomor = read.nextLine();
        System.out.print("Prodi Mahasiswa    : ");jurusan = read.nextLine();
        System.out.print("Fakultas Mahasiswa : ");fkltas = read.nextLine();
        System.out.println("=================================================");
        KRS krs = new KRS(new Mahasiswa(nomor, name, jurusan, fkltas));
        while (pilih!=4) {
            System.out.println("           Pilih Menu Yang Diinginkan");
            System.out.println("=================================================");
            System.out.println("1. Input Data Dosen\n"+
                                "2. Input Data KRS\n"+
                                "3. Lihat KRS\n"+
                                "4. Keluar");
            System.out.println("=================================================");
            System.out.print(" pilih menu : ");pilih = read.nextInt();
            System.out.println("=================================================");
            switch (pilih) {
                case 1: {
                    krs.tambahDosen();
                    break;
                }
                case 2: {
                    krs.tambahMatkul();
                    break;
                }
                case 3: {
                    krs.tampilKRS();
                    break;
                }
                case 4: {
                    System.out.println("Program berakhir");
                    System.exit(0);
                }
                default:
                System.out.println("Data yang di inputkan Salah\n");
                break;
            }
        }

    }

}
//    Dosen dosen1 = new Dosen("123", "Muhammad Tanzil Furqon, S.Kom., MCompSc ", "SI", "FILKOM");
//    Dosen dosen2 = new Dosen("456", "Edy Santoso, S.Si., M.Kom", "TIF", "FILKOM");
//    Dosen dosen3 = new Dosen("789", "Arief Andy Soebroto, ST., M.Kom", "Kelautan", "FISIP");
//    Dosen dosen4 = new Dosen("999", "Zenitha Kurnia Putri", "Politik", "FISIP");
//
//    KRS krs = new KRS();
//
//    MataKuliah Aljabar = new MataKuliah("AL0912", "Aljabar", 4, dosen2);
//    MataKuliah PKN = new MataKuliah("KWN153", "PKN", 3,dosen4);
//    MataKuliah Statiska = new MataKuliah("SOP941", "Statistika dan Teori Peluang", 4,dosen2);
//    MataKuliah SISOP = new MataKuliah("SOP941", "SISOP", 4,dosen1);
//    MataKuliah PBO = new MataKuliah("PBO641", "PBO", 5,dosen4);
//    MataKuliah Agama = new MataKuliah("AG701", "Agama", 2,dosen1);
//    MataKuliah BINDO = new MataKuliah("BI635", "BINDO", 3, dosen3);
//
//    Mahasiswa mhs1 = new Mahasiswa("205150207111058", "Muhammad Rafly Alfayed", "TIF", "FILKOM");
//
//        krs.setMahasiswa(mhs1);
//
//                krs.tambahMatkul(BINDO);
//                krs.tambahMatkul(PKN);
//                krs.tambahMatkul(Aljabar);
//                krs.tambahMatkul(SISOP);
//                krs.tambahMatkul(PBO);
//                krs.tambahMatkul(Statiska);
//                krs.tambahMatkul(Agama);
//
//                krs.tampilKRS();



//    Mahasiswa[] mhs = new Mahasiswa[999];
//    Dosen[] dsn = new Dosen[999];
//
//    Scanner read = new Scanner(System.in);
//    int pilih = 0;
//    int penambah = 0;
//        while(pilih!=9) {
//                System.out.println("==================================");
//                System.out.println("        Civitas Akademik");
//                System.out.println("==================================");
//                System.out.println("1. Input Data Mahasiswa");
//                System.out.println("2. Input Data Dosen");
//                System.out.println("3. Input Data Matkul");
//                System.out.println("4. Input Data KRS");
//                System.out.println("4. Tampilkan Data KRS");
//                System.out.println("9. Keluar");
//                System.out.println("==================================");
//                System.out.print("pilih menu : ");pilih = read.nextInt();
//                System.out.println("==================================");
//                switch(pilih) {
//                case 1 :
//                System.out.print("banyak Mahasiswa        : ");int js = read.nextInt();
//                for (int i = 0; i < js ; i++) {
//        System.out.print("Masukkan NIM            : ");String nomor = read.next();
//        System.out.print("Masukkan Nama Mahasiswa : ");String name = read.next();
//        System.out.print("Masukkan Prodi          : ");String jurusan = read.next();
//        System.out.print("Masukkan Fakultas       : ");String faculty = read.next();
//        mhs[i] = new Mahasiswa(nomor, name, jurusan, faculty);
//        Mahasiswa m = new Mahasiswa(name,nomor,mhs);
//
//        }
//        break;
//        case 2:
//
//        break;
//        case 3 :
//
//        break;
//        case 4:
//
//        break;
//        case 5:
//
//        break;
//        case 9 :
//        System.out.println("Program berakhir");
//        System.exit(0);
//        break;
//default:
//        System.out.println("Data yang di inputkan Salah\n");
//        break;
//        }
//        }
