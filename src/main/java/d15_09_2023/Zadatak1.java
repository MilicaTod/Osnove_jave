package d15_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Igrac> igraci = new ArrayList<>();
        System.out.println("Unesite broj igraca: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Unesite ime i prezime igraca: ");
            String imePrezime = s.next();

            System.out.println("Unesite jmbg igraca: ");
            String jmbg = s.next();

            System.out.println("Unesite godinu rodjenja igraca: ");
            int godinaRodjenja = s.nextInt();

            System.out.println("Unesite broj igraca: ");
            int broj = s.nextInt();

            System.out.println("Unesite poziciju igraca: ");
            String pozicija = s.next();

            System.out.println("Da li je igrac kapiten? ");
            boolean kapiten = s.nextBoolean();

            igraci.add(new Igrac(imePrezime, jmbg, godinaRodjenja, broj, pozicija, kapiten));
        }

        for (int i = 0; i < igraci.size(); i++) {
            igraci.get(i).stampaj();
        }

        ArrayList<Trener> treneri = new ArrayList<>();
        System.out.println("Unesite broj trenera: ");
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Unesite ime i prezime trenera: ");
            String imePrezime = s.next();

            System.out.println("Unesite jmbg trenera: ");
            String jmbg = s.next();

            System.out.println("Unesite godinu rodjenja trenera: ");
            int godinaRodjenja = s.nextInt();

            System.out.println("Unesite godine iskustva: ");
            int godineIskustva = s.nextInt();

            System.out.println("Unesite tip trenera: ");
            String tip = s.next();

            treneri.add(new Trener(imePrezime, jmbg, godinaRodjenja, godineIskustva, tip));
        }
        for (int i = 0; i < treneri.size(); i++) {
            treneri.get(i).stampaj();
        }
    }
    }
