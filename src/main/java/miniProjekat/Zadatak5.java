package miniProjekat;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    //**Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
    //
    //Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link:
    // random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve
    // i kako ih možete koristiti u različitim situacijama.
    //
    //Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda,
    // a program će kreirati i ispisati password koji zadovoljava te parametre.
    // Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
    //generisiRandomKarakter: Ova metoda generiše i vraća random karakter.
    // Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima).
    // Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
    //generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter.
    // Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima).
    // Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
    //
    //Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
    //
    //Glavni program:
    //   - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
    //   - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
    //
    //Primer izvršenja 1:
    //Unesite dužinu passworda: 10
    //Da li želite da sadrži specijalan karakter: true
    //Generisan password: eD9Kx0e@
    //
    //Primer izvršenja 2:
    //Unesite dužinu passworda: 10
    //Da li želite da sadrži specijalan karakter: false
    //Generisan password: eCxdwEeFEx

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite duzinu passworda: ");
        int duzinaPassworda = s.nextInt();

        System.out.println("Da li zelite da sadrzi specijalan karakter: ");
        boolean specijalanKarakter = s.nextBoolean();

        generisiPassword(duzinaPassworda, specijalanKarakter);

    }


    public static String generisiRandomKarakter() {
        Random randomKarakter = new Random();

        ArrayList<String> karakteri = new ArrayList<>();

        karakteri.add("A");
        karakteri.add("8");
        karakteri.add("c");
        karakteri.add("d");
        karakteri.add("F");
        karakteri.add("l");
        karakteri.add("Q");
        karakteri.add("h");
        karakteri.add("7");
        karakteri.add("6");
        karakteri.add("0");
        karakteri.add("m");
        karakteri.add("R");
        karakteri.add("3");
        karakteri.add("Z");

        String karakter = karakteri.get(randomKarakter.nextInt(karakteri.size()));
        return karakter;


    }

    public static String generisiRandomSpecijalanKarakter() {
        Random randomSpec = new Random();

        ArrayList<String> specijalniKarakteri = new ArrayList<>();

        specijalniKarakteri.add("!");
        specijalniKarakteri.add("#");
        specijalniKarakteri.add("$");
        specijalniKarakteri.add("%");
        specijalniKarakteri.add("&");
        specijalniKarakteri.add("/");
        specijalniKarakteri.add("@");
        specijalniKarakteri.add("?");
        specijalniKarakteri.add("*");
        specijalniKarakteri.add("-");
        specijalniKarakteri.add("+");
        specijalniKarakteri.add("~");
        specijalniKarakteri.add(".");
        specijalniKarakteri.add(":");
        specijalniKarakteri.add("^");

        String specijalanKarakter = specijalniKarakteri.get(randomSpec.nextInt(specijalniKarakteri.size()));
        return specijalanKarakter;

    }

    public static void generisiPassword(int duzinaPassworda, boolean specijalanKarakter) {
        String password = "";

        if (specijalanKarakter) {
            for (int i = 0; i < duzinaPassworda - 1; i++) {
                password += generisiRandomKarakter();
            }
            password = password + generisiRandomSpecijalanKarakter();
        } else {
            for (int i = 0; i < duzinaPassworda; i++) {
                password += generisiRandomKarakter();
            }
        }

        System.out.println("Password: " + password);

    }
}
