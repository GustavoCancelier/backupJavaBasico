package br.com.gustavo.sunset;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgramaData {
	
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDate dataNascimento = LocalDate.parse("2022-07-21", DateTimeFormatter.ISO_LOCAL_DATE );
		LocalDate dataNiver = dataNascimento;
		LocalDate dataFuturo;
		Integer dias = 0;
		
		
		while (dataNascimento.isBefore(hoje)) {
			dataNascimento = dataNascimento.plusDays(1);
			dias++;
		}
	
		/*while (dataNascimento.isAfter(hoje)) {
			dataNascimento = dataNascimento.minusDays(1);
			dias--;
		}*/
			
		if (dataNascimento.isAfter(hoje)) {
			try(Scanner ler = new Scanner(System.in);) {
				System.out.println("Informe a sua data no futuro:");
				dataFuturo = LocalDate.parse(ler.next(), DateTimeFormatter.ISO_LOCAL_DATE);
				System.out.println(dataFuturo);
				
				while(dataNascimento.isBefore(dataFuturo)) {
					dataNascimento  = dataNascimento.plusDays(1);
					dias++;
				}
				if(((dias / 365) > 1) || ((dias / 365) == 0)) {
					System.out.println("Você tem: " + (dias / 365) + " anos.");
				} else {
					System.out.println("Você tem: " + (dias / 365) + " ano.");
				}
			}
		}
		
		
		
		if(dias > 1 || dias == 0) {
			System.out.println("Você já viveu: " + dias + " dias.");
		} else if (dias == 1){
			System.out.println("Você já viveu: " + dias + " dia.");
		} else {
			System.out.println("Você viveu dias negativos! Você é um viajante do tempo!");
			System.out.println("Você viveu: " + dias + " dias.");
		}
		
		
		
		if((hoje.isAfter(dataNiver)) && (dias > 365)) {
			System.out.println("Voce ja fez aniversário esse ano!");
		} else if(hoje.isAfter(dataNiver) && dias == 365){
			System.out.println("Hoje é o seu aniversário! Parabéns!");
		}else {
			System.out.println("Você ainda nao fez aniversario esse ano!");
		}
	}
}
