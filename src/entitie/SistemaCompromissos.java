package entitie;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class SistemaCompromissos {
	
	
	public void agendar(List<Compromissos> listCompro) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Tipo: ");
		String tipo = sc.nextLine();
		
		System.out.print("Data: ");
		String data = sc.nextLine();
	
		
		System.out.print("Participante: ");
		String nome = sc.nextLine();
		
		
		System.out.print("Telefone: ");
		String tel = sc.nextLine();
		
		
		Compromissos compromisso = new Compromissos(tipo, sdf.parse(data), nome, tel);
		listCompro.add(compromisso);
		
	}
	
	public void remover(List<Compromissos> listCompro) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha qual compromisso deseja remover: ");
		for(int i = 0; i < listCompro.size(); i++) {
			System.out.println((i + 1) + ". "+ listCompro.get(i));
		}
		
		System.out.print("Digite o numero que deseja remover: ");
		int numRemove = sc.nextInt();
		
		
		if(numRemove > 0 && numRemove <= listCompro.size()) {
			Compromissos removido = listCompro.remove(numRemove - 1);
			System.out.println("Compromisso removido: \n"+ removido);
		}
		
		
	}
	
	public void alterarCompromisso(List<Compromissos> listCompro) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual compromisso deseja alterar: ");
		for(int i = 0; i < listCompro.size(); i++) {
			System.out.println((i + 1) + ". "+ listCompro.get(i));
		}
		
		System.out.print("Digite o numero que deseja alterar: ");
		int numAlterar = sc.nextInt();
		
        if(numAlterar > 0 && numAlterar <= listCompro.size()) {
        	
        	Compromissos compromisso = listCompro.get(numAlterar - 1);
			
        	System.out.print("O que deseja alterar (Tipo, Data, Participante, Telefone): ");
        	sc.nextLine();
    		String itemAlterado = sc.nextLine();
    		
    		
    		System.out.print("Digite um novo: ");
    		String novoItem = sc.nextLine();
    		
    		
    		switch (itemAlterado) {
    		case "Tipo": 
    			compromisso.setTipo(novoItem);
    			System.out.println("Compromisso alterado: \n"+ compromisso);
    			break;
    		case "Data":
    			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    			compromisso.setData(sdf.parse(novoItem));
    			System.out.println("Compromisso alterado: \n"+ compromisso);
    			break;
    		case "Participante":
    			compromisso.setNomeParticipante(novoItem);
    			System.out.println("Compromisso alterado:  \n"+ compromisso);
    			break;
    		case "Telefone": 
    		    compromisso.setTelefone(novoItem);
    			System.out.println("Compromisso alterado: \n"+ compromisso);
    		}
		 
		} else {
			System.out.println("Numero inválido.");
		}
		
    
        
	}
	
	public void exibirCompromissosParticipantes(List<Compromissos> compromisso) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do(a) participante: ");
		String participante = sc.nextLine();
		
		boolean encontrado = false;
		
		for(Compromissos c : compromisso) {
			if(participante.equals(c.getNomeParticipante())) {
				System.out.println(c);
				encontrado = true;
			}
		}
		
		if(!encontrado) {
			System.out.println("Participante não encontrado");
		}
		
	}
	
	public void exibirCompromissosData(List<Compromissos> compromisso) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Informe a data: ");
		String data = sc.next();
		
		boolean encontrado = false;
		
		for(Compromissos c : compromisso) {
			if(sdf.parse(data).equals(c.getData())) {
				System.out.println(c);
				encontrado = true;
			}
		}
		
		if(!encontrado) {
			System.out.println("Data não encontrada");
		}
		
	}

}
