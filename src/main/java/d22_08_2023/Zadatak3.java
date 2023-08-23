package d22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    //Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost
    // sve dok korisnik ne unese KRAJ..
//    Primer izvrsenja:
//    Unesite rimski broj: X
//    Arapski: 10
//    Unesite rimski broj: C
//    Arapski: 50
//    Unesite rimski broj: D
//    Arapski: 500
//    Unesite rimski broj: M
//    Arapski: 1000
//    Unesite rimski broj: I
//    Arapski: 1
//    Unesite rimski broj: KRAJ
//    Kraj programa.}

public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String rimskiBroj = "";
        int arapskiBroj = 0;
        boolean kraj = false;

        while (!kraj) {
            System.out.print("Unesite rimski broj: ");
            rimskiBroj = s.next();

            if (rimskiBroj.equals("I")) {
                arapskiBroj = 1;
                System.out.println("Arapski broj: " + arapskiBroj);
            } else if (rimskiBroj.equals("V")) {
                arapskiBroj = 5;
                System.out.println("Arapski broj: " + arapskiBroj);
            } else if (rimskiBroj.equals("X")) {
                arapskiBroj = 10;
                System.out.println("Arapski broj: " + arapskiBroj);
            } else if (rimskiBroj.equals("L")) {
                arapskiBroj = 50;
                System.out.println("Arapski broj: " + arapskiBroj);
            } else if (rimskiBroj.equals("C")) {
                arapskiBroj = 100;
                System.out.println("Arapski broj: " + arapskiBroj);
            } else if (rimskiBroj.equals("D")) {
                arapskiBroj = 500;
                System.out.println("Arapski broj: " + arapskiBroj);
            } else if (rimskiBroj.equals("M")) {
                arapskiBroj = 1000;
                System.out.println("Arapski broj: " + arapskiBroj);
            } else if (rimskiBroj.equals("KRAJ")) {
                kraj = true;
                System.out.println("Kraj programa.");
            } else {
                System.out.println("Greska. Probaj ponovo.");
            }

        }
}}
