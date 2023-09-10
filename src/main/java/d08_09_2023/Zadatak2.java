package d08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        //Kreirati klasu FacebookPost koja ima:
        //   Od atributa:
        //ime i prezime korisnika koji je objavio post
        //ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
        //tekst objave
        //broj lajkova
        //broj deljenja
        //  Od metoda:
        //like(), koja povecava broj lajkova za 1.
        //dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
        //share(), koja povecava broj deljenja za 1
        //print(), koja stampa objavu u formatu:
        //(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
        //(tekst objave)
        //Likes (broj lajkova) | Shares (broj deljenja)
        //
        //U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
        //
        //
        //Primer stampanja:
        //Milan Jovanovic >>> Pera Peric
        //Ovo je tekst objave
        //Likes 3 | Shares 1

        FacebookPost post1 = new FacebookPost();
        post1.userSender = "Jovana Popovic";
        post1.userProfile = "Milica Jovanovic";
        post1.likes = 14;
        post1.shares = 0;
        post1.text = "Srecan rođendan!<3";

        FacebookPost post2 = new FacebookPost();
        post2.userSender = "Milica Todorovic";
        post2.userProfile = "Jovana Popovic";
        post2.text = "Amazing what love can do";
        post2.likes = 53;
        post2.shares = 3;

        post1.share();
        post2.share();

        post1.like();
        post2.like();

        post1.dislike();
        post2.dislike();

        post1.print();
        post2.print();




    }

}
