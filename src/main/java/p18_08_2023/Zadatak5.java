package p18_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    //Napisati program koji ispisuje brojeve od -10 do 10.
    //Primer izvrsenja:
    //-10, -9, -8, ……0, 1, 2, ………10
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

for (int i = -10; i<=10; i++ ) {
    System.out.println(i);
}
    }
}