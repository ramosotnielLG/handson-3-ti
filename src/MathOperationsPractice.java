public class MathOperationsPractice {
        public static void main(String[] args) {
            /*
             * PRAKTIK HANDS-ON: Operasi Matematika
             *
             * Instruksi: Lengkapi semua latihan di bawah ini untuk berlatih
             * operator aritmatika dan memahami berbagai operasi numerik.
             */

            // ===== OPERATOR ARITMATIKA DASAR =====
            System.out.println("=== OPERATOR ARITMATIKA DASAR ===");

            // Latihan 1: Berlatih operasi aritmatika dasar
            // - Deklarasikan dua integer: num1 = 25, num2 = 4
            int num1 = 25;
            int num2 = 4;
            // - Hitung dan simpan hasil penjumlahan num1 dan num2
            int hasilTambah = num1 + num2;
            // - Hitung dan simpan hasil pengurangan num1 dan num2
            int hasilKurang = num1 - num2;
            // - Hitung dan simpan hasil perkalian num1 dan num2
            int hasilKali = num1 * num2;
            // - Hitung dan simpan hasil pembagian num1 dibagi num2 (pembagian integer)
            int hasilBagi = num1 / num2;
            // - Hitung dan simpan sisa bagi num1 dibagi num2 (modulus)
            int hasilModulus = num1 % num2;
            // - Print semua hasil dengan label yang deskriptif
            System.out.println(num1+ " + " +num2+ " = " +hasilTambah);
            System.out.println(num1+ " - " +num2+ " = " +hasilKurang);
            System.out.println(num1+ " * " +num2+ " = " +hasilKali);
            System.out.println(num1+ " / " +num2+ " = " +hasilBagi);
            System.out.println(num1+ " % " +num2+ " = " +hasilModulus);

            // ===== PEMBAGIAN INTEGER VS FLOATING-POINT =====
            System.out.println("\\n=== PEMBAGIAN INTEGER VS FLOATING-POINT ===");

            // Latihan 2: Jelajahi berbagai jenis pembagian
            // - Lakukan pembagian integer: 17 / 5 dan simpan hasilnya
            int pembagianInt = 17 / 5;
            // - Lakukan pembagian floating-point: 17.0 / 5 dan simpan hasilnya
            double a = 17.0;
            int b = 5;
            double hasil = a / b;
            // - Konversi integer ke double sebelum pembagian: (double)17 / 5 dan simpan hasilnya
            int nilai = 17;
            double convertNilai = nilai;
            int nilai2 = 5;
            double hasil2 = (double)nilai / nilai2;
            // - Print ketiga hasil pembagian dan amati perbedaannya
            System.out.println("17 / 5 = " +pembagianInt);
            System.out.println(a+ " / " +b+ " = " +hasil);
            System.out.println(nilai+ " / " + nilai2 + " = " +hasil2);
            // ===== KALKULASI PRAKTIS =====
            System.out.println("\\n=== KALKULASI PRAKTIS ===");

            // Latihan 3: Selesaikan masalah dunia nyata menggunakan operator aritmatika
            // - Hitung luas persegi panjang dengan panjang 12.5 dan lebar 8.3
            double panjang = 12.5;
            double lebar = 8.3;
            double luas = panjang * lebar;
            // - Hitung keliling persegi panjang yang sama
            double keliling = 2 * (panjang * lebar);
            // - Hitung total harga: 3 barang dengan harga $15.99 masing-masing, dengan pajak 8%
            double totalHargaBarang = 3 * 15.99;
            double totalPajak = totalHargaBarang * 0.08;
            double totalHarga = totalHargaBarang + totalPajak;
            // - Konversi suhu dari Celsius ke Fahrenheit menggunakan rumus: F = (C * 9/5) + 32
            int celcius = 25;
            double fahrenheit = (celcius * 9 / 5) + 32;
            // Gunakan Celsius = 25
            // - Hitung berapa minggu penuh dalam 50 hari dan berapa hari sisanya
            int totalHari = 50;
            int hariPerMinggu = 7;
            int totalMinggu = totalHari / hariPerMinggu;
            int sisaHari = totalHari % totalMinggu;
            // - Print semua kalkulasi dengan label dan format yang sesuai
            System.out.println("Luas Persegi Panjang: " +panjang+ " * " +lebar+ " = " +luas);
            System.out.println("Keliling Persegi Panjang: " + " 2 " + "* (" +panjang+ " * " +lebar+ ")" + " + " +keliling);
            System.out.println("Total Harga Barang: " +totalHargaBarang+ " + " +totalPajak+ " = $" +totalHarga);
            System.out.println("Konversi Suhu: (" +celcius+ "c" + "* 9 / 5)" + "+ 32 " + " = " +fahrenheit);
            System.out.println("Berapa minggu penuh dan sisa hari: " +totalMinggu+ " minggu dan " +sisaHari+ " sisa hari ");

            // ===== KALKULASI KOMPLEKS =====
            System.out.println("\\n=== KALKULASI KOMPLEKS ===");

            // Latihan 4: Berlatih ekspresi matematika yang kompleks
            // - Hitung jarak menggunakan rumus: jarak = kecepatan * waktu
            // Gunakan kecepatan = 65.5 km/jam dan waktu = 2.75 jam
            double kecepatan = 65.5;
            double waktu = 2.75;
            double jarak = kecepatan * waktu;
            // - Hitung bunga majemuk menggunakan rumus sederhana: jumlah = pokok * (1 + suku_bunga) ^ waktu
            // Gunakan Math.pow() untuk perpangkatan
            // pokok = 1000, suku_bunga = 0.05 (5%), waktu = 3 tahun
            double pokok = 1000;
            double sukuBunga = 0.05;
            int tahun = 3;
            double jumlah = pokok * Math.pow((1 + sukuBunga), tahun);
            // - Hitung rata-rata dari lima nilai ujian: 85, 92, 78, 96, 88
            int nilaiku1 = 85;
            int nilaiku2 = 92;
            int nilaiku3 = 78;
            int nilaiku4 = 96;
            int nilaiku5 = 88;
            double rataRata = (nilaiku1+ nilaiku2 + nilaiku3 + nilaiku4 + nilaiku5) / 5;
            // - Print semua hasil dengan format yang proper (pertimbangkan menggunakan String.format())
            System.out.println(String.format("Jarak tempuh = %.2f km", jarak));
            System.out.println(String.format("Jumlah setelah bunga majemuk = %.2f", jumlah));
            System.out.println(String.format("Rata-rata nilai ujian = %.2f ", rataRata));
        }
    }


