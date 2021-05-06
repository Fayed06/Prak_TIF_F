package UTP_PBO;

public class Buku {
    private String judul;
    private String penulis;
    private int jumlah;

    public Buku(String judul, String penulis, int jumlah) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlah = jumlah;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void tampilkanInfoBuku() {
        System.out.println("                Info Buku");
        System.out.println("=================================================");
        System.out.println("Judul Buku : " + getJudul() +"\nPenulis Buku : "+getPenulis()+ "\njumlah Buku : "+getJumlah());

    }


}

