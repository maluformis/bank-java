package application;

public class Conta {

	int numero;
	String titular;
	double saldo;
	
	
	//void, sem retorno
	boolean sacar(double quantidade ) {
		
		if (this.saldo < quantidade) {
			return false;
		
	} else {
		
		this.saldo -= quantidade;
		return true;
		
	    }
		
	
    }

	
	void depositar(double quantidade)  {
		this.saldo += quantidade;
		
		
		
	      }
	
	}

