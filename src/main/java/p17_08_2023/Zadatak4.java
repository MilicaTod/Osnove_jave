package p17_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        //Napisati program koji ucitava brojeve a, b i c sa tastature i proverava da li je broj a u opsegu od b do c.
        //Primer izvrsenja:
        //Unesite b: 5
        //Uneiste c: 50
        //Unesite a: 15
        //A je u opsegu izmedju 5 i 50

        Scanner s = new Scanner (System.in);

        System.out.println("Unesite b: ");
        int b = s.nextInt();

        System.out.println("Unesite c ");
        int c = s.nextInt();

        System.out.println("Unesite a ");
        int a = s.nextInt();

        if ( b <= a  && a <= c ) {
            System.out.println("A je u opsegu između 5 i 50");}


    }
}
