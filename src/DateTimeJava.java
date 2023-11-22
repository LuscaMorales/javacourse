import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeJava {

	public static void main(String[] args) {
		
		//Formatos criados pela Classe DateTimeFormatter
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
				
		//LocalDate define uma data
		LocalDate d01 = LocalDate.now();
		
		//LocalDateTime define uma data com um horário
		LocalDateTime d02 = LocalDateTime.now();
		
		//Instant define a data e horário referido porém no horário 00(Londes)
		Instant d03 = Instant.now();
		
		//No exemplo abaixo é retornado a data para o horário padrao de londres, porém somente com as data
		LocalDate d04 = LocalDate.parse("2022-04-15");
		
		//No exemplo abaixo é escolhida um horário para ser retornado.
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		//No exemplo abaixo é retornado uma data-hora para o valor instanciado no horário de padrao UTC
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		//No exemplo abaixo é instanciado pelo horário de brasília e é retornado uma data-hora referente em londres
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

		//No exemplo abaixo é instanciado um date-time e usado o DateTimeFormatter para formartar e deixar usavel no padrao iso 
		LocalDateTime d08 = LocalDateTime.parse("25/08/2011 15:30", fmt2);
		
		//No exemplo abaixo é usada a mesma funcao acima porem de uma forma diferente
		LocalDate d09 = LocalDate.parse("30/05/2015", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		//No exemplo abaixo a função of usada é para instanciar valores que após isso serão formatados.
		LocalDate d10 = LocalDate.of(2010, 05, 14);
		
		//No exemplo abaixo é usada a mesma função que acima porém com horário
		LocalDateTime d11 = LocalDateTime.of(2010, 07, 30, 15, 30);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println(d01.getDayOfYear() - d04.getDayOfYear());
		if(!d01.isAfter(d04)) {
			System.out.println("É depois");
		}else {
			System.out.println("É antes");
		}
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());

	}

}
