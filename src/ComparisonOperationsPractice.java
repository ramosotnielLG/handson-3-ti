public class ComparisonOperationsPractice {
        public static void main(String[] args) {
            /*
             * PRAKTIK HANDS-ON: Operasi Perbandingan
             *
             * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
             * operator perbandingan dan memahami perilakunya dengan tipe data berbeda.
             */

            // ===== PERBANDINGAN NUMERIK DASAR =====
            System.out.println("=== PERBANDINGAN NUMERIK DASAR ===");

            // Latihan 1: Berlatih semua operator perbandingan dengan integers
            // - Buat dua variabel integer: firstNum = 25, secondNum = 18
            int firstNum = 25, secondNum = 18;
            System.out.println(firstNum+ " > " +secondNum+ " ? " +(firstNum > secondNum));
            System.out.println(firstNum+ " < " +secondNum+ " ? " +(firstNum < secondNum));
            System.out.println(firstNum+ " >= " +secondNum+ " ? " +(firstNum >= secondNum));
            System.out.println(firstNum+ " <= " +secondNum+ " ? " +(firstNum <= secondNum));
            System.out.println(firstNum+ " == " +secondNum+ " ? " +(firstNum == secondNum));
            System.out.println(firstNum+ " != " +secondNum+ " ? " +(firstNum != secondNum));
            // - Bandingkan firstNum > secondNum dan print hasilnya dengan pesan deskriptif

            // - Bandingkan firstNum < secondNum dan print hasilnya dengan pesan deskriptif

            // - Bandingkan firstNum >= secondNum dan print hasilnya dengan pesan deskriptif

            // - Bandingkan firstNum <= secondNum dan print hasilnya dengan pesan deskriptif

            // - Bandingkan firstNum == secondNum dan print hasilnya dengan pesan deskriptif

            // - Bandingkan firstNum != secondNum dan print hasilnya dengan pesan deskriptif

            // ===== PERBANDINGAN FLOATING-POINT =====
            System.out.println("\\n=== PERBANDINGAN FLOATING-POINT ===");

            // Latihan 2: Bekerja dengan perbandingan angka floating-point
            // - Buat dua variabel double: price1 = 19.99, price2 = 20.0
            double price1 = 19.99, price2 = 20.0;
            System.out.println("Apakah price1 lebih murah dari price2? " +(price1 < price2));
            System.out.println("Perbedaan harga < 1.0? " +(Math.abs(price1-price2) < 1.0));

            double sum = 0.1 + 0.2;
            System.out.println("0.1 + 0.2 = " +sum);
            System.out.println("Apakah (0.1 + 0.2) == 0.3? " +(sum == 0.3));
            // - Bandingkan harga mana yang lebih murah menggunakan operator perbandingan yang sesuai

            // - Periksa apakah perbedaan antara harga kurang dari 1.0

            // - Buat skenario dimana dua nilai double seharusnya "sama" tetapi tidak karena presisi
            // Contoh: 0.1 + 0.2 dibandingkan dengan 0.3

            // ===== PERBANDINGAN KARAKTER =====
            System.out.println("\\n=== PERBANDINGAN KARAKTER ===");

            // Latihan 3: Bandingkan karakter menggunakan operator perbandingan
            // - Buat dua variabel char: letter1 = 'A', letter2 = 'B'
            char letter1 = 'A', letter2 = 'B';
            System.out.println("Apakah 'A' < 'B'? " +(letter1 < letter2));
            System.out.println("Apakah 'a' > 'A'? " +('a' > 'A'));

            char digit = '7';
            System.out.println("Apakah '7' digit? " +(digit >= '0' && digit <= '9'));
            // - Bandingkan letter1 < letter2 dan jelaskan mengapa hasilnya masuk akal (nilai ASCII)

            // - Bandingkan huruf kecil dengan huruf besar dan amati hasilnya

            // - Periksa apakah suatu karakter adalah digit dengan membandingkannya dengan '0' dan '9'

            // ===== PERBANDINGAN STRING =====
            System.out.println("\\n=== PERBANDINGAN STRING ===");

            // Latihan 4: Pahami jebakan perbandingan string dan metode yang benar
            // - Buat dua variabel String dengan konten yang sama: name1 = "Java", name2 = "Java"
            String name1 = "Java";
            String name2 = "Java";
            System.out.println("name1 == name2? " +(name1 == name2));

            System.out.println("\"Java\".equals(\"java\")? " +name1.equals("java"));
            System.out.println("\"Java\".equalsIgnoreCase(\"java\") ? "+name1.equalsIgnoreCase("java"));
            // - Bandingkan name1 == name2 dan print hasilnya

            // - Buat string lain: name3 = new String("Java")

            // - Bandingkan name1 == name3 dan print hasilnya - jelaskan mengapa berbeda dari di atas

            // - Gunakan metode .equals() untuk membandingkan name1 dan name3 dengan benar

            // - Demonstrasikan perbandingan case-sensitive dengan .equals()

            // - Demonstrasikan perbandingan case-insensitive dengan .equalsIgnoreCase()

            // ===== APLIKASI PRAKTIS =====
            System.out.println("\\n=== APLIKASI PRAKTIS ===");

            // Latihan 5: Gunakan perbandingan dalam skenario dunia nyata
            // - Buat variabel untuk pengecekan nilai siswa
            // grade = 85, passingGrade = 60, honorRoll = 90
            int grade = 85, passingGrade = 60, honorRoll = 90;
            System.out.println("Apakah siswa lulus? " +(grade >= passingGrade));
            System.out.println("Apakah siswa honor roll? " +(grade >= honorRoll));

            int age = 17, drivingAge = 16, votingAge = 18, drinkingAge = 21;
            System.out.println("Boleh mengemudi? " +(age >= drivingAge));
            System.out.println("Boleh memilih? " +(age >= votingAge));
            System.out.println("Boleh minum alkohol? " +(age >= drinkingAge));

            int originalPrice = 100, discountTreshold = 50, customerAge = 65, seniorAge = 60;
            boolean bulkDiscount = originalPrice > discountTreshold;
            boolean seniorDiscount = customerAge >= seniorAge;
            System.out.println("Diskon bulk? " +bulkDiscount);
            System.out.println("Diskon senior? " +seniorDiscount);
            System.out.println("Layak diskon? " +(bulkDiscount || seniorDiscount));
            // - Periksa apakah siswa lulus menggunakan operator perbandingan

            // - Periksa apakah siswa memenuhi syarat untuk honor roll

            // - Buat skenario verifikasi usia
            // age = 17, drivingAge = 16, votingAge = 18, drinkingAge = 21

            // - Periksa kelayakan untuk mengemudi, memilih, dan minum menggunakan perbandingan

            // Latihan 6: Skenario shopping dan discount
            // - Buat variabel untuk skenario belanja
            // originalPrice = 100, discountThreshold = 50, customerAge = 65, seniorAge = 60

            // - Periksa apakah pembelian memenuhi syarat untuk diskon bulk (harga > threshold)

            // - Periksa apakah pelanggan memenuhi syarat untuk diskon senior

            // - Gabungkan kondisi untuk menentukan kelayakan akhir

            // ===== PENGUJIAN BATAS =====
            System.out.println("\\n=== PENGUJIAN BATAS ===");

            // Latihan 7: Test edge cases dan kondisi batas
            // - Buat variabel 'score' dengan nilai 100
            int score = 100;
            System.out.println("Score valid? " +(score >= 0 && score <= 100));

            score = 0;
            System.out.println("Score = 0 valid? " +(score >= 0 && score <= 100));

            score = 101;
            System.out.println("Score = 101 valid? " +(score >= 0 && score <= 100));

            int suhu = -5;
            System.out.println("Suhu valid (-10 sampai 40)? " +(suhu >= -10 && suhu <= 40));

            int height = 175, minHeight = 160, maxHeight = 200;
            System.out.println("Apakah tinggi dalam rentang? " +(height >= minHeight && height<=maxHeight));

            score = 85;
            if (score >= 90) {
                System.out.println("Nilai: A");
            } else if (score >= 80) {
                System.out.println("Nilai: B");
            } else if (score >= 70) {
                System.out.println("Nilai: C");
            } else if (score >= 60) {
                System.out.println("Nilai: D");
            } else {
                System.out.println("Nilai: F");
            }
            // - Periksa apakah score berada dalam rentang yang valid (0 sampai 100) menggunakan dua operasi perbandingan

            // - Test nilai batas: apa yang terjadi dengan score = 0, score = 100, score = -1, score = 101

            // - Buat pengecekan rentang suhu (rentang valid: -10 sampai 40 derajat Celsius)

            // Latihan 8: Rantai perbandingan dan kondisi kompleks
            // - Buat variabel: height = 175, minHeight = 160, maxHeight = 200

            // - Periksa apakah tinggi berada dalam rentang yang dapat diterima menggunakan operator perbandingan

            // - Buat sistem penilaian menggunakan beberapa perbandingan:
            // score >= 90: "A", score >= 80: "B", score >= 70: "C", score >= 60: "D", selainnya: "F"
        }
    }

