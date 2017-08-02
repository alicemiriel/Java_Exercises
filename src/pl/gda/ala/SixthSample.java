package pl.gda.ala;

import java.util.Random;

public class SixthSample {

    public static void main(String[] args) {

        int[] zmienna = new int[100];

        for (int x = 0; x < 100; x = x + 1) {

            Random random = new Random();
            int randomNumber = random.nextInt(100);
            zmienna[x] = randomNumber;
            System.out.println(zmienna[x]);
        }
        int[] f = new int[100];

        for (int x = 0; x < 100; x = x + 1) {

            Random random = new Random();
            int randomNumber = random.nextInt(100);
            f[x] = randomNumber;
        }
        for (int z = 0; z < 99; z = z + 1) {
            for (int x = 0; x < 99; x = x + 1) {
                if (f[x] < f[x + 1]) {
                    int c = f[x];
                    f[x] = f[x + 1];
                    f[x + 1] = c;
                }
            }
        }
        for (int x = 0; x < 100; x = x + 1) {
            System.out.println(f[x]);
        }
        int[] newF = new int[10];

        for (int x = 0; x < newF.length; x = x + 1) {

            Random random = new Random();
            int randomNumber = random.nextInt(100);
            newF[x] = randomNumber;
        }

        for (int z = 0; z < f.length - 1; z = z + 1) {
            for (int x = 0; x < f.length - 1; x = x + 1) {
                if (f[x] < f[x + 1]) {
                    int c = f[x];
                    f[x] = f[x + 1];
                    f[x + 1] = c;
                }
            }
        }
        for (int x = 0; x < f.length; x = x + 1) {
            System.out.println(f[x]);
        }
        int[] g = {71, 22, 54, 52, 6, 47, 81, -199, 0, 0, 9};

        int c = g[0];
        for (int element : g) {
            if (c < element) {
                c = element;
            }
        }
        System.out.println(c);
    }
}



