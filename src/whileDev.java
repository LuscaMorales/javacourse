import java.util.Scanner;

public class whileDev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		int senha = 2002;
		int tentativa;
		
		System.out.println("Digite sua senha de 4 dígitos");
		tentativa = sc.nextInt();
		
		while(tentativa != senha) {			
			System.out.println("Senha Invalida");
			tentativa = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		*/
		
		/*
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		
		while((x != 0) && (y != 0)) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			}else if(x < 0 && y > 0) {
				System.out.println("Segundo quadrante");
			}else if(x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");
			}else {
				System.out.println("Quarto Quadrante");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		*/
		
		int x = 0;
		int y = 0;
		int z = 0;
		int add = 0;
		int off = 0;

		System.out.print("Digite qual tipo combustível foi comprado: \n"
				+ "Sendo 1 para Alcool, 2 para Gasolina e 3 para Diesel."
				+ "\nDigite 4 para encerrar:");
		
		while(off == 0) {
			add = sc.nextInt();
			switch(add) {
			case 1:
				System.out.println("Voce abasteceu com Alcool!");
				x += add;
				break;
			case 2:
				System.out.println("Voce abasteceu com Gasolina!");
				y += add;
				break;
			case 3:
				System.out.println("Voce abasteceu com Diesel!");
				z += add;
				break;
			case 4:
				System.out.println("Encerrado");
				off += 1;
				break;
			default:
				System.out.println("Comando inválido");
			}
			
		}
		System.out.println("Alcool: " + x);
		System.out.println("Gasolina: " + y);
		System.out.println("Diesel: " + z);
		
		sc.close();
	}
}
