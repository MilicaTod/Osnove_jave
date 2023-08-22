package p21_08_2023;

public class PetljeNastavak {
    public static void main(String[] args) {

        int suma =0;

        // 1 = 0 + 1     suma = suma + n1
        // int suma = 0
        // 1 + 2 = 3     suma = suma + n2
        // int suma = 0
        // 3 + 3 = 6     suma = suma + n3


        for(int i =1; i<=10;i++ ){

            int x = suma + i;
            suma = x; }
        System.out.println("suma "+ suma);
        }
    }

