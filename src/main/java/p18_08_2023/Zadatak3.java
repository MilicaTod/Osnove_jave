package p18_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    //Napisati program koji ispisuje za uneti broj a da li je deljiv sa 2 ili sa 3.Ispisati poruke na kraju programa u obe situacije.
    //
    //Upoznajte se sa opertorom moduo % dok ne dodjemo do tog operatora.
    //
    //HINT: Broj B je deljiv brojem A ukoliko je ostatak pri deljenju sa A jedan nuli.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
          //a deljiv sa 2
        //a deljiv sa 3

        System.out.println("Uneti broj a: ");
        int a = s.nextInt();

        if(a % 2 == 0 || a%3 ==0) {
            System.out.println("Broj je deljiv sa 2 ili 3");}

        else {
            System.out.println("broj nije deljiv ni sa 2 ni sa 3");
        } }
}
