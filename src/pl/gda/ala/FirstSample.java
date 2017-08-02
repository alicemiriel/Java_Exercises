package pl.gda.ala;

import java.util.Scanner;

/**
 * Created by Ala on 28.02.2016.
 */
public class FirstSample
{
    public static void main(String[] args)
    {
        //simple math equations
        final double CM_PEINCH = 2.54;
        double paperWidth = 8.5;
        double paperHight = 9;

        paperHight = paperHight + 4;
        paperHight+=4;
        System.out.println("Rozmiar papieru w centymetrach: " + paperWidth * CM_PEINCH + " \n na " +paperHight * CM_PEINCH);


        int m = 7;
        int n = 7;
        int a = 2 * ++m;
        int b = 2* n++;
        System.out.println (a + " " + b);

        double x = 4;
        double y = Math.sqrt (x);
        double z = Math.pow(x, 2);
        System.out.println(y + " " + z);

        int h = 123456789;
        byte g= (byte) h;

        System.out.println(g);

        String greetings = "Witaj świecie!";
        String greet = greetings.substring(0, 5);
        System.out.println(greet +" Maleństwo!" );

        System.out.println(greetings.equals(greet));

        int greetings_lenght = greetings.length();
        System.out.println(greetings_lenght);

        // Input excersise
        Scanner in = new Scanner (System.in);
        System.out.print( "Jak się nazywasz? ");
        String name = in.nextLine();

        System.out.print("Ile masz lat? ");
        double age = in.nextDouble();

        System.out.println("Witaj użytkowniku "+ name + ". W przyszłym roku będzieć mieć " + (age +1) + "lat.");

        double xx = 1000.0 /3.0;
        System.out.println(xx);
        System.out.printf("%8.2f", xx);
    }

}
