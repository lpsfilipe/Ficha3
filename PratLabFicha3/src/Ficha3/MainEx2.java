package Ficha3;

public class MainEx2 {
	public static void main(String[] args) {
		Banco FranBanco = new Banco("FranBanco");
		ContaBancaria Conta1 = new ContaBancaria("Francisco");
		FranBanco.criaConta(Conta1);
		String Aux;
		
		Conta1.depositar(1562.8);
		Aux=Conta1.getInformacaoConta();
		System.out.println(Aux);
		Conta1.depositar(82.4);
		Aux=Conta1.getInformacaoConta();
		System.out.println(Aux);
		Conta1.levantar(855.9);
		Aux=Conta1.getInformacaoConta();
		System.out.println(Aux);
		Conta1.depositar(112.7);
		Aux=Conta1.getInformacaoConta();
		System.out.println(Aux);
		Conta1.levantar(245.2);
		Aux=Conta1.getInformacaoConta();
		System.out.println(Aux);
		
	}
}
