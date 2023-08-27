package d25_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    //Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
    // Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

    public static void main(String[] args) {

        stampajVrednostZa10Vecu(48);
        stampajVrednostZa10Vecu(-12);
        stampajVrednostZa10Vecu(101);
        stampajVrednostZa10Vecu(0);

    }
    public static void stampajVrednostZa10Vecu(int broj) {

        System.out.println("Uvecana vrednost je: "+(broj + 10));

    }
}
