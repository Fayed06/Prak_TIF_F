package Tugas7;

public abstract class BangunDatar {
    private String nama;
    static String[] listBangunDatar = new String[10];
    static int jml = 0;
    public BangunDatar() {
    }
    public BangunDatar(String nama) {
        if (jml > 10){
            System.out.println("Melebihi batas");
            System.exit(0);
        }
        this.nama = nama;
        listBangunDatar[jml] = nama;
        jml++;
    }
    abstract public void info();

    public String getNama() {
        return nama;
    }

    public void search(String input){
        int jumlah = 0;
        int sisi = 0;
        int sudut = 0;
        String rumus = "";
        System.out.println("[Search Function]");
        for (String s : listBangunDatar) {
            if (input.equalsIgnoreCase(s)) {
                jumlah++;
            }
        }
        if (jumlah == 0) {
            System.out.println("Bangun Datar tidak ditemukan\n");
            return;
        }
        switch (input){
            case "lingkaran":
                sisi = 1;
                rumus = "Rumus luas = PI * jari * jari\n" +
                        "Rumus keliling = PI * 2 * jari";
                break;
            case "segitiga":
                sisi = 3;
                sudut = 3;
                rumus = "Rumus luas = alas * tinggi / 2\n" +
                        "Rumus keliling = alas + tinggi + miring";
                break;
            case "persegi":
                sisi = 4;
                sudut = 4;
                rumus = "Rumus luas = sisi * sisi\n" +
                        "Rumus keliling = 4 * sisi";
                break;
            case "trapesium":
                sisi = 4;
                sudut = 4;
                rumus = "Rumus luas = (alas atas + alas bawah) / 2 * tinggi\n" +
                        "Rumus keliling = alas atas + alas bawah + 2 * sisi miring";
                break;
            case "layang":
                sisi = 4;
                sudut = 4;
                rumus = "Rumus luas = diagonal1 * diagonal2\n" +
                        "Rumus keliling = 2 * sisimiring1 + 2 * sisimiring2";
                break;
        }

        System.out.println("" + "Bangun datar " + input + " ditemukan.\n" +
                "jumlah bangun datar " + input + " dalam list = " + jumlah +"\n" +
                "jumlah sisi bangun datar = " + sisi + "\n" +
                "jumlah sudut bangun datar = " + sudut + "\n" +
                "rumus bangun datar adalah:\n" + "" + rumus + "\n");
    }
    public static BangunDatar
    getInstanceBangunDatarOf(Hitung bangun){
        BangunDatar bangunDatar = null;
        if(bangun instanceof Persegi)
            bangunDatar = (Persegi)bangun;
        else if(bangun instanceof Segitiga)
            bangunDatar = (Segitiga) bangun;
        else if(bangun instanceof Lingkaran)
            bangunDatar = (Lingkaran) bangun;
        else if(bangun instanceof Trapesium)
            bangunDatar = (Trapesium) bangun;
        else if(bangun instanceof Layang)
            bangunDatar = (Layang)bangun;
        return bangunDatar;
    }
}
//        if (input.equalsIgnoreCase("lingkaran")){
//                sisi = 1;
//                rumus = "Rumus luas = PI * jari * jari\n" +
//                "Rumus keliling = PI * 2 * jari";
//                } else if (input.equalsIgnoreCase("segitiga")){
//                sisi = 3;
//                sudut = 3;
//                rumus = "Rumus luas = alas * tinggi / 2\n" +
//                "Rumus keliling = alas + tinggi + miring";
//                } else if (input.equalsIgnoreCase("persegi")){
//                sisi = 4;
//                sudut = 4;
//                rumus = "Rumus luas = sisi * sisi\n" +
//                "Rumus keliling = 4 * sisi";
//                } else if (input.equalsIgnoreCase("trapesium")){
//                sisi = 4;
//                sudut = 4;
//                rumus = "Rumus luas = (alas atas + alas bawah) / 2 * tinggi\n" +
//                "Rumus keliling = alas atas + alas bawah + 2 * sisi miring";
//                } else if (input.equalsIgnoreCase("layang")){
//                sisi = 4;
//                sudut = 4;
//                rumus = "Rumus luas = diagonal1 * diagonal2\n" +
//                "Rumus keliling = 2 * sisimiring1 + 2 * sisimiring2";
//                }