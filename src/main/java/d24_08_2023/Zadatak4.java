package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    //Napisati program koji ucitava niz A duzine N,
    // i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
    //Primer izvrsenja:
    //Unesite N: 5
    //Unesite broj: 1
    //Unesite broj: -4
    //Unesite broj: 3
    //Unesite broj: -7
    //Unesite broj: 9

    //Brojevi veci od nule u nizu A su: 1, 3, 9,
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> niz = new ArrayList<>();
        System.out.println("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            niz.add(broj);
        }
        for (int i = 0; i < niz.size(); i++) {
            if (niz.get(i) > 0) {
                System.out.print(niz.get(i) + ",");

            }
        }


    }
}
