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
		
		//LocalDateTime define uma data com um hor�rio
		LocalDateTime d02 = LocalDateTime.now();
		
		//Instant define a data e hor�rio referido por�m no hor�rio 00(Londes)
		Instant d03 = Instant.now();
		
		//No exemplo abaixo � retornado a data para o hor�rio padrao de londres, por�m somente com as data
		LocalDate d04 = LocalDate.parse("2022-04-15");
		
		//No exemplo abaixo � escolhida um hor�rio para ser retornado.
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		//No exemplo abaixo � retornado uma data-hora para o valor instanciado no hor�rio de padrao UTC
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		//No exemplo abaixo � instanciado pelo hor�rio de bras�lia e � retornado uma data-hora referente em londres
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

		//No exemplo abaixo � instanciado um date-time e usado o DateTimeFormatter para formartar e deixar usavel no padrao iso 
		LocalDateTime d08 = LocalDateTime.parse("25/08/2011 15:30", fmt2);
		
		//No exemplo abaixo � usada a mesma funcao acima porem de uma forma diferente
		LocalDate d09 = LocalDate.parse("30/05/2015", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		//No exemplo abaixo a fun��o of usada � para instanciar valores que ap�s isso ser�o formatados.
		LocalDate d10 = LocalDate.of(2010, 05, 14);
		
		//No exemplo abaixo � usada a mesma fun��o que acima por�m com hor�rio
		LocalDateTime d11 = LocalDateTime.of(2010, 07, 30, 15, 30);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println(d01.getDayOfYear() - d04.getDayOfYear());
		if(!d01.isAfter(d04)) {
			System.out.println("� depois");
		}else {
			System.out.println("� antes");
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
