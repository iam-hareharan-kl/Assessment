package Hareharan;
import java.util.Scanner;
public class Program2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter value of a: ");
            int a = sc.nextInt();

            System.out.print("Output series: ");
            for (int i = 1; i <= a; i++) {
                int odd = 2 * i - 1;
                System.out.print(odd);

                if (i < a) {
                    System.out.print(", ");
                }
            }
        }
    }

