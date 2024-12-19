package aplication;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitie.Compromissos;
import entitie.SistemaCompromissos;


public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		
		List<Compromissos> compromisso = new ArrayList<>();

		SistemaCompromissos sistCompro = new SistemaCompromissos();
		
		
		String opcao;
		
				do {
					
					System.out.println("1 - Agendar");
					System.out.println("2 - Remover");
					System.out.println("3 - Alterar");
					System.out.println("4 - Exibir por participantes");
					System.out.println("5 - Exibir por data");
					System.out.println("6 - Sair");
					opcao = sc.next();
					
					switch (opcao) {
					case "1": 
						sistCompro.agendar(compromisso);
						break;
						
					case "2": 
						sistCompro.remover(compromisso);
						break;
						
					case "3": 
						sistCompro.alterarCompromisso(compromisso);
						break;
						
					case "4": 
						sistCompro.exibirCompromissosParticipantes(compromisso);
						break;
						
					case "5":
						sistCompro.exibirCompromissosData(compromisso);
						break;
						
					case "6":
						System.out.println("Programa fechado! Saindo...");
					}
					
					
				} while(!opcao.equals("6"));
				
				
	}

}
