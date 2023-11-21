import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		/*
		int x = sc.nextInt();
		
		while(x != 0) {
			System.out.println("O número escolhido foi: " + x);
			x = sc.nextInt();
		}
		*/
		
		String a = "yes";
		char x = a.charAt(0);
		
		if(x == 'y') 
			System.out.println("ola mundo");
		
		
		sc.close();
	}

}
