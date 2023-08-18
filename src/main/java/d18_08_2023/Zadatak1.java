package d18_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    //if(a<10) {
    //            System.out.println("Broj je jednocifren");}
    //        else if (a<100){
    //            System.out.println("broj je dvocifren");}
    //        else if (a>100){
    //            System.out.println("Broj je trocifren.");}
    //        else {
    //            System.out.println("Broj je visecifren");}
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite x: ");
        int x = s.nextInt();

        int y ;

        if (x<2){ y=x;
            System.out.println("y="+ y);}
        else if (x>=2 && x<10) {
            System.out.println("y=2");
        }else if (x>=10){
            System.out.println("y=" + (x-1));
        }

    }}

