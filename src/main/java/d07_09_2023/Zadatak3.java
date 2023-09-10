package d07_09_2023;

public class Zadatak3 {
    //: Kreiranje klase "Proizvod"
    //Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double).
    // U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti. Ispisati informacije o proizvodima.
    public static void main(String[] args) {

        Proizvod cokolada = new Proizvod();
        cokolada.naziv = "Rum Kasato";
        cokolada.cena = 81.59;
        System.out.println("Naziv:"+ cokolada.naziv);
        System.out.println("Cena:"+cokolada.cena);
        System.out.println();

        Proizvod sok = new Proizvod();
        sok.naziv = "Ivi";
        sok.cena = 69.99;
        System.out.println("Naziv:"+ sok.naziv);
        System.out.println("Cena:"+sok.cena);
        System.out.println();

        Proizvod voda = new Proizvod();
        voda.naziv = "Rosa";
        voda.cena = 68.99;
        System.out.println("Naziv:"+ voda.naziv);
        System.out.println("Cena:"+voda.cena);
        System.out.println();
    }
}
