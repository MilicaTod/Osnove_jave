package d24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
    //Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
    //Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1
    public static void main(String[] args) {

        ArrayList<Integer> niz = new ArrayList<>();

        niz.add(1);
        niz.add(2);
        niz.add(4);
        niz.add(5);
        niz.add(7);


        for (int i = 0; i < niz.size(); i++) {
            int x = (niz.size() - 1) - i;
            int zin = niz.get(x);
            System.out.print(zin + ", ");


        }
    }
}
