package model;

import java.util.Date;

public class Docente extends Funcionario {
	private String siape;
	private String areaVinculo;
	
	
	public Docente(String cpf, String nome, String endereco, Date dataAdmissao, String titulacao, double salarioBase,String siape,String areaVinculo) {
		super(cpf,nome,endereco,dataAdmissao,titulacao,salarioBase);
		this.siape = siape;
		this.areaVinculo = areaVinculo;
		
		
	}
	@Override
	public double calcularSalario() {
		if(this.getTitulacao().equals("Mestre")) {
			return getSalarioBase()+ 0.2 * getSalarioBase();
		}else if(this.getTitulacao().equals("Doutor")){
			return getSalarioBase()+ 0.4 * getSalarioBase();
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
	public String getAreaVinculo() {
		return areaVinculo;
	}
	public void setAreaVinculo(String areaVinculo) {
		this.areaVinculo = areaVinculo;
	}
	@Override
	public String toString() {
		return "CPF: "+this.getCpf()+"\n"+"Nome: "+this.getNome()+"\n"+"Endereco: "+this.getEndereco()+"\n"+"Data de admissao: "+this.getDataAdmissao()+"\n"+"Titulacao: "+this.getTitulacao()+"\n"+"Salario base: "+this.getSalarioBase()+"\n"+"Siape: "+this.getSiape()+"\n"+"Area de vinculo: "+this.getAreaVinculo();
	}
	

	

}
