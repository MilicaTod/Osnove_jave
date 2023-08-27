package d25_08_2023;

public class Zadatak3 {
    //Napisati metodu koja stampa podatke o korisniku u formatu:
    //JMBG: [jmbg]
    //Ime: [ime]
    //Prezime: [prezime]
    //God. rodjenja: [god]
    //Aktivan: [true/false]
    //Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

    public static void main(String[] args) {
        korisnik("270820230000", "Milica", "Todorović Jovanović", 1992, true);
    }
    public static void korisnik (String jmbg, String ime, String prezime, int godRođenja, boolean aktivan){
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Godina rođenja: " + godRođenja);
        System.out.println("Aktivan: " + aktivan);

    }
}
