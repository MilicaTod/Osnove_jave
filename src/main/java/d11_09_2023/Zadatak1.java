package d11_09_2023;

public class Zadatak1 {
    //Kreirati klasu Autor koja ima
    //-ime i prezime
    //-konstuktore koje mislite da su vam potrebni
    //-gettere i settere za atribute
    //-metodu print koja stampa u formatu:
    //(ime autora) (prezime autora)
    //
    //Kreirati klasu Knjiga koji ima:
    //-ISBN
    //-naziv
    //-godina izdanja
    //-autor
    //-konstuktore koje mislite da su vam potrebni
    //-gettere i settere za atribute
    //-metodu print koja stampa u formatu (izbegavati dupliranje koda):
    //(ISBN)
    //(naziv) - (godina izdanja)
    //autor: (ime autora) (prezime autora)
    //
    //	U glavnom programu napraviti vise autora sa vise knjiga.
    public static void main(String[] args) {
        Autor autor1 = new Autor("Zoze","Saramago");
        Knjiga knjiga1 = new Knjiga();
        knjiga1.setIsbn("5596856985");
        knjiga1.setNaziv("Slepilo");
        knjiga1.setGodina(2008);
        knjiga1.setAutor(autor1);

        Autor autor2 = new Autor("Ivo", "Andric");
        Knjiga knjiga2 = new Knjiga("4589589", "Znakovi pored puta", 1976, autor2);


        Knjiga knjiga3 = new Knjiga();
        knjiga3.setIsbn("1234567");
        knjiga3.setNaziv("Price o osobenjacima i malim ljudima");
        knjiga3.setGodina(2010);
        knjiga3.setAutor(autor2);

        Knjiga knjiga4 = new Knjiga("9876959", "Sva imena", 1997, autor1);

        knjiga1.stampaj();
        knjiga2.stampaj();
        knjiga3.stampaj();
        knjiga4.stampaj();
    }
}



