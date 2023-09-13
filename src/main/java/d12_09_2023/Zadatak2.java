package d12_09_2023;


import java.util.ArrayList;
import java.util.List;

public class Zadatak2 {
    //Kreirati klasu ZeleniKarton koja ima:
    //ime i prezime studenta
    //broj indeksa
    //naziv predmeta
    //ime i prezime profesora
    //ocenu - od 5 do 10
    //gettere i settere
    //konstruktore
    //metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
    //metodu stampaj koja stampa podatke u formatu:
    //		(naziv predmeta) - (ocena)
    //		Student: ime i prezime, broj indeksa
    //		Profesor: ime i prezime
    //
    //	U glavnoj klasi:
    //kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
    //Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite
    public static void main(String[] args) {

        List <ZeleniKarton> karton = new ArrayList<>();

        karton.add(new ZeleniKarton("Milica Todorovic",42760,"Planiranje i metodologija","Gorica Jankovic",10));
        karton.add(new ZeleniKarton("Marija Milanovic",41569,"Osnove menadzmenta","Jasna Ocokolic",8));
        karton.add(new ZeleniKarton("Mladen Manojlovic",39659,"Racunovodstvo","Milutin Zikic",9));

        for (int i = 0; i < karton.size(); i++) {
            karton.get(i).stampaj();
        }
        double procecnaOcena = 0;
        for (int i = 0; i < karton.size(); i++) {
            procecnaOcena += karton.get(i).getOcena();
        }
        System.out.println("Prosecna ocena je " + procecnaOcena / karton.size());
    }


    }

