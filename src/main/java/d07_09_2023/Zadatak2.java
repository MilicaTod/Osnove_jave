package d07_09_2023;

public class Zadatak2 {
    //Kreiranje klase "Automobil"
    //Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int).
    // U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti. Ispisati informacije o automobilima.
    public static void main(String[] args) {

        Automobil a =new Automobil();
        a.marka="Audi";
        a.model="A6";
        a.godinaProizvodnje=2018;
        System.out.println("Marka automobila:"+a.marka);
        System.out.println("Model automobila:"+a.model);
        System.out.println("Godina proizvodnje:"+a.godinaProizvodnje);

        System.out.println();

        Automobil b=new Automobil();
        b.marka="BMW";
        b.model="X6";
        b.godinaProizvodnje=2021;
        System.out.println("Marka automobila:"+b.marka);
        System.out.println("Model automobila:"+b.model);
        System.out.println("Godina proizvodnje:"+b.godinaProizvodnje);

        System.out.println();

        Automobil m=new Automobil();
        m.marka="Mercedes";
        m.model="GLE";
        m.godinaProizvodnje=2022;
        System.out.println("Marka automobila:"+m.marka);
        System.out.println("Model automobila:"+m.model);
        System.out.println("Godina proizvodnje:"+m.godinaProizvodnje);
    }
}
