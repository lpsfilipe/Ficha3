package Ficha3;

public class Casa {
	//atributos
		private String morada;
		private double precoCusto;
		private double precoVenda;
				
		//Construtores
		//Construtor1 sem argumentos
		public Casa() {
		}
		
		//Construtor2 apenas com morada
		public Casa(String aMorada) {
			morada=aMorada;
		}
		
		//métodos
		public double getMargemLucro(){
			return precoVenda-precoCusto;
		}
		
		public double getPercentMargemLucro(){
			return precoVenda/precoCusto;
		}
		
		//operações
		//definir gets
		public String getMorada() {
			return morada;
		}
		
		public double getPrecoCusto() {
			return precoCusto;
		}
		
		public double getPrecoVenda() {
			return precoVenda;
		}
		
		//definir sets
		public void setMorada(String aMorada) {
			morada=aMorada;
		}
		
		public void setPrecoCusto(double aPrecoCusto) {
			precoCusto=aPrecoCusto;
		}
		
		public void setPrecoVenda(double aPrecoVenda) {
			precoVenda=aPrecoVenda;
		}
	}
