package d22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    //Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
    //Primer izvrsenja 1:
    //Unesite broj:1
    //Unesite broj:2
    //Unesite broj:0
    //Unesite broj:2
    //Kraj programa.
    //(Objasnjenje: Kraj jer je uneto dve dvojke)
    //
    //Primer izvrsenja 1:
    //Unesite broj:1
    //Unesite broj:2
    //Unesite broj:1
    //Unesite broj:3
    //Unesite broj:1
    //Kraj programa.
    //(Objasnjenje: Kraj jer je uneto tri jedinice)
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int broj = 0;
        int jedan = 0;
        int dva = 0;
        boolean dveDvojkeTriJedinice = false;

        while (!dveDvojkeTriJedinice) {
            System.out.print("Unesite broj: ");
            broj = s.nextInt();
            if (broj == 1) {
                jedan = jedan + 1;
            } else if (broj == 2) {
                dva = dva + 1;
            }
            if (jedan >= 3 || dva >= 2) {
                dveDvojkeTriJedinice = true;
            }
        }
        System.out.println("Kraj programa.");
    }
}
