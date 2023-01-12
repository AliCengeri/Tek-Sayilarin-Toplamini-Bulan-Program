import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, toplam = 0;
        do {
            System.out.print("Sayı Giriniz: ");
            a = inp.nextInt();
            if (a % 4 == 0) {
                toplam += a;
            }
        } while (a % 2 != 1);
        System.out.print("Sayıların toplamı: " + toplam);
    }
}