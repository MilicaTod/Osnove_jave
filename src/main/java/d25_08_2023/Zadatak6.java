package d25_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    //Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
    //
    //Primer izvrsenja:
    //izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
    //izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

    public static void main(String[] args) {
        System.out.println("rezultat: " + brojevi(5, 10));
        System.out.println("rezultat: " + brojevi(-5, 1));
    }

    public static int brojevi(int x, int y) {
        int brojac = 0;
        for (int i = x + 1; i < y; i++) {
            brojac= brojac + 1;
        }
        return brojac;}}