package Ficha3;

import java.util.List;
import java.util.ArrayList;


public class Banco {
	//atributos
	private String nome;
	private List<ContaBancaria> contas;
	private List<Casa> casas;
			
	//Construtores
	//Construtor1 apenas atributos obrigatórios (nome e inicialização lista)
	public Banco(String aNome) {
			   nome = aNome;
			   contas = new ArrayList<ContaBancaria>(100);
			   casas = new ArrayList<Casa>(100);
	}
	
	//métodos
	public void criaConta(ContaBancaria aConta){
		contas.add(aConta);
	}
	
	public ContaBancaria getConta(String aNome){
		ContaBancaria contaDesejada = null;
		for(ContaBancaria conBan: contas){ 	//for each: for(tipo/classe NomeDadoAgora : lista)
			if(aNome.equals(conBan.getTitular())){		//comparar strings: string1.equals(string2)
				contaDesejada=conBan;
			}
		}
		return contaDesejada;
	}
	
	public void adicionaCasa(Casa aCasa){
		casas.add(aCasa);
	}
	
	public void removeCasa(String aMorada){
		for(Casa home: casas){ 	//for each: for(tipo/classe NomeDadoAgora : lista)
			if(aMorada.equals(home.getMorada())){
				casas.remove(home);
			}
		}
	}
	
	public double getLucroPrevisto(){
		double lucroPrevisto=0.0;
		for(Casa home: casas){ 	//for each: for(tipo/classe NomeDadoAgora : lista)
			lucroPrevisto+=home.getMargemLucro();
		}
		return lucroPrevisto;
	}
	//operações
	//definir gets
	public List<ContaBancaria> getContas() {
		return contas;
	}
	
	//definir sets
	public void setContas(List<ContaBancaria> aContas) {
		this.contas = aContas;
	}
}
