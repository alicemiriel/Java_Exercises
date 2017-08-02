package pl.gda.ala;

import java.util.Scanner;

public class SecondSample {
    public static void main(String[] args) {
        System.out.println("Jaki bilet? ");

        Scanner in = new Scanner(System.in);
        String bilet = in.nextLine();

        if ((bilet.equalsIgnoreCase("normalny")) || (bilet.equalsIgnoreCase("normalny "))) {
            System.out.println("Cena biletu normalnego wynosi 20 zł. ");
        } else if ((bilet.equalsIgnoreCase("studencki")) || (bilet.equalsIgnoreCase("studencki "))) {
            System.out.println("Cena biletu studenckiego wynosi 10 zł. ");
        } else if (bilet.equalsIgnoreCase("karnet")) {
            System.out.println("Cena karnetu wynosi 100zł. ");
        } else {
            System.out.println("Nie ma takiego biletu na sprzedaż. ");
        }

        switch (bilet) {
            case "normalny":
                System.out.println("normalny bilet kosztuje 20");
                break;
            case "ulgowy":
                System.out.println("ulgowy bilet kosztuje 10");
                break;
            case "karnet":
                System.out.println("karnet kosztuje 100");
                break;
            default:
                System.out.println("Nie ma takiego biletu");
                break;
        }

        for (int i = 10; i > 0; i--) {
            System.out.println("Odliczanie..." + i);
        }
        System.out.println("Start!");
    }
}