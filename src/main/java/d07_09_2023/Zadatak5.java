package d07_09_2023;

import java.util.Scanner;

public class Zadatak5 {
    // Kreiranje klase "Oprema"
    //Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double).
    // U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture. Ispisati informacije o opremi.
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        Oprema x=new Oprema();
        System.out.println("Unesite tip opreme:");
        x.tip=s.next();
        System.out.println("Unesite marku opreme:");
        x.marka=s.next();
        System.out.println("Unesite cenu opreme:");
        x.cena=s.nextInt();
        System.out.println("Tip opreme:"+x.tip);
        System.out.println("Marka opreme:"+x.marka);
        System.out.println("Cena opreme:"+x.cena);

        System.out.println();

        Oprema w=new Oprema();
        System.out.println("Unesite tip opreme:");
        w.tip=s.next();
        System.out.println("Unesite marku opreme:");
        w.marka=s.next();
        System.out.println("Unesite cenu opreme:");
        w.cena=s.nextInt();
        System.out.println("Tip opreme:"+w.tip);
        System.out.println("Marka opreme:"+w.marka);
        System.out.println("Cena opreme:"+w.cena);

        System.out.println();

        Oprema g=new Oprema();
        System.out.println("Unesite tip opreme:");
        g.tip=s.next();
        System.out.println("Unesite marku opreme:");
        g.marka=s.next();
        System.out.println("Unesite cenu opreme:");
        g.cena=s.nextInt();
        System.out.println("Tip opreme:"+g.tip);
        System.out.println("Marka opreme:"+g.marka);
        System.out.println("Cena opreme:"+g.cena);
    }
}
