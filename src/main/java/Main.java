import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        int dado1;
        int dado2;
        int tiradas;
        int[] resultados;

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas tiradas quieres hacer?");
        tiradas = sc.nextInt();

        resultados = new int[13];

        for (int i = 0; i < tiradas ; i++) {

            dado1 = random.nextInt(6) +1 ;
            dado2 = random.nextInt(6) +1;

            ++resultados[dado1 + dado2];

        }

        for (int i = 2; i <resultados.length ; i++) {
            System.out.println("Ha salido: " + i + " " + resultados[i] );
        }
    }

}
