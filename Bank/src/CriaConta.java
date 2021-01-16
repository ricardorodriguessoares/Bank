// Projeto inicial da criação de um Banco /Initial project to create a Bank
//Autour: Ricardo Rodrigues
//email: ri.rodriguesoares@gmail.com  - phone +55 11 96160 7406
public class CriaConta {

		public static void main(String [] args) {
			Conta primeiraConta = new Conta();
			primeiraConta.saldo = 200;
			System.out.println(primeiraConta.saldo);
			
			primeiraConta.saldo += 100;
			System.out.println(primeiraConta.saldo);
			
			Conta segundaConta = new Conta();
			segundaConta.saldo = 50;
			
			System.out.println("A primeira conta tem " + primeiraConta.saldo);
			System.out.println("A segunda conta tem " + segundaConta.saldo);
			
			System.out.println(primeiraConta.agencia);
			System.out.println(primeiraConta.numero);
			
			//Verificando se as contas são as mesmas
			//Verifying that the accounts are the same
			if(primeiraConta == segundaConta) {
				System.out.println("São a Mesma conta");
			}else {
				System.out.println("Contas Diferentes");
			}
			
			//Confirmando que são duas referências porém para objeto diferente
			// Confirming that they are two references but for a different object
			//imprimindo o local de armazenamento na memória
			// printing the storage location in memory
			System.out.println(primeiraConta);
			System.out.println(segundaConta);
			
		}
}
