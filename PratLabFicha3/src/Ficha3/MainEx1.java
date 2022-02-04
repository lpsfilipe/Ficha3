package Ficha3;

public class MainEx1 {
	public static void main(String[] args) {
		ContaBancaria Conta1 = new ContaBancaria("Francisco");
		String Aux;
		
		Conta1.depositar(1572.8);
		Aux=Conta1.getInformacaoConta();
		System.out.println(Aux);
		Conta1.depositar(72.4);
		Aux=Conta1.getInformacaoConta();
		System.out.println(Aux);
		Conta1.levantar(865.9);
		Aux=Conta1.getInformacaoConta();
		System.out.println(Aux);
		Conta1.depositar(102.7);
		Aux=Conta1.getInformacaoConta();
		System.out.println(Aux);
		Conta1.levantar(255.1);
		Aux=Conta1.getInformacaoConta();
		System.out.println(Aux);
		
	}
}
