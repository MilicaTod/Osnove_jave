package p17_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    //Zadatak
    //Napisati program koji ucitava stranice trougla a, b i c i ispisuje da li je trougao pravougli. Trougao je pravougli ako je
    //
    //Primer izvrsenja 1:
    //Unesite a: 3
    //Unesite b: 4
    //Unesite c: 5
    //Trougao je pravougli
    //
    //Primer izvrsenja 2:
    //Unesite a: 3
    //Unesite b: 4
    //Unesite c: 6
    //Trougao nije pravougli
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a = s.nextInt();

        System.out.println("Unesite b: ");
        int b = s.nextInt();

        System.out.println("Unesite c: ");
        int c = s.nextInt();
// moze i a*a + b*b == c*c
        //int a2 = a*a itd
        if ((a * a) + (b * b) == (c * c)) {
            System.out.println("Trougao je pravougli");
        } else {
            System.out.println("Trougao nije pravougli");
        }
    }}

