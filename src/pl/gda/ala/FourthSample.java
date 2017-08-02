package pl.gda.ala;

import java.util.Scanner;

/**
 * Created by Ala on 28.02.2016.
 */

// calculator

public class FourthSample {

    public static void main(String[] args) {

        String odp;
        do {
            System.out.println("Podaj działanie:");
            Scanner in = new Scanner(System.in);
            String dzialanie = in.nextLine();
            String znak;

            dzialanie = dzialanie.replace(" ", "");

            int d = dzialanie.indexOf("+");
            znak = "+";
            if (d == -1) {
                d = dzialanie.indexOf("*");
                znak = "*";
            }
            if (d == -1) {
                d = dzialanie.indexOf("/");
                znak = "/";
            }
            if (d == -1) {
                d = dzialanie.indexOf("-");
                znak = "-";
            }

            String a = dzialanie.substring(0, d);
            String b = dzialanie.substring(d + 1, dzialanie.length());
            double aa = Double.parseDouble(a);
            double bb = Double.parseDouble(b);

            if (znak == "+") System.out.println(aa + bb);
            else if (znak == "*") System.out.println(aa * bb);
            else if (znak == "/") System.out.println(aa / bb);
            else if (znak == "-") System.out.println(aa - bb);

            System.out.println("Wykonać kolejne dzialanie?");
            odp = in.nextLine();
        } while (odp.equals("Tak"));
    }
}