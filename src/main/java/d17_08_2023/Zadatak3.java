package d17_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    //Napisati program koji simulira izvrsenja test case-a za redirekciju nakon uspesnog logovanja na sistem. Program sa tastature ucitava actual url stranice, expected url stranice i kod o gresci koja treba da se prikaze ukoliko actual stranica nije kao sto je ocekivano.
    //Objasnjenje: Ucitala se login stranica, uneli ste usename i password, kliknuli na login i nakon logina je potrebno da vas stranica redirektuje na google.com/ivalid_login a vas redirektuje npr na google.com/home.
    //Napomena: Poruku o gresci unesite kao jednu rec.
    //Ukolko je validacija prosla uspesno ispisati 1 Test passed.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter actual url: ");
        String aUrl= s.next();
        System.out.println("Enter expected url: ");
        String eUrl= s.next();
        System.out.println("Enter error code: ");
        String code = s.next();

        if (aUrl.equals(eUrl)){
            System.out.println("1 Test passed.");}
        else {
            System.out.println("Expected "+ eUrl + " but got " + aUrl + ",error code: " + code);


    }
}}
