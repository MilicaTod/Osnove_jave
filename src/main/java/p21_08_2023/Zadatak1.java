package p21_08_2023;

public class Zadatak1 {
    //Napisati program koji sumira parne brojeve od 1 do 50 i na kraju programa ispisuje sumu.
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i<50; i++){
            if(i%2==0){
           sum = sum + i;}

        }
            System.out.println("Suma " + sum) ;


    }
}
