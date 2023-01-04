import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;
    System.out.print("Lütfen basamak sayısı giriniz :");
        n = input.nextInt();

        for (int a = n; a >= 1; a--) {

            for (int x = 1; x <= (n - a); x++) {
                System.out.print(" ");

            }
            for (int z = 1; z <= (2 * a) - 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}