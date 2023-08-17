package p17_08_2023;
import java.util.Scanner;
public class Zadatak3 {
    //Napisati program koji sa tastature ucitava tri broja a, b i c i
    // ispisuje srednju vrednost za ta tri broja. Sve promenljive u programu su po tipu double
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        System.out.println("Broj a: ");
        int a = s.nextInt();

        System.out.println("Broj b: ");
        int b = s.nextInt();

        System.out.println("Broj c: ");
        int c = s.nextInt();


        double avg = (a + b + c) / 3;
        System.out.println("Srednja vrednost je: " + avg);
    }
}
