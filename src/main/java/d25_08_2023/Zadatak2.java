package d25_08_2023;

public class Zadatak2 {
    //Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije
    // vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
    //ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
    //ako je prvi broj =6, a drugi =2 vraca novu vrednost 62
    public static void main(String[] args) {

        System.out.println(novaVrednost(2,3));
    }

    public static int novaVrednost(int x, int y) {
        return (x * 10) + y;
    }
}
