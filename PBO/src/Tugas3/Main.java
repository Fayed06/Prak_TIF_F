package Tugas3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("=====================================================");
        System.out.println("Selamat datang di Pinjaman Online");
        System.out.print("Berapa jumlah akun yang ingin dibuat ? ");PinjamOnline[] akun = new PinjamOnline[Integer.valueOf(read.nextLine())];
        System.out.println("");
        
        //memasukan data akun #opsional
        int i = 0;
        while(i<akun.length){
            System.out.println("Akun ke-" + (i+1));
            System.out.print("Nama: ");akun[i] = new PinjamOnline(read.nextLine());
            System.out.println("");
            i++;
        }

        //pemanggilan class
        akun[0].pinjam();
        akun[1].pinjam();
        akun[2].pinjam();
        akun[2].kembalikan();
        akun[0].kembalikan();
        akun[3].pinjam();
        akun[3].kembalikan();
        akun[2].pinjam();
        akun[1].pinjam();
        akun[1].kembalikan();
        akun[2].kembalikan();
        akun[1].pinjam();

        
        //nampilin data informasi #wajib
        for(PinjamOnline peminjam : akun) {
            System.out.println("Nama: " + peminjam.nama);
            System.out.println("Lama Peminjaman: " + peminjam.getLamaPinjaman());
            System.out.println("Nominal Pinjaman: " + peminjam.getPinjaman());
        }
        System.out.println("");
        System.out.println("Sisa Saldo Sistem: " + akun[0].getSaldoSistem());
    }
}