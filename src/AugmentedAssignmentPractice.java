public class AugmentedAssignmentPractice {
        public static void main(String[] args) {
            /*
             * PRAKTIK HANDS-ON: Augmented Assignments
             *
             * Instruksi: Lengkapi semua tugas latihan di bawah ini untuk berlatih
             * operator augmented assignment dan memahami efisiensinya.
             */

            // ===== AUGMENTED ASSIGNMENTS DASAR =====
            System.out.println("=== AUGMENTED ASSIGNMENTS DASAR ===");

            // Latihan 1: Berlatih semua operator augmented assignment
            // - Deklarasikan variabel 'score' dengan nilai awal 100
            int score = 100;
            score += 25;
            System.out.println("Setelah += 25: " +score);
            score -= 15;
            System.out.println("Setelah -= 15: " +score);
            score *=2;
            System.out.println("Setelah *= 25: " +score);
            score /= 4;
            System.out.println("Setelah /= 25: " +score);
            score %= 10;
            System.out.println("Setelah %= 25: " +score);
            // - Gunakan += untuk menambah 25 ke score, lalu print hasilnya

            // - Gunakan -= untuk mengurangi 15 dari score, lalu print hasilnya

            // - Gunakan *= untuk mengalikan score dengan 2, lalu print hasilnya

            // - Gunakan /= untuk membagi score dengan 4, lalu print hasilnya

            // - Gunakan %= untuk mendapat sisa bagi ketika score dibagi 10, lalu print hasilnya

            // ===== PERBANDINGAN DENGAN REGULAR ASSIGNMENTS =====
            System.out.println("\\n=== PERBANDINGAN: AUGMENTED vs REGULAR ===");

            // Latihan 2: Bandingkan augmented assignments dengan regular assignments
            // - Buat dua variabel identik 'value1' dan 'value2' dengan nilai 50
            int value1 = 50;
            int value2 = 50;

            value1 = value1 + 30;
            value2 += 30;
            System.out.println("value1 = " +value1+ ", value2 = " +value2);

            value1 = 80;
            value2 = 80;
            value1 = value1 * 3;
            value2 *= 3;
            System.out.println("value1 = " +value1+ ", value2 = " +value2);
            // - Untuk value1, gunakan regular assignment: value1 = value1 + 30
            // - Untuk value2, gunakan augmented assignment: value2 += 30
            // - Print kedua nilai untuk memastikan keduanya sama

            // - Reset kedua nilai ke 80
            // - Untuk value1, gunakan regular assignment: value1 = value1 * 3
            // - Untuk value2, gunakan augmented assignment: value2 *= 3
            // - Print kedua nilai untuk memastikan keduanya sama

            // ===== APLIKASI PRAKTIS =====
            System.out.println("\\n=== APLIKASI PRAKTIS ===");

            // Latihan 3: Gunakan augmented assignments dalam skenario praktis
            // - Buat variabel 'bankBalance' dengan nilai awal 1000
            double bankBalance = 1000;
            bankBalance += 250;
            bankBalance -= 75;
            bankBalance *= 1.05;
            System.out.println("Saldo akhir: " +bankBalance);
            // - Simulasikan deposit: tambahkan 250 ke bankBalance menggunakan +=

            // - Simulasikan penarikan: kurangi 75 dari bankBalance menggunakan -=

            // - Simulasikan kalkulasi bunga: kalikan bankBalance dengan 1.05 (bunga 5%) menggunakan *=

            // - Print saldo akhir

            // Latihan 4: Pola counter dan accumulator
            // - Buat variabel 'totalSales' dimulai dari 0
            int totalSales = 0;
            totalSales += 150;
            totalSales += 200;
            totalSales += 175;

            double productionCount = 1000;
            productionCount -= 25;
            productionCount *= 1.1;

            System.out.println("Total penjualan: " +totalSales);
            System.out.println("Jumlah produksi akhir: " +productionCount);
            // - Tambahkan jumlah penjualan harian menggunakan += : hari1 = 150, hari2 = 200, hari3 = 175

            // - Buat variabel 'productionCount' dimulai dari 1000

            // - Simulasikan barang cacat yang dihapus: kurangi 25 menggunakan -=

            // - Simulasikan bonus produksi: kalikan dengan 1.1 menggunakan *=

            // - Print kedua totalSales dan productionCount akhir

            // ===== BEKERJA DENGAN TIPE DATA BERBEDA =====
            System.out.println("\\n=== TIPE DATA BERBEDA ===");

            // Latihan 5: Berlatih augmented assignments dengan berbagai tipe data
            // - Buat variabel double 'temperature' dengan nilai 20.5
            double temperature = 20.5;
            temperature += 5.7;
            temperature *= 1.8;
            temperature += 32;
            System.out.println("Suhu dalam fahrenheit: " +temperature);
            // - Gunakan += untuk menambah 5.7 ke temperature

            // - Gunakan *= untuk mengalikan temperature dengan 1.8 (bagian dari konversi Celsius ke Fahrenheit)

            // - Gunakan += untuk menambah 32 (melengkapi konversi Celsius ke Fahrenheit)

            // - Print suhu akhir dalam Fahrenheit

            // Latihan 6: Penggabungan string dengan +=
            // - Buat variabel String 'message' dengan nilai "Hello"
            String message = "Hello";
            message += " World";
            message += "!";
            System.out.println("Pesan akhir: " +message);
            // - Gunakan += untuk menambah " World" ke message

            // - Gunakan += untuk menambah "!" ke message

            // - Print pesan akhir

            // Latihan 7: Tantangan - Hitung nilai majemuk
            // - Buat variabel 'investment' dengan nilai 5000
            double invesment = 5000;
            invesment *= 1.07;
            invesment *= 1.07;
            invesment *= 1.07;
            double profit = invesment - 5000;

            System.out.println("Nilai investasi akhir: " +invesment);
            System.out.println("Keuntungan: " +profit);
            // - Terapkan pertumbuhan majemuk 3 tahun pada 7% per tahun menggunakan *=
            // (Lakukan ini tiga kali: investment *= 1.07)

            // - Print nilai investasi akhir

            // - Hitung berapa profit yang didapat (nilai akhir - 5000 awal)
        }
    }