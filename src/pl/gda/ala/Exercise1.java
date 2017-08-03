package pl.gda.ala;

        import java.util.Random;
        import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        //Guess the number
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę x:");
        int a = 1;
        int x = in.nextInt();
        int drawnNumber;
        Random random = new Random();
        int randomNumber = random.nextInt(x - a + 1) + a;
        do {
            System.out.println("Zgadnij jaka liczba została wylosowana:");
            drawnNumber = in.nextInt();
            if (drawnNumber > randomNumber) {
                System.out.println("Za duża liczba, podaj kolejna:");
            } else if (drawnNumber < randomNumber) {
                System.out.println("Za mala liczba, podaj kolejna:");
            } else if (drawnNumber < 0 || drawnNumber > x) {
                System.out.println("Liczba spoza zakresu, spróbuj jeszcze raz");
            } else if (drawnNumber == randomNumber || drawnNumber == 0) {
                System.out.println("Dziekuje za gre!");
            }
        } while ((drawnNumber != randomNumber && drawnNumber != 0));

        // Print the tower
        in = new Scanner(System.in);
        System.out.println("Podaj wysokosc wiezy: ");
        int towerHeight = in.nextInt();
        for (int y = 0; y < towerHeight; y = y + 1) {
            System.out.println("");
            for (int b = 0; b <= y; b = b + 1) {
                System.out.print("O");
            }
        }
        //print the rectangular
        in = new Scanner(System.in);
        System.out.println("Podaj wysokosc kwadratu: ");
        int rectangularHeight = in.nextInt();
        System.out.println("Podaj szerokosc kwadratu: ");
        int rectangularWidth = in.nextInt();
        for (int z = 0; z < rectangularHeight; z = z + 1) {
            System.out.println();
            for (int y = 0; y < rectangularWidth; y = y + 1) {
                if (z == 0 || z == rectangularHeight - 1 || y == 0 || y == rectangularWidth - 1) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}