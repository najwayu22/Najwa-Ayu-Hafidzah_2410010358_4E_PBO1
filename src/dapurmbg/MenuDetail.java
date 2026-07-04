package dapurmbg;

public class MenuDetail extends MenuMBG {

    private Petugas petugas;

    public MenuDetail(String kodeMenu, String namaMenu, String kategori, int jumlahPorsi, Petugas petugas) {

        super(kodeMenu,
              namaMenu,
              kategori,
              jumlahPorsi);

        this.petugas = petugas;
    }

    // Seleksi
    public String cekPorsi() {

        if (getJumlahPorsi() == 0) {

            return "Porsi Habis";

        } else if (getJumlahPorsi() <= 100) {

            return "Porsi Terbatas";

        } else {

            return "Porsi Tersedia";
        }

    }

    // Seleksi
    public String kategoriMenu() {

        if (getKategori().equalsIgnoreCase("Protein")) {

            return "Menu Protein";

        } else if (getKategori().equalsIgnoreCase("Sayur")) {

            return "Menu Serat";

        } else if (getKategori().equalsIgnoreCase("Buah")) {

            return "Menu Vitamin";
        } else if (getKategori().equalsIgnoreCase("Susu")) {

            return "Menu Energi";

        } else {

            return "Menu Pelengkap";
        }

    }

    // Overriding
    @Override
    public String tampilInfo() {
        return super.tampilInfo()
                + "\nNama Petugas   : "
                + petugas.getNamaPetugas()
                + "\nShift          : "
                + petugas.getShift()
                + "\nStatus Porsi   : "
                + cekPorsi()
                + "\nJenis Menu     : "
                + kategoriMenu();

    }

}