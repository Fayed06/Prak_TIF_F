package Tugas3;
import java.util.Scanner;

public class PinjamOnline {
	private static double saldoSistem = 5000000;
	private double pinjaman;
	public String nama;
	private int lamaPeminjaman;
	private int lamaPinjamBaru;
	private Scanner read;
	
	public PinjamOnline(String nama) {
            this.nama = nama;
            this.pinjaman = 0;
            this.lamaPeminjaman = 0;
            this.read = new Scanner(System.in);
	}
	
	public double getSaldoSistem() {
            return saldoSistem;
	}
	
	public static void setSaldoSistem(double saldoSistem) {
            PinjamOnline.saldoSistem = saldoSistem;
	}
	
	public void setPinjaman(double Pinjaman) {	
            this.pinjaman = Pinjaman;
		
	}
	
	public double getPinjaman() {
            return this.pinjaman;
	}
	
	public void setLamaPinjaman(int lamaPinjaman) {
            this.lamaPeminjaman = lamaPinjaman;
	}
	
	public int getLamaPinjaman() {
            return this.lamaPeminjaman;
	}
	
	public void pinjam() {
		if(getPinjaman() > 0) {
                    System.out.println("Tidak bisa melakukan pinjaman");
                    System.out.println("Silahkan melunasi pinjaman sebelumnya");
                    System.out.println("=====================================================");
                    System.out.println("");
                    return;
		}
		System.out.println("Selamat datang, " + this.nama);
		System.out.println("Silahkan masukan nominal uang yang ingin dipinjam");double pinjam = Double.valueOf(read.nextLine());
		System.out.println("Silahkan masukkan lama peminjaman");this.lamaPinjamBaru = Integer.valueOf(read.nextLine());
		setLamaPinjaman(this.lamaPinjamBaru);
		
		if(this.pinjaman > 0) {
                    System.out.println("Maaf silahkan melunasi terlebih dahulu peminjaman yang sebelumnya");
		} 
                else if (pinjam > saldoSistem){
                    System.out.println("Maaf nominal yang anda masukkan terlalu besar");
                    setLamaPinjaman(0);
		} 
                else {
                    setPinjaman(pinjam);
                    saldoSistem -= pinjam;
                    System.out.println("Pinjaman anda telah berhasil");
		}
		System.out.println("=====================================================");
		System.out.println("");		
	}
	public void kembalikan() {
		if(this.pinjaman == 0) {
                    System.out.println("Maaf anda belum melakukan peminjaman apapun");
                    System.out.println("=====================================================");
                    System.out.println("");
                    return;
		}
		
		System.out.println("Selamat datang, " + this.nama);
		System.out.println("Silahkan masukan nominal uang yang ingin dikembalikan");double kembali = Double.valueOf(read.nextLine());;
		System.out.println("Silahkan masukkan hari pengembalian");int  hari = Integer.valueOf(read.nextLine());
	
		//denda
		int denda = (hari - this.lamaPinjamBaru)*15000;	
		this.pinjaman += denda;
		this.lamaPinjamBaru = hari;
		if(kembali - getPinjaman() >= 0) {
                    saldoSistem += this.pinjaman;
                    setPinjaman(0);
                    setLamaPinjaman(0);
                    System.out.println("Terima kasih telah melunasi peminjaman");
		} else {
                    this.pinjaman -= kembali;
                    saldoSistem += kembali;
                    System.out.println("Terima kasih telah melakukan cicilan");
		}
		System.out.println("=====================================================");
		System.out.println("");
	}
}