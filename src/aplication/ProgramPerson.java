package aplication;
import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class ProgramPerson {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade, n;
        double nIdade = 0;
        double altura;
        double sum = 0;
        double mIdade = 0;

        System.out.println("Quantas pessoas serão armazenadas: ");
        n = sc.nextInt();
        Person[] vect = new Person[n]; 

        for(int i=0; i<n; i++){
            sc.nextLine();
            System.out.printf("Insira os dados da" + (i+1) + "a pessoa");
            System.out.print("\nNome: ");
            nome = sc.nextLine();
            System.out.print("Idade: ");
            idade = sc.nextInt();
            System.out.print("Altura: ");
            altura = sc.nextDouble();
            vect[i] = new Person(nome, idade, altura);
            
            sum += vect[i].getAltura();
            if(vect[i].getIdade() < 16){
                nIdade++;
            }
        
        }
        
        double avg;
        avg = sum / n;
        System.out.printf("A média de altura será: %.2f",avg);
        mIdade = nIdade / n;
        System.out.printf("\nA porcentagem de pessoas menor que 16 anos é %.2f",mIdade);
        sc.close(); 
    }

}
