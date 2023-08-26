package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    //Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i
    // koji menja vrednost elementa na pozciji K.
    // K i novu vrednost unosi korisnik.
    //Primer:
    //Unesite pozicjiu od 0 do 9: 3
    //Unesite novu vrednost: 11
    //Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        num.add(24);
        num.add(55);
        num.add(78);
        num.add(64);
        num.add(2);
        num.add(14);
        num.add(99);
        num.add(36);
        num.add(17);
        num.add(15);

        System.out.println("Unesite poziciju od 0 do 9: ");
        int position = s.nextInt();

        System.out.println("Unesite novu vrednost: ");
        int newValue = s.nextInt();

       int y = num.set(position,newValue);
        System.out.println(num);


    }
}
