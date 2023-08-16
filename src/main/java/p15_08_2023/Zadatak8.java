package p15_08_2023;

public class Zadatak8 {
    public static void main(String[] args) {

        //Napisati program koji racuna povrsinu kvadrata stranice a, i povrsinu kruga poluprecnika r. PI = 3.14. Povrsina kruga je r (na kvadrat) * pi
        //Primer izvrsenja:
        //a: 5
        //Povrsina kvadrata je 25
        //r: 3
        //Povrsina kruga je 28.26

        double a = 10.0;
        double r = 5.0;
        double PI = 3.14;

        double Pkvadrata = a * a;
        double Pkruga = r * r * PI;

        System.out.println("P kruga " + Pkruga);
        System.out.println("P kvadrata " + Pkvadrata);
    }
}
