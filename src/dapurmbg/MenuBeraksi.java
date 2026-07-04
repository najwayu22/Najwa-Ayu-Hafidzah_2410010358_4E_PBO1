package dapurmbg;

import java.util.Scanner;

public class MenuBeraksi {

    public static void main(String[] args) {

        try {

            Scanner input = new Scanner(System.in);

            System.out.print("Jumlah Data Menu : ");
            int jumlah = Integer.parseInt(input.nextLine());

            MenuDetail[] menu = new MenuDetail[jumlah];

            for (int i = 0; i < menu.length; i++) {

                System.out.println("\n===== DATA MENU KE-" + (i + 1) + " =====");

                System.out.print("Kode Menu          : ");
                String kode = input.nextLine();

                System.out.print("Nama Menu          : ");
                String nama = input.nextLine();

                System.out.print("Kategori (Protein/Sayur/Buah/Susu) : ");
                String kategori = input.nextLine();

                System.out.print("Jumlah Porsi       : ");
                int porsi = Integer.parseInt(input.nextLine());

                System.out.print("Nama Petugas        : ");
                String petugas = input.nextLine();

                System.out.print("Shift (Pagi/Siang)  : ");
                String shift = input.nextLine();

                menu[i] = new MenuDetail(
                        kode,
                        nama,
                        kategori,
                        porsi,
                        new Petugas(
                                petugas,
                                shift));
            }

            System.out.println("\n===============================");
            System.out.println("DATA MENU DAPUR MBG");
            System.out.println("===============================");

            for (MenuDetail m : menu) {

                System.out.println(m.tampilInfo());

                System.out.println("--------------------------------");

            }

        } catch (NumberFormatException e) {
            System.out.println("Terjadi Kesalahan : Input jumlah porsi harus berupa angka!");
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan Umum : " + e.getMessage());
        }

    }

}