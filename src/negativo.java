import java.util.Scanner;

public class negativo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Quantos numeros você vai digitar: ");
        x = sc.nextInt();
        int[] vect = new int[x];

        for(int i=0; i<x; i++){
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("Os número negativos são:");

        for(int i=0; i<x; i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }


        sc.close();
    }
    
}
