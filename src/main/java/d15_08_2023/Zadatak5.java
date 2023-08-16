package d15_08_2023;

public class Zadatak5 {
    public static void main(String[] args) {

        // Napisati program koji racuna i ispisuje povrsinu i obim trougla.
        // KOREN BROJA 3 neka bude konstanta 1.73. Za stranicu trougla
        // postavite proizvoljnu vrednost.
        //Primer izvrsenja programa:
        //a: 10
        //Povrsina je 43.25
        //Obim je 30


        double a = 10;
        double H =  1.73;

        double Otrougla = a + a + a ;
        double Ptrougla = (a*H)/2;

        System.out.println("Povrsina je " + Ptrougla);
        System.out.println("Obim je " + Otrougla);
    }
}
