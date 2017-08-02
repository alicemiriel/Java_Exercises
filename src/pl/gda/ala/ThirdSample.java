package pl.gda.ala;

import java.util.Scanner;

public class ThirdSample {
    //lopps and conditions

    public static void main(String[] args) {

        for (double x = 0; x <= 100; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("foobar");
            } else if (x % 5 == 0) {
                System.out.println("bar");
            } else if (x % 3 == 0) {
                System.out.println("foo");
            } else {
                System.out.println(x);
            }
        }

        System.out.println("Podaj liczbę: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = 2;
        StringBuilder wynik = new StringBuilder();

        while (x != 1) {
            while (x % y == 0) {
                x = x / y;
                wynik.append("*").append(y);
            }
            y = y + 1;
        }
        System.out.print(wynik);
    }
}
