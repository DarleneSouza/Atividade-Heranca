package model;

import java.util.ArrayList;

public class RH {
	private ArrayList<Funcionario> lista;
	
	public RH() {
		lista = new ArrayList<Funcionario>();
		
	}
	public void adiciona(Funcionario funcionario){
		lista.add(funcionario);
		
	}
	public ArrayList<Funcionario> getLista(){
		return this.lista;
	}
}
