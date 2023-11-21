import java.util.Scanner;

public class MatrixJava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, m, p;
		
		System.out.println("Insira o valor de n: ");
		n = sc.nextInt();
		System.out.println("Insira o valor de m: ");
		m = sc.nextInt();
		
		int[][] mat = new int[n][m];
	
		System.out.println("Digite os dados da matriz: ");
		for(int x=0; x<n; x++) {
			for(int y=0; y<m; y++) {
				mat[x][y] = sc.nextInt();
			}
		}
		
		for(int x=0; x<n; x++) {
			for(int y=0; y<m; y++) {
				System.out.println(mat[x][y] + "Posição: " + x + "," + y );
			}
		}
		
		
		System.out.println("Digite um numero especifico: ");
		p = sc.nextInt();
		
		for(int x=0; x<n; x++) {
			for(int y=0; y<m; y++) {
				if(p == mat[x][y]) {
					System.out.println("a" + mat.length);
					System.out.println("b" + mat[x].length);
					System.out.println("Numero achado");
					System.out.println("Position: " + (x) + "," + (y));
					if(y > 0){
						System.out.println("Left: " + mat[x][(y-1)]);
					}
					if(x > 0) {
						System.out.println("Up: " + mat[(x-1)][y]);
					}
					if(x < mat.length-1) {
						System.out.println("Down: " + mat[(x+1)][y]);
					}
					if(x < mat[x].length-1) {
						System.out.println("Right: " + mat[x][(y+1)]);
					}
				}
			}
		}
		
		
		
		
		
		sc.close();
	}

}
