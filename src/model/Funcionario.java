package model;

import java.util.Date;

public class Funcionario{
	private String cpf;
	private String nome;
	private String endereco;
	private Date dataAdmissao;
	private String titulacao;
	private double salarioBase;
	
	public Funcionario(String cpf, String nome, String endereco, Date dataEmissao, String titulacao, double salarioBase) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.dataAdmissao = dataEmissao;
		this.titulacao = titulacao;
		this.salarioBase = salarioBase;
	}
	public double calcularSalario() {
		return salarioBase;
	}
	public String getCpf() {
		return cpf;
	}
//	public void setCpf(String cpf) {
//		this.cpf = cpf;
//	}
	public String getNome() {
		return nome;
	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataEmissao) {
		this.dataAdmissao = dataEmissao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	

}
