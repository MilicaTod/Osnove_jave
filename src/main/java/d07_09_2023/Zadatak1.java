package d07_09_2023;

public class Zadatak1 {
    // Kreiranje klase "Student"
    //Napišite klasu "Student" koja ima sledeće atribute:
    // ime (String), brojIndeksa (int) i fakultet (String).
    // Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti.
    // Ispisati informacije o studentima.
    public static void main(String[] args) {

        Student a = new Student();
        a.ime="Milica Todorovic";
        a.brojIndeksa=42760;
        a.fakultet="Ekonomski fakultet";
        System.out.println("Student:"+a.ime);
        System.out.println("Broj indeksa:"+a.brojIndeksa);
        System.out.println("Fakultet:"+a.fakultet);

        System.out.println();

        Student b = new Student();
        b.ime="Jovana Jovanovic";
        b.brojIndeksa=18967;
        b.fakultet="Medicinski fakultet";
        System.out.println("Student:"+b.ime);
        System.out.println("Broj indeksa:"+b.brojIndeksa);
        System.out.println("Fakultet:"+b.fakultet);

        System.out.println();

        Student c = new Student();
        c.ime="Milena Cvetkovic";
        c.brojIndeksa=78369;
        c.fakultet="Pravni fakultet";
        System.out.println("Student:"+c.ime);
        System.out.println("Broj indeksa:"+c.brojIndeksa);
        System.out.println("Fakultet:"+c.fakultet);

    }
}
