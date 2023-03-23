package bancov01;

public class TestaContas2 {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.titular = "Elton Charles";
		conta1.numero = 123;
		conta1.saldo = 3000;
		conta1.saca(1000);
		
		Conta conta2 = new Conta();
		conta2.titular = "Vitorino";
		conta2.numero = 456;
		conta2.saldo = 4000;
		conta2.deposita(2000);
		
		if(conta1.saca(3500)==false)
			System.out.println("Saldo insuficiente" + "Você possui o saldo de: " +conta1.saldo);
		else 
			System.out.println("Saqua efetuado com sucesso");
		conta2.deposita(-2000);
		
		Conta conta3 = conta2;
		conta3.titular = "Vitorino";
		
		System.out.println("conta1: ");
		conta1.mostraDados();
		System.out.println("###############");
		System.out.println("conta2: ");
		conta2.mostraDados();
	}

}
