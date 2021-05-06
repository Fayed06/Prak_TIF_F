package Tugas2;

import java.util.Scanner;

public class Siam {
    
    public static void main(String[] args) {
        Mahasiswa[] mahasiswa = new Mahasiswa[999];
        Scanner read = new Scanner(System.in);
        int pilih,penambah;
        pilih = 0; 
        penambah = 0;
        while(pilih != 9) {
            System.out.println("        SIAM");
            System.out.println("==================================");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. List Data Mahasiswa");
            System.out.println("3. Jumlah Mahasiswa");
            System.out.println("4. Keluar");
            System.out.println("==================================");
            System.out.print("pilih menu : ");pilih = read.nextInt();
            System.out.println("==================================");
            switch (pilih) {
                case 1 :
                    System.out.print("Masukkan Nama Mahasiswa : ");String nama = read.next();
                    System.out.print("Masukkan NIM            : ");String nomor = read.next();
                    System.out.print("Masukkan Alamat         : ");String almt = read.next();
                    System.out.print("Masukkan Jenis Kelamin  : ");String kelamin = read.next();
                    System.out.print("Masukkan Prodi          : ");String prodi = read.next();
                    System.out.print("Masukkan Nilai Akhir    : ");int nilai = read.nextInt();
                    mahasiswa[penambah] = new Mahasiswa(nama, nomor, almt, kelamin, prodi, nilai);
                    penambah++;
                    System.out.println();
                    break;
                case 2 :
                    if(penambah != 0) {
                        int temp = 0;
                        System.out.print("Masukkan Nama Mahasiswa : ");String name = read.next();
                        System.out.print("Masukkan Nim Mahasiswa  : ");String no = read.next();
                        int i = 0;
                        while (i<penambah){
                            if(name.equals(mahasiswa[i].getName())){
                                if(no.equals(mahasiswa[i].getNIM())) {
                                    System.out.printf(mahasiswa[i].toString());
                                    System.out.println();
                                    temp++;
                                    break;
                                } else {
                                    System.out.println("NIM SALAH");
                                }
                            }else{
                                System.out.println("Nama SALAH");
                                temp++;
                                break;
                            }
                            i++;
                        }                        
                        if(temp == 0) {
                            System.out.println("Data Kosong");
                        }
                    } 
                    else {
                        System.out.println("Data Kosong");
                    }
                    System.out.println();
                    break;
                    
                case 3 :
                    if(penambah != 0) {
                        Mahasiswa.jumlah();
                    } else {
                        System.out.println("Data Kosong");
                    }
                    System.out.println();
                    break;
                case 4 :
                    System.out.println("Program berakhir");
                    System.exit(0);
                    break;
                default:
                    System.out.println("INPUT SALAH");
                    System.out.println();
            }
        }
    }
}