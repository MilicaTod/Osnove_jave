package p21_08_2023;

public class Zadatak3 {
    //Napisati program koji od brojeva od 1 do 10 formira string tako da se na pocetnu vrednost stringa … (tri tacke) sa leve strane dodaju neparni brojevi a sa desne parni.
    //Primer izvrsenja:
    //97531…246810
    public static void main(String[] args) {

        String rezultat ="...";
        for (int i =1; i<=10; i++) {
            if(i % 2 ==0){
                rezultat = rezultat +1;
            }else {
                rezultat = rezultat + i;
        }
            System.out.println("rezultat"+ rezultat) ;}}}



