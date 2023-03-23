package bancov01;

public class Conta {
String titular;
double saldo;
int numero;

public boolean deposita(double valor) {
	// o ! está negando o que está dentro do parentese.
	if(!(valor > 0)) 
		return false;
 else {
	this.saldo = this.saldo + valor;
	return true;
}
}
public boolean saca(double valor) {
	if(valor > this.saldo) {
		return false;
	} else {
		this.saldo -= valor;
		return true;
	}
}

public void mostraDados() {
	System.out.println("Titular: "+this.titular);
	System.out.println("Numero: "+this.numero);
	System.out.println("Saldo: "+this.saldo);
}

public boolean transferePara(Conta contaDestino, double valor) {
	if(this.saca(valor)==true) {
		boolean conseguiuDepositar = contaDestino.deposita(valor);
		return conseguiuDepositar;
	}
	return false;
}



}
