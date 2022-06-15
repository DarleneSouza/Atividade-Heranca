package model;

import java.util.Date;

public class Tercerizado extends Funcionario {
	private Date dataFimContrato;
	private String funcaoExcercida;
	
	public Tercerizado(String cpf, String nome, String endereco, Date dataAdmissao, String titulacao, double salarioBase, Date dataFimContrato, String funcaoExercida) {
		super(cpf,nome,endereco,dataAdmissao,titulacao,salarioBase);
		this.dataFimContrato = dataFimContrato;
		this.funcaoExcercida = funcaoExercida;
	}
	@Override
	public double calcularSalario() {
		if(this.getTitulacao().equals("Mestre")&& this.funcaoExcercida.equals("Professor")) {
			return getSalarioBase() + 500;
		}else if(this.getTitulacao().equals("Doutor")&& this.funcaoExcercida.equals("Professor")) {
			return getSalarioBase() + 1000;
		}else {
			return getSalarioBase();
		}
		
	}
	public Date getDataFimContrato() {
		return dataFimContrato;
	}
	public void setDataFimContrato(Date dataFimContrato) {
		this.dataFimContrato = dataFimContrato;
	}
	public String getFuncaoExcercida() {
		return funcaoExcercida;
	}
	public void setFuncaoExcercida(String funcaoExcercida) {
		this.funcaoExcercida = funcaoExcercida;
	}
	@Override
	public String toString() {
		return "CPF: "+this.getCpf()+"\n"+"Nome: "+this.getNome()+"\n"+"Endereco: "+this.getEndereco()+"\n"+"Data de admissao: "+this.getDataAdmissao()+"\n"+"Titulacao: "+this.getTitulacao()+"\n"+"Salario base: "+this.getSalarioBase()+"\n"+"Data fim do contrato: "+this.getDataFimContrato()+"\n"+"Funcao exercida: "+this.getFuncaoExcercida();

	}
	

}
