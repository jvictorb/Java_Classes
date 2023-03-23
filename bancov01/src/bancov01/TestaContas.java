package bancov01;

public class TestaContas {
	
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
		
		Conta conta3 = new Conta();
		conta3.titular = "Coxinha";
		conta3.numero = 789;
		conta3.saldo = 1500;
		conta3.deposita(500);
		
		System.out.println("conta1: ");
		conta1.mostraDados();
		System.out.println("####################");
		conta2.mostraDados();
		System.out.println("####################");
		System.out.println("conta1: ");
		System.out.println("Titular: "+conta3.titular);
		System.out.println("Numero: "+conta3.numero);
		System.out.println("Saldo: "+conta3.saldo);
		System.out.println("####################");
		
		
	}

}
