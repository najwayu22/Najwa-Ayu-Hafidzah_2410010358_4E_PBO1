package dapurmbg;

public class MenuMBG {

    // Encapsulation
    protected String kodeMenu;
    protected String namaMenu;
    protected String kategori;
    protected int jumlahPorsi;

    // Constructor kosong
    public MenuMBG() {
        System.out.println("Data Menu MBG");
    }

    // Constructor berparameter
    public MenuMBG(String kodeMenu,
                   String namaMenu,
                   String kategori,
                   int jumlahPorsi) {

        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.kategori = kategori;
        this.jumlahPorsi = jumlahPorsi;
    }

    // Mutator
    public void setKodeMenu(String kodeMenu) {
        this.kodeMenu = kodeMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setJumlahPorsi(int jumlahPorsi) {
        this.jumlahPorsi = jumlahPorsi;
    }

    // Accessor
    public String getKodeMenu() {
        return kodeMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public String getKategori() {
        return kategori;
    }

    public int getJumlahPorsi() {
        return jumlahPorsi;
    }

    // Method biasa
    public String tampilInfo() {

        return "Kode Menu      : " + getKodeMenu()
                + "\nNama Menu      : " + getNamaMenu()
                + "\nKategori       : " + getKategori()
                + "\nJumlah Porsi   : " + getJumlahPorsi();
    }

    // Overloading
    public String tampilInfo(String lokasi) {

        return tampilInfo()
                + "\nLokasi Dapur  : " + lokasi;
    }

}