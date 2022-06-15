package view;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.Docente;
import model.Funcionario;
import model.RH;
import model.Tecnico;
import model.Tercerizado;

public class Main {

	public static void main(String[] args) {
		
		int opcao=0;
		Scanner leitura = new Scanner(System.in);
		RH listaRH = new RH();
		
		
		do{
			System.out.println("Menu");
			System.out.println("1-Cadastrar um novo funcionario");
			System.out.println("2-Pesquisar um funcionario e retornar todos seus dados");
			System.out.println("3-Listar todos funcionarios com todos seus dados");
			System.out.println("4-Saida");
			
			opcao = leitura.nextInt();
			switch (opcao) {
			case 1:{ 
				System.out.println("1-Docente");
				System.out.println("2-Tecnico");
				System.out.println("3-Tercerizado");
				switch(leitura.nextInt()) {
				case 1:{
					
					leitura.nextLine();
					
					System.out.print("CPF: ");
					String cpf = leitura.nextLine();
					
					System.out.print("Nome: ");
					String nome = leitura.nextLine();
					
					System.out.print("Endereco: ");
					String endereco = leitura.nextLine();
					
					System.out.print("Titulacao: ");
					String titulacao = leitura.nextLine();
					
					System.out.print("Salario base: ");
					double salarioBase = leitura.nextDouble();
					
					leitura.nextLine();
					
					System.out.print("Siape: ");
					String siape = leitura.nextLine();
					
					System.out.print("Area de vinculo: ");
					String areaVinculo = leitura.nextLine();
					
					System.out.print("Data de admissao: ");
					String dataAdmissaostr = leitura.nextLine();
					
					SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
					
					Date dataAdmissao = null;
					try {
						dataAdmissao = formato.parse(dataAdmissaostr);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					Docente docente1 = new Docente(cpf,nome,endereco, dataAdmissao,titulacao,salarioBase,siape,areaVinculo);
					listaRH.adiciona(docente1);
					break;
				}
				case 2:{
					
					leitura.nextLine();
					
					System.out.print("CPF: ");
					String cpf = leitura.nextLine();
					
					
					System.out.print("Nome: ");
					String nome = leitura.nextLine();
					
					System.out.print("Endereco: ");
					String endereco = leitura.nextLine();
					
					System.out.print("Titulacao: ");
					String titulacao = leitura.nextLine();
					
					System.out.print("Salario base: ");
					double salarioBase = leitura.nextDouble();
					
					leitura.nextLine();
					
					System.out.print("Siape: ");
					String siape = leitura.nextLine();
					
					System.out.print("Departamento: ");
					String departamento = leitura.nextLine();
					
					System.out.print("Data de admissao: ");
					String dataAdmissaostr = leitura.nextLine();
					
					SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
					
					Date dataAdmissao = null;
					try {
						dataAdmissao = formato.parse(dataAdmissaostr);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					
					Tecnico tecnico1 = new Tecnico(cpf,nome,endereco, dataAdmissao,titulacao,salarioBase,siape,departamento);
					listaRH.adiciona(tecnico1);
					break;
				}
				case 3:{
					
					leitura.nextLine();
					
					System.out.print("CPF: ");
					String cpf = leitura.nextLine();
					
					System.out.print("Nome: ");
					String nome = leitura.nextLine();
					
					System.out.print("Endereco: ");
					String endereco = leitura.nextLine();
					
					System.out.print("Titulacao: ");
					String titulacao = leitura.nextLine();
					
					System.out.print("Salario base: ");
					double salarioBase = leitura.nextDouble();
					
					leitura.nextLine();
					
					System.out.print("funcao exercida: ");
					String funcaoExercida = leitura.nextLine();
					
					System.out.print("Data de admissao: ");
					String dataAdmissaostr = leitura.nextLine();
					
					SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
					
					Date dataAdmissao = null;
					try {
						dataAdmissao = formato.parse(dataAdmissaostr);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					
					System.out.print("Data fim contrato: ");
					String dataFimContratostr = leitura.nextLine();
					
					//SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
					
					Date dataFimContrato = null;
					try {
						dataFimContrato = formato.parse(dataFimContratostr);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					
					Tercerizado tercerizado1 = new Tercerizado(cpf,nome,endereco, dataAdmissao,titulacao,salarioBase,dataFimContrato,funcaoExercida);
					listaRH.adiciona(tercerizado1);
					break;
				}
					
				}
			
				break;
			}
			case 2:{
				leitura.nextLine();
				boolean encontrou = false;
				System.out.print("Nome: ");
				String nome = leitura.nextLine();
				for(Funcionario funcionario:listaRH.getLista()) {
					if(funcionario.getNome().equals(nome) ) {
						encontrou = true;
						System.out.println(funcionario+"\n");
					}
				}
				if(!encontrou) {
					System.out.println("Nome nao encontrado");
				}
				break;
				
				
			}
			case 3:{
				for(Funcionario funcionario:listaRH.getLista()) {
					System.out.println(funcionario+"\n");
				}
				break;
			}
			case 4:{
				System.out.println("Saindo...");
			}
			
			
			}
			
		}while(opcao!=4);
		leitura.close();
		

	}

}
