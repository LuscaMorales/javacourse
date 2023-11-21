import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid Position");
		}
		catch (InputMismatchException a) {
			System.out.println("invalid format");
		}
		System.out.println("End of program");
		sc.close();
	}

}
