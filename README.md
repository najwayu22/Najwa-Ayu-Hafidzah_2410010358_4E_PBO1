# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi **Sistem Manajemen Dapur MBG (Makan Bergizi Gratis)** menggunakan Java sebagai tugas akhir mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini digunakan untuk mengelola data menu makanan pada Dapur MBG. Pengguna dapat memasukkan data menu berupa kode menu, nama menu, kategori makanan, jumlah porsi, nama petugas, dan shift kerja petugas. 
Program kemudian akan menampilkan seluruh informasi menu beserta status ketersediaan porsi, jenis menu berdasarkan kategori, serta informasi petugas yang bertanggung jawab.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam Pemrograman Berorientasi Objek (Object Oriented Programming/OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism (Overloading dan Overriding), Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `MenuMBG`, `Petugas`, `MenuDetail` dan `MenuBeraksi` adalah contoh dari class.

```bash
public class MenuMBG {

}

public class Petugas {

}

public class MenuDetail extends MenuMBG {

}

public class MenuBeraksi {

}
```

2. **Object** adalah instance dari class. Pada kode ini, `menu[i] = new MenuDetail(...);` adalah contoh pembuatan object.

```bash
menu[i] = new MenuDetail(
        kode,
        nama,
        kategori,
        porsi,
        new Petugas(
                petugas,
                shift));
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `kodeMenu` dan `namaMenu` adalah contoh atribut.

Pada class MenuMBG terdapat empat atribut.

```bash
private String kodeMenu;
private String namaMenu;
private String kategori;
private int jumlahPorsi;
```
Sedangkan pada class Petugas terdapat dua atribut.

```bash
private String namaPetugas;
private String shift;
```
Kemudian pada class MenuDetail terdapat satu atribut.

```bash
private Petugas petugas;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `MenuMBG`,`Petugas` dan `MenuDetail`.

Pada class MenuMBG terdapat constructor kosong dan constructor berparameter.

```bash
public MenuMBG(){

    System.out.println("Data Menu MBG");

}

public MenuMBG(String kodeMenu,
               String namaMenu,
               String kategori,
               int jumlahPorsi){

    this.kodeMenu = kodeMenu;
    this.namaMenu = namaMenu;
    this.kategori = kategori;
    this.jumlahPorsi = jumlahPorsi;

}
```
Selanjutnya pada class Petugas terdapat sebuah constructor berparameter.

```bash
public Petugas(String namaPetugas, String shift){
    this.namaPetugas = namaPetugas;
    this.shift = shift;
}
```
Sedangkan pada class MenuDetail digunakan constructor untuk memanggil constructor superclass.

```bash
public MenuDetail(String kodeMenu,
                  String namaMenu,
                  String kategori,
                  int jumlahPorsi,
                  Petugas petugas){

    super(kodeMenu,
          namaMenu,
          kategori,
          jumlahPorsi);

    this.petugas = petugas;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setKodeMenu` dan `setNamaMenu` adalah contoh method mutator.

```bash
public void setKodeMenu(String kodeMenu){
    this.kodeMenu = kodeMenu;
}

public void setNamaMenu(String namaMenu){
    this.namaMenu = namaMenu;
}

public void setKategori(String kategori){
    this.kategori = kategori;
}

public void setJumlahPorsi(int jumlahPorsi){
    this.jumlahPorsi = jumlahPorsi;
}
```
Pada class Petugas juga terdapat method mutator.

```bash
public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }
public void setShift(String shift) {
        this.shift = shift;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getKodeMenu`, `getNamaMenu`, `getKategori`, dan `getJumlahPorsi` adalah contoh method accessor.

```bash
public String getKodeMenu(){
    return kodeMenu;
}

public String getNamaMenu(){
    return namaMenu;
}

public String getKategori(){
    return kategori;
}

public int getJumlahPorsi(){
    return jumlahPorsi;
}
```
Pada class Petugas juga terdapat method accessor.
```bash
public String getNamaPetugas() {
        return namaPetugas;
    }
public String getShift() {
        return shift;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `kodeMenu`,`namaMenu`,`kategori`,`jumlahPorsi`,`namaPetugas`, dan `shift` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String kodeMenu;
private String namaMenu;
private String kategori;
private int jumlahPorsi;

private String namaPetugas;
private String shift;

private Petugas petugas;

```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MenuDetail` mewarisi `MenuMBG` dengan sintaks `extends`.

```bash
public class MenuDetail extends MenuMBG
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilInfo(String)` di `MenuMBG` merupakan overloading method `tampilInfo` dan `tampilInfo` di `MenuDetail` merupakan override dari method `tampilInfo` di `MenuMBG`.

```bash
public String tampilInfo(String lokasi) {
    return tampilInfo() + "\nLokasi Dapur   : " + lokasi;
}

@Override
public String tampilInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `cekPorsi` dan `kategoriMenu`.

```bash
if(getJumlahPorsi()==0){

    return "Porsi Habis";

}else if(getJumlahPorsi()<=100){

    return "Porsi Terbatas";

}else{

    return "Porsi Tersedia";

}
```

Seleksi juga digunakan untuk menentukan jenis menu.

```bash
if(getKategori().equalsIgnoreCase("Protein")){

    return "Menu Protein";

}else if(getKategori().equalsIgnoreCase("Sayur")){

    return "Menu Serat";

}else if(getKategori().equalsIgnoreCase("Buah")){

    return "Menu Vitamin";

}else if(getKategori().equalsIgnoreCase("Susu")){

    return "Menu Energi";

}else{

    return "Menu Pelengkap";

}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0;i<menu.length;i++){

    ...

}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);

System.out.print("Jumlah Data Menu : ");
int jumlah = Integer.parseInt(input.nextLine());

System.out.print("Kode Menu : ");
String kode = input.nextLine();

System.out.print("Nama Menu : ");
String nama = input.nextLine();

System.out.print("Kategori (Protein/Sayur/Buah/Susu) : ");
String kategori = input.nextLine();

System.out.print("Jumlah Porsi : ");
int porsi = Integer.parseInt(input.nextLine());

System.out.print("Nama Petugas : ");
String petugas = input.nextLine();

System.out.print("Shift (Pagi/Siang) : ");
String shift = input.nextLine();

System.out.println("\n===============================");
System.out.println("DATA MENU DAPUR MBG");
System.out.println("===============================");

for(MenuDetail m : menu){

    System.out.println(m.tampilInfo());

}
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MenuDetail[] menu = new MenuDetail[jumlah];` adalah contoh penggunaan array.

```bash
MenuDetail[] menu = new MenuDetail[jumlah];
```
14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `ry catch` untuk menangani error.

```bash
try{

    ...

}catch(NumberFormatException e){

    System.out.println(
        "Terjadi Kesalahan : Input jumlah porsi harus berupa angka!");

}catch(Exception e){

    System.out.println(
        "Terjadi Kesalahan Umum : "
        + e.getMessage());

}
```

## Usulan Nilai

| No | Materi | Nilai |
|:-:|----------------------|:---:|
|1|Class|5|
|2|Object|5|
|3|Atribut|5|
|4|Constructor|5|
|5|Mutator|5|
|6|Accessor|5|
|7|Encapsulation|5|
|8|Inheritance|5|
|9|Polymorphism|10|
|10|Seleksi|5|
|11|Perulangan|5|
|12|IO Sederhana|10|
|13|Array|15|
|14|Error Handling|15|
||**TOTAL**|**100**|

---

## Pembuat

Nama : Najwa Ayu Hafidzah
NPM  : 2410010358
