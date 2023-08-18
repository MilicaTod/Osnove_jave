package d18_08_2023;

import java.util.Scanner;

public class Zadatak4 {
//Napisati program koji stampa 25 _ (donjih crta), pritom
// na svaku 5. iteraciju odstampa i novi red. Zadatak resiti
// pomocu FOR petlje.
//Primer izvrsenja:

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        char crta = '_';

        for (int i=0;i<25;i++) {
            if (i % 5 ==0) {
                System.out.println();
            }
            System.out.print(crta);
        }
        }


    }

