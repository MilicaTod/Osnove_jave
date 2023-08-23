package d22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    //Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.
    // Na kraju programa ispisati sracunatu sumu.
    //Unesite vrednost: 20
    //Unesite vrednost: 50
    //Unesite vrednost: 50
    //Prekoracenje! Kraj programa. Sracunata suma je 70.
    public static void main(String[] args) {
//If suma + broj > 100 prekida se petlja, a tek u else onda staviš suma = suma + broj; ne pre toga
        Scanner s = new Scanner(System.in);
        int broj = 0;
        int suma = 0;
        String poruka = "";
        boolean do100 = false;

        while (!do100) {
            System.out.print("Unesite vrednost: ");
            broj = s.nextInt();
            if (suma + broj > 100){
                do100 = true;
                poruka = "Prekoracenje! Kraj programa. Sracunata suma je " + suma + ".";
            }else { suma= suma + broj;}

        }
        System.out.println(poruka);
    }
}


