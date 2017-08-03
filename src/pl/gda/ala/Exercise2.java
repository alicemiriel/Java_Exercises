package pl.gda.ala;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int wynik = 0;
        int y = 0;

        for (int b = 0; b < x; b = b + 1) {
            System.out.println(y);
            wynik = wynik + y;
            y = y + 2;
        }
        System.out.println(wynik);


        in = new Scanner(System.in);
        System.out.println("Podaj liczbę dla której chcesz znać wartość silnia: ");
        int wantedNumber = in.nextInt();
        int b = 1;
        for (int c = 1; c <= wantedNumber; c = c + 1) {
            b = b * c;
        }
        System.out.println(b);


        in = new Scanner(System.in);
        System.out.println("Podaj liczbę a: ");
        int numberA = in.nextInt();
        System.out.println("Podaj liczbę x: ");
        int numberX = in.nextInt();
        b = numberA;
        for (int c = 1; c < numberX; c = c + 1) {

            numberA = b * numberA;
            System.out.println(numberA);
        }
        in = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String imie = in.nextLine();
        String name = imie.substring(imie.length() - 1, imie.length());
        if (name.equals("a")) {
            System.out.printf("To imię zenskie.");
        } else {
            System.out.println("To imie meskie");
        }
    }
}


