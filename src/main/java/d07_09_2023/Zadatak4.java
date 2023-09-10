package d07_09_2023;

import java.util.Scanner;

public class Zadatak4 {
    //Kreiranje klase "Film"
    //Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String).
    // U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature. Ispisati informacije o filmovima.
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        Film a =new Film();

        System.out.println("Naslov filma a:");
        a.naslov=s.next();
        System.out.println("Godina izdanja:");
        a.godinaIzdanja=s.nextInt();
        System.out.println("Rezija:");
        a.reziser=s.next();
        System.out.println("Naslov filma:"+a.naslov);
        System.out.println("Godina izdanja:"+a.godinaIzdanja);
        System.out.println("Rezija:"+a.reziser);

        Film b = new Film();
        System.out.println("Naslov filma b:");
        b.naslov=s.next();
        System.out.println("Godina izdanja:");
        b.godinaIzdanja=s.nextInt();
        System.out.println("Rezija:");
        b.reziser=s.next();
        System.out.println("Naslov filma :"+b.naslov);
        System.out.println("Godina izdanja:"+b.godinaIzdanja);
        System.out.println("Rezija:"+b.reziser);

    }
}
