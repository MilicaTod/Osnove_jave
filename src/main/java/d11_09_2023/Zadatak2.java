package d11_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Korisnik korisnik = new Korisnik("Milica","Todorovic");
        FacebookPost post = new FacebookPost(korisnik);
        post.setText("HELP!");

        post.stampaj();
}}
