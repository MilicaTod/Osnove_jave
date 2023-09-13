package d11_09_2023;

public class FacebookPost {
    private String opis;
    private Korisnik korisnik;

    public FacebookPost(Korisnik korisnik){
        this.korisnik = korisnik;
    }

    public FacebookPost(String opis, Korisnik korisnik){
        this.opis = opis;
        this.korisnik = korisnik;
    }

    public void stampaj() {
        this.korisnik.stampaj();
        System.out.println(this.opis);
    }

    public String getText(){
        return this.opis;
    }

    public void setText(String opis){
        this.opis = opis;
    }
}
