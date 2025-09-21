public class UnaryOperatorsPractice {
        public static void main(String[] args) {
            /*
             * PRAKTIK HANDS-ON: Unary Operators
             *
             * Instruksi: Lengkapi semua latihan di bawah ini untuk memahami
             * unary operators, terutama perbedaan antara pre dan post increment/decrement.
             */

            // ===== OPERATOR INCREMENT DAN DECREMENT =====
            System.out.println("=== OPERATOR INCREMENT DAN DECREMENT ===");

            // Latihan 1: Increment dan decrement dasar
            // - Buat variabel 'counter' dengan nilai 5
            int counter = 5;
            System.out.println("Awal counter: " +counter);
            // - Gunakan pre-increment (++counter) dan print hasilnya
            System.out.println("Pre-increment: " +(++counter));
            // - Gunakan post-increment (counter++) dan print hasilnya
            System.out.println("Post-increment: " +(counter++)+ "| Setelah increment: " +counter);
            // - Reset counter ke 5, lalu gunakan pre-decrement (--counter) dan print hasilnya
            counter = 5;
            System.out.println("Reset counter ke 5");
            System.out.println("Pre-decrement " +(--counter));
            System.out.println("Post-decrement: " +(counter--)+ "| Setelah decrement" +counter);
            // - Gunakan post-decrement (counter--) dan print hasilnya

            // ===== PERILAKU PRE vs POST INCREMENT =====
            System.out.println("\\n=== PERILAKU PRE vs POST INCREMENT ===");

            // Latihan 2: Pahami perbedaan antara pre dan post increment
            // - Buat dua variabel: a = 10, b = 10
            int a = 10;
            int b = 10;
            int hasil1 = ++a;
            System.out.println("a setelah ++a = " +a+ ", hasil1 " +hasil1);

            int hasil2 = b++;
            System.out.println("b setelah b++ = " +b+ ", hasil2 " +hasil2);
            // - Buat variabel 'result1' dan assign nilai dari ++a (pre-increment)
            // - Print kedua 'a' dan 'result1' - amati nilainya

            // - Buat variabel 'result2' dan assign nilai dari b++ (post-increment)
            // - Print kedua 'b' dan 'result2' - amati nilainya

            // - Jelaskan dalam komentar apa yang Anda amati tentang perbedaannya

            // ===== PERILAKU PRE vs POST DECREMENT =====
            System.out.println("\\n=== PERILAKU PRE vs POST DECREMENT ===");

            // Latihan 3: Pahami perbedaan antara pre dan post decrement
            // - Buat dua variabel: x = 8, y = 8
            int x = 8;
            int y = 8;
            System.out.println("--x = " +(--x)+ "| x sekarang = " +x);
            System.out.println("y-- = " +(y--)+ "| y sekarang = " +y);
            // - Print nilai dari --x (pre-decrement) dan kemudian print x lagi

            // - Print nilai dari y-- (post-decrement) dan kemudian print y lagi

            // - Tulis komentar yang menjelaskan kapan decrement terjadi pada setiap kasus

            // ===== UNARY PLUS DAN MINUS =====
            System.out.println("\\n=== UNARY PLUS DAN MINUS ===");

            // Latihan 4: Berlatih operator unary plus dan minus
            // - Buat variabel integer positif 'positive' dengan nilai 42
            int positive = 42;
            int negative = -positive;
            int kePositif = -negative;
            int plusValue = +positive;

            System.out.println("Positive = " +positive);
            System.out.println("Negative = " +negative);
            System.out.println("kePositif = " +kePositif);
            System.out.println("plusValue = " +plusValue);
            // - Buat variabel integer negatif 'negative' menggunakan operator unary minus pada positive

            // - Buat variabel 'backToPositive' menggunakan unary minus pada negative (membuatnya positif lagi)

            // - Print ketiga variabel tersebut

            // - Demonstrasikan bahwa unary plus tidak mengubah nilai (buat variabel dengan +positive)

            // ===== OPERATOR BOOLEAN NOT =====
            System.out.println("\\n=== OPERATOR BOOLEAN NOT ===");

            // Latihan 5: Berlatih operator boolean NOT
            // - Buat variabel boolean 'isReady' dengan nilai true
            boolean isReady = true;
            boolean isNotReady = !isReady;

            System.out.println("isReady = " +isReady);
            System.out.println("isNotReady = " +isNotReady);

            int angka = 7;
            System.out.println("Apakah angka != 0 ? " +(angka !=0));

            boolean doubleNot = !!isReady;
            System.out.println("!!isReady = " +doubleNot);
            // - Buat boolean lain 'isNotReady' menggunakan operator NOT (!) pada isReady

            // - Print kedua variabel

            // - Buat ekspresi boolean yang mengecek apakah suatu angka TIDAK sama dengan nol
            // Gunakan angka apapun dan print hasilnya

            // - Rangkai beberapa operator NOT: buat variabel dengan !!isReady dan amati hasilnya

            // ===== APLIKASI PRAKTIS =====
            System.out.println("\\n=== APLIKASI PRAKTIS ===");

            // Latihan 6: Gunakan unary operators dalam skenario praktis
            // - Buat variabel 'attempts' dimulai dari 0
            int attempts = 0;
            attempts++;
            System.out.println("Attempt: " +attempts);
            attempts++;
            System.out.println("Attempt: " +attempts);
            attempts++;
            System.out.println("Attempt: " +attempts);

            int lives = 3;
            lives--;
            System.out.println("Lives remaining: " +lives);
            lives--;
            System.out.println("Lives remaining: " +lives);
            lives--;
            System.out.println("Lives remaining: " +lives);

            System.out.println("Loop counter dengan increment: ");
            int i = 1;
            while (i <= 5) {
                System.out.println("i = " +i);
                i++;
            }

            System.out.println("Countdown dengan decrement");
            int countdown = 3;
            while (countdown > 0){
                System.out.println("Countdown: " +countdown);
                countdown--;
            }
            // - Simulasikan tiga percobaan login yang gagal dengan increment 'attempts' setiap kali
            // Print "Attempt: " + attempts setelah setiap increment

            // - Buat variabel 'lives' dimulai dari 3

            // - Simulasikan kehilangan nyawa dalam game dengan decrement 'lives'
            // Print "Lives remaining: " + lives setelah setiap decrement

            // Latihan 7: Loop counters dengan increment/decrement
            // - Gunakan while loop yang berjalan 5 kali menggunakan post-increment
            // Buat variabel 'i' dimulai dari 1, kondisi: i <= 5, increment: i++
            // Print loop counter setiap iterasi

            // - Gunakan while loop yang menghitung mundur dari 3 ke 1 menggunakan post-decrement
            // Buat variabel 'countdown' dimulai dari 3, kondisi: countdown > 0, decrement: countdown--
            // Print "Countdown: " + countdown setiap iterasi

            // ===== SKENARIO MENANTANG =====
            System.out.println("\\n=== SKENARIO MENANTANG ===");

            // Latihan 8: Skenario increment/decrement kompleks
            // - Buat variabel 'value' dengan nilai awal 5
            int value = 5;
            int result1 = value++ + ++value;
            System.out.println("Hasil value++ + ++value = " +result1+ "| value akhir = " +value);

            value = 5;
            int result2 = --value + value--;
            System.out.println("Hasil --value + value-- = " +result2+ "| value akhir = " +value);

            int score = 10;
            int max1 = Math.max(++score, 12);
            System.out.println("Math.max(++score, 12) = " +max1+ "| score sekarang = " +score);

            score = 10;
            int max2 = Math.max(score++, 12);
            System.out.println("Math.max(score++, 12) = " +max2+ "| score sekarang = " +score);
            // - Hitung dan simpan hasil dari: value++ + ++value
            // Print kedua hasil dan nilai akhir dari 'value'

            // - Reset value ke 5, lalu hitung: --value + value--
            // Print kedua hasil dan nilai akhir dari 'value'

            // - Prediksi hasilnya sebelum menjalankan dan tambahkan komentar dengan prediksi Anda

            // Latihan 9: Increment/Decrement dengan pemanggilan method
            // - Buat variabel 'score' dengan nilai 10

            // - Print hasil dari Math.max(++score, 12)
            // Kemudian print nilai score saat ini

            // - Reset score ke 10, lalu print hasil dari Math.max(score++, 12)
            // Kemudian print nilai score saat ini

            // - Komentari perbedaan perilaku yang Anda amati
        }
    }