package Ficha3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DecimalFormat;

public class ContaBancaria {
	//atributos
		private String titular;
		private double saldo;
		private Date dataAbertura;
				
		//Construtores
		//Construtor1 apenas atributos obrigat�rios (titular e inicializa��es)
		public ContaBancaria(String aTitular) {
				   titular = aTitular;
				   saldo = 0.0;
				   dataAbertura = new Date();
		}
		
		//m�todos
		public String getInformacaoConta() {
			SimpleDateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy");
			String dataForm= dateFor.format(dataAbertura);
			String infoConta = "Titular: " + titular + " Saldo: " + new DecimalFormat("#,##0.00").format(saldo) + " Data Abertura: " + dataForm;
			return infoConta;
		}
		
		public void depositar(double aDeposito){
			saldo+=aDeposito;
		}
		
		public void levantar(double aLevantamento){
			if(saldo>=aLevantamento){
			saldo-=aLevantamento;
			}
			else {
				System.out.println("Erro: o saldo dispon�vel n�o � suficiente para realizar o levantamento pretendido");
			}
		}
		//opera��es
		//definir gets
		public String getTitular(){
			return titular;
		}
		
		public double getSaldo(){
			return saldo;
		}

		public Date getDataAbertura(){
			return dataAbertura;
		}
		//definir sets
		public void setSaldo(double aSaldo){
			saldo = aSaldo;
		}

}