<!-- # TUGAS
### TUGAS 1
[Tugas1 / T1Job11_08.java](/T1Job11_08.java)\
Contoh output\
![Screenshot Output Tugas 1](/SS_T1J11.png) -->

# Percobaan
1. [Percobaan 1](#percobaan-1)
- [Pertanyaan](#pertanyaan)
    * [Jawaban](#jawaban)
2. [Percobaan 2](#percobaan-2)
- [Pertanyaan](#pertanyaan-1)
    * [Jawaban](#jawaban-1)
3. [Percobaan 3](#percobaan-3)
- [Pertanyaan](#pertanyaan-2)
    * [Jawaban](#jawaban-2)
4. [Percobaan 4](#percobaan-4)
- [Pertanyaan](#pertanyaan-3)
    * [Jawaban](#jawaban-3)


## Percobaan 1
[Bioskop08.java](/Bioskop08.java)\
(Pastikan periksa commit history dan deskripsi commit)\
[Kondisi Initial Bioskop08.java Sebelum Pertanyaan Percobaan. (Commit e7d5ebb)](https://github.com/okeokke/daspro-jobsheet11/commit/e7d5ebb9277a2b85cb7486a0019f02d7c70f99ca)
### Pertanyaan
1. Apakah  pengisian  elemen  array  harus  dilakukan  secara  berurutan  mulai  dari  indeks ke-0? Jelaskan! 
2. Mengapa terdapat `null` pada daftar nama penonton? 
3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut
```java
penonton[0][0] = "Amin";
penonton[0][1] = "Bena";
penonton[1][0] = "Candra";
penonton[1][1] = "Dela";
penonton[2][0] = "Eka";
penonton[2][1] = "Farhan";
penonton[3][0] = "Gisel";
```
4. Tambahkan kode program sebagai berikut :
```java
System.out.println(penonton.length);
System.out.println(penonton[0].length);
System.out.println(penonton[1].length);
System.out.println(penonton[2].length);
System.out.println(penonton[3].length);
```
Jelaskan fungsi dari `penonton.length` dan `penonton[0].length`!
Apakah `penonton[0].length`, `penonton[1].length`, `penonton[2].length`, dan `penonton[3].length` memiliki nilai yang sama? mengapa?
5. Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris pada array **menggunakan for loop**. Compile, run, lalu amati hasilnya. 
```java
System.out.println(penonton.length);

for (int i = 0; i < penonton.length; i++) {
    System.out.println("Panjang baris ke-" + (i+1) + ": " + penonton[i].length);
}
```
6. Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris pada array **menggunakan foreach loop**. Compile, run, lalu amati hasilnya.
```java
System.out.println(penonton.length);
for (String[] barisPenonton : penonton) {
    System.out.println("Panjang baris: " + barisPenonton.length);
}
```
7. Tambahkan  kode  program  untuk  menampilkan  nama  penonton  pada  baris  ke-3 **menggunakan for loop**. Compile, run, lalu amati hasilnya. 
```java
System.out.println("Penonton pada baris ke-3: ");

for (int i = 0; i < penonton [2].length; i++) {
    System.out.println(penonton [2][i]);
}
```
8. Modifikasi  kode  program  pada  pertanyaan  7  menjadi  perulangan  **dengan foreach loop**. Compile, run, lalu lakukan amati hasilnya.
```java
System.out.println("Penonton pada baris ke-3: ");

for (String i : penonton[2]) {
    System.out.println(i);
}
```
9. Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama penonton untuk setiap baris. Compile dan run program kemudian amati hasilnya.
```java
for (int dot i = 0 ; dot i < penonton.length; i++) {
    System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
}
```
10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop? 
11. Berapa indeks baris maksimal untuk array penonton? 
12. Berapa indeks kolom maksimal untuk array penonton? 
13. Apa fungsi dari `String.join()`?


### Jawaban
1. tidak perlu, pengisian nilai array tergantung pada indeks yang dicantumkan dalam kurung siku.
2. null terdapat pada indeks terakhir dikarenakan indeks tersebut belum diberi sebuah value, dalam kasus string, jika sebuah string diinisialisasi tapi belum diberi nilai maka nilai defaultnya akan berupa "null"
3. [Bioskop08.java | (Commit 7bbcc2d)](https://github.com/okeokke/daspro-jobsheet11/commit/7bbcc2d1ae9dea92653dcf5890c8064c83dec814)\
4. yang pertama (`penonton.length`) digunakan untuk mengecek panjang kolom pada array 1 dimensi, tetapi pada array 2 dimensi, sintaks tersebut digunakan untuk mengecek panjang/jumlah baris pada suatu array, pada kasus ini, outputnya (4).\
sedangkan `penonton[x].length` untuk mengecek panjang kolom pada baris array yang dipilih (bisa menggunakan angka atau variabel integer). pada kasus ini, semuanya sama (2) karena saat kita inisialisasikan tadi, kita tentukan bahwa setiap baris memiliki jumlah/panjang kolom yang sama.\
5. ![Screenshot hasil pengerjaan No.5 Per.1](/daspro-jobsheet11/P1N5.png)

## Percobaan 2
<!-- [BioskopWithScanner08.java](/BioskopWithScanner08.java)\
(Pastikan periksa commit history dan deskripsi commit)\
[Kondisi Initial BioskopWithScanner08.java Sebelum Pertanyaan Percobaan. (Commit ------)]() -->


### Pertanyaan
1. Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan! 
2. Modifikasi kode program untuk memberikan opsi menu sebagai berikut: 
- Menu 1: Input data penonton 
- Menu 2: Tampilkan daftar penonton 
- Menu 3: Exit 
3. Modifikasi  kode  program  untuk  menghandle  apabila  nomor  baris kolom  kursi  yang tidak tersedia 
4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang dipilih sudah terisi oleh penonton lainnya lalu munculkan perintah untuk memasukkan baris dan kolom kembali  
5. Pada menu 2, jika kursi kosong, ganti `null` dengan `***`

### Jawaban




## Percobaan 3
<!-- [Numbers08.java](/Numbers08.java)\
(Pastikan periksa commit history dan deskripsi commit)\
[Kondisi Initial Numbers08.java Sebelum Pertanyaan Percobaan. (Commit ------)]() -->

### Pertanyaan
1. Tambahkan kode program sebagai berikut 
```java
for (int i = 0; i < myNumbers.length; i++) {
    System.out.println(Arrays.toString(myNumbers[i]));
}
```
2. Apa fungsi dari `Arrays.toString()`?
3. Apa nilai default untuk elemen pada array dengan tipe data int?
Apa keluaran dari program? Jelaskan maksud dari statement tersebut.\
4. Tambahkan kode program berikut
```java
for (int i = 0 i < myNumbers.length; i++) {
System.out.println("Panjang baris ke-" + (i+1) + ": "+ myNumbers[i].length);
}
```
5. Array  myNumbers  memiliki  length  berbeda  untuk  setiap  barisnya.  Apakah  panjang array dapat dimodifikasi setelah diinstansiasi?

### Jawaban




## Percobaan 4
<!-- [SIAKAD08.java](/SIAKAD08.java)\
(Pastikan periksa commit history dan deskripsi commit)\
[Kondisi Initial SIAKAD08.java Sebelum Pertanyaan Percobaan. (Commit ------)]() -->

### Pertanyaan
1. Bagaimana jika terdapat perubahan jumlah siswa dan jumlah mata kuliah? Modifikasi kode  program  SIAKAD  untuk  mengakomodasi  jumlah  siswa  dan  jumlah  mata  kuliah yang dinamis.


### Jawaban
