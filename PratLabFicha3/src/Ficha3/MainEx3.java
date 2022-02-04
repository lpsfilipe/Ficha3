package Ficha3;

public class MainEx3 {
	public static void main(String[] args) {
		//criar uma casa
		Casa casa1 = new Casa("Rua da Amargura, nº5");
		casa1.setPrecoCusto(100000);
		casa1.setPrecoVenda(120000);
		
		//criar a segunda casa
		Casa casa2 = new Casa();
		casa2.setMorada("Rua da Esquina, nº7");
		casa2.setPrecoCusto(80000);
		casa2.setPrecoVenda(115000);
				
		//criar a terceira casa
		Casa casa3 = new Casa("Rua do Ouro, nº13");
		casa3.setPrecoCusto(125000);
		casa3.setPrecoVenda(180000);
		

		System.out.println(casa1.getMargemLucro());
		System.out.println(casa1.getPercentMargemLucro());
		System.out.println(casa2.getMargemLucro());
		System.out.println(casa2.getPercentMargemLucro());
		System.out.println(casa3.getMargemLucro());
		System.out.println(casa3.getPercentMargemLucro());
		
	}
}
