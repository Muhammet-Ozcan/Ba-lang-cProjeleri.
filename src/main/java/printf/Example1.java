package printf;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Çarpım tablosu için bir sayi giriniz:");
        int v = input.nextInt();

        for (int i = 1; i<=v ; i++) {
            for (int j = 1; j<=v ; j++) {

                System.out.printf("%4d", i*j);
            }

            System.out.println("");
        }
    }
}
