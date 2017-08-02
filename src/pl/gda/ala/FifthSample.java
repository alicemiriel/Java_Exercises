package pl.gda.ala;
import java.util.Scanner;

// calculate delta!
public class FifthSample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę a: ");
        int a = in.nextInt();
        System.out.println("Podaj liczbę b: ");
        int b = in.nextInt();
        System.out.println("Podaj liczbę c: ");
        int c = in.nextInt();

        int delta= (int)Math.pow(b, 2) - 4* a *c;

        if (delta ==0){
            int e = -b/2*a;
            System.out.println("Rozwiązanie to: " + e);
        }
        else if (delta>0){
            int f = - b - (int)Math.sqrt(Math.pow(b, 2)-4*a*c);
            int g =  b + (int)Math.sqrt(Math.pow(b, 2)-4*a*c);
            System.out.println( "Rozwiązania to: \n" + f + " oraz \n" + g);
        }
        else {
            System.out.println("Brak rozwiązań");
        }
    }
}