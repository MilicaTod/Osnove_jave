package p15_08_2023;

public class Zadatak5 {
    public static void main(String[] args) {

        //Napisati program koji ima samo jednu promenljivu simbol i na osnovu te promenljive formira sledecu sliku.
        //Primer izvrsenja: Ako je promenljiva simbol * (zvezdica) stampa se slika
        //* * * * * *

        char simbol = '#';
        String picture = simbol + " " + simbol+ " " +
                simbol + " " + simbol + " " + simbol + " " + simbol;

        System.out.println(picture);
    }
}
