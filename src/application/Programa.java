package application;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta minhaConta= new Conta();
		
		minhaConta.titular="Malu Formis";
		minhaConta.numero= 50507;
		minhaConta.saldo = 2000;
		
		System.out.println("Saldo atual: " + minhaConta.saldo );
		
		
		//TODO: Adicionar mensagem caso o cliente não consiga 
		//sacar ou uma mensagem de sucesso!
		
		if(minhaConta.sacar(200.00)) {
			System.out.println("Operação efetuada com sucesso");
			
			
		}else {
			System.out.println("Erro...verifique o saldo");
		}
		
		
		minhaConta.sacar(600.45);
		System.out.println("Saldo atual: " + minhaConta.saldo );
		
		minhaConta.depositar(200.45);
		System.out.println("Saldo depois de sacar: " + minhaConta.saldo);
		
		
	
	}
	
		
}
	

