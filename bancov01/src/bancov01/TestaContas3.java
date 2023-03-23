package bancov01;

public class TestaContas3 {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.titular = "Elton Charles";
		conta1.numero = 123;
		conta1.saldo = 3000;
		
		
		Conta conta2 = new Conta();
		conta2.titular = "Vitorino";
		conta2.numero = 456;
		conta2.saldo = 4000;
		
		
		conta1.transferePara(conta2, 1000);
		
		System.out.println("conta1: ");
		conta1.mostraDados();
		System.out.println("###############");
		System.out.println("conta2: ");
		conta2.mostraDados();
	}

}
