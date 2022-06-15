package model;

import java.util.Date;

public class Tecnico extends Funcionario{
	private String siape;
	private String departamento;
	
	public Tecnico(String cpf, String nome, String endereco, Date dataAdmissao, String titulacao, double salarioBase, String siape, String departamento) {
		super(cpf,nome,endereco,dataAdmissao,titulacao,salarioBase);
		this.siape = siape;
		this.departamento = departamento;
		
	}
	@Override
	public double calcularSalario() {
		if(this.getTitulacao().equals("Mestre")) {
			return getSalarioBase() + 0.15 * getSalarioBase();
		}else if(this.getTitulacao().equals("Doutor")){
			return getSalarioBase() + 0.3 * getSalarioBase();
		}else {
			return getSalarioBase();
		}
		
	}
	public String getSiape() {
		return siape;
	}
//	public void setSiape(String siape) {
//		this.siape = siape;
//	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	@Override 
	public String toString() {
		return "CPF: "+this.getCpf()+"\n"+"Nome: "+this.getNome()+"\n"+"Endereco: "+this.getEndereco()+"\n"+"Data de admissao: "+this.getDataAdmissao()+"\n"+"Titulacao: "+this.getTitulacao()+"\n"+"Salario base: "+this.getSalarioBase()+"\n"+"Siape: "+this.getSiape()+"\n"+"Departamento: "+this.getDepartamento();

	}
	

}
