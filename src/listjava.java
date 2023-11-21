import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class listjava {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("_____________________________________");
		//Funçao para remover a palavra que tiver a primeira letra como M
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("_____________________________________");
		//Funcao para retornar o valor do index
		System.out.println("Index of BoB: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("_____________________________________");
		//Função para criar uma lista separada no qual a primeira letra comece com A
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("_____________________________________");
		//Função para achar a primeira palavra que contem a primeira letra como A
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);	
		System.out.println(name);
		
	}
}
