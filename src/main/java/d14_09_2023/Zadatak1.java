package d14_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Ispit ispit1 = new Ispit("Matematika", 10, "Marko Markovic");
        Ispit ispit2 = new Ispit("Srpski", 6, "Janko Jankovic");
        Ispit ispit3 = new Ispit("Informatika", 7, "Ilija Ilic");

        Student student = new Student("569658", "Perica Peric", "Doktorske studije");
        student.dodajIspit(ispit1);
        student.dodajIspit(ispit2);
        student.dodajIspit(ispit3);

        student.stampaj();}}