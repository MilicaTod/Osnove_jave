package d_21_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    //Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija.
    // Korisnik unosi N rekacija zatim se prikazuje evidencija:
    //Program podrzava sledece reakcije:
    //like
    //smile
    //heart
    //
    //	Primer izvrsenja:
    //Unesite N: 7
    //	Reaguj: like
    //	Reaguj: heart
    //	Reaguj: smile
    //	Reaguj: lol
    //	Reaguj: smile
    //	Reaguj: like
    //	Reaguj: like
    //Summary: like 3 | smile 2 | heart 1
    //
    //Napomena: Ako se unese reakcija koju program ne podrzava, ona ne utice na evidenciju.
    //
    //POMOC: Svaka promenljiva nosi jednu informaciju, to znaci evidenciju za like cuva
    // promelniva sa imenom npr likeCounter, evidenciju za smile cuva smileCounter i za heart
    // cuva promenljiva heartCounter
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();
        int countSmile = 0;
        int countLike = 0;
        int countHeart = 0;
        String reakcija = "like smile heart";

        for (int i = 0; i < n; i++) {
            System.out.println("Reaguj: ");
            String emoji = s.next();
            if (emoji.equals("like")) {
                countLike = countLike + 1;
            } else if (emoji.equals("heart")) {
                countHeart = countHeart + 1;
            } else if (emoji.equals("smile")) {
                countSmile = countSmile + 1;
            }

        }
        System.out.println("Summary: like " + countLike + " |smile " + countSmile + " |heart " + countHeart);
    }

}

