package p22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    //Napisati program koji od korisnika ucitava brojeve sve dok ne unesu makar po jedan broj od 1 do 4.
    //Primer:
    //Unesite broj:1
    //Unesite broj:2
    //Unesite broj:2
    //Unesite broj:3
    //Unesite broj:0
    //Unesite broj:5
    //Unesite broj:3
    //Unesite broj:4
    //Kraj programa
    //
    //Objasnjenje: Od svakih 1, 2, 3 i 4 je unet po jedan.
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean isAllForOnce = false;
        int jedan = 0;
        int dva = 0;
        int tri = 0;
        int cetiri = 0;

        while (!isAllForOnce) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            if (broj == 1) {
                jedan = jedan + 1;
            }
            else if (broj == 2) {
                dva = dva + 1;
            }
            else if (broj == 3) {
                tri = tri + 1;
            }
            else if (broj == 4) {
                cetiri = cetiri + 1;
            }


        if (jedan > 0 && dva >0 && tri >0  && cetiri >0) {
            isAllForOnce = true;
        }}
        System.out.println("kraj");
    }
}





