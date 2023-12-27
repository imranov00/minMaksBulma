import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kaç tane sayı gireceğini al
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        // Eğer hiç sayı girmeyecekse kullanıcıya bilgi ver ve programı sonlandır
        if (n <= 0) {
            System.out.println("Lütfen geçerli bir sayı girin.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int i = 1;

        // Girilen sayıları kontrol et ve en büyük ile en küçüğü güncelle
        while (i <= n) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int number = scanner.nextInt();

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

            i++;
        }

        // En büyük ve en küçük sayıları ekrana yazdır
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}