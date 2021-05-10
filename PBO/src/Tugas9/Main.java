package Tugas9;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       System.out.println("================Filkom Warehouse==============");
       System.out.print("Masukan jumlah Barang : ");
       int jml = read.nextInt();
       Generic g[] = new Generic[jml];
       for (int i = 0; i < jml ; i++) {
            g[i]= new Generic<Barang>();
            System.out.println("==================barang ke- " + (i+1) +"=================");
            g[i].setData(Barang.read());
       }
       System.out.println("===============================================");
       System.out.println("                     HASIL");
       System.out.println("===============================================");
       System.out.println("Kode    Nama Barang     Berat Barang    Jenis Barang    Harga Barang");
       int TotalHarga =0;
       double TotalBerat = 0;
        for (Generic hasil : g){
            TotalBerat += hasil.getData().getBerat();
            TotalHarga += hasil.getData().getHarga();
            System.out.printf("%-8s%-18S%-14.2f%-16SRp.%d%n",
                    hasil.getData().getKode(),
                    hasil.getData().getNama(),
                    hasil.getData().getBerat(),
                    hasil.getData().getJenis(),
                    hasil.getData().getHarga()
            );
        }
        System.out.println("\nTotal :                   "+TotalBerat+"              "+jml+"             "+TotalHarga);
    }
}
