package p18_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj a: ");
        int a = s.nextInt();
        //a<10 jednocifren
        // a<100 dvocifren
        // a>100 trocifren}

        if(a<10) {
            System.out.println("Broj je jednocifren");}
        else if (a<100){
            System.out.println("broj je dvocifren");}
        else if (a>100){
            System.out.println("Broj je trocifren.");}
        else {
            System.out.println("Broj je visecifren");}
        }
        }

