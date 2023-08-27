package d25_08_2023;

public class Zadatak7 {
    //Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
    // U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
    //
    //Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
    //Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4
    public static void main(String[] args) {

        int x = 9;
        int y = 6;
        int z = 1;

        System.out.println("Od brojeva " + x + "," + y + "," + z + " najmanji je " + minBr(x, y, z));

    }

    public static int minBr(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
