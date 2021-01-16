//Projeto de um Banco
//Autor: Ricardo Rodrigues
// Contact: ri.rodriguesoares@gmail.com / +55 11 961607406
public class TesteReferencias {

		public static void main(String [] args) {
			Conta primeiraConta = new Conta();
			primeiraConta.saldo = 300;
			
			System.out.println("Saldo da Primeira Conta: " + primeiraConta.saldo);
			
			//Criando referência para a Primeira conta
			// Creating reference to the First account
			//Não foi criado um novo objeto e sim uma referência
			// A new object was not created, but a reference
			Conta segundaConta = primeiraConta;
			
			System.out.println("Saldo da Segunda Conta: " + segundaConta.saldo);
			
			//atribuindo um "Cheque Especial"
			// assigning an "Overdraft"
			segundaConta.saldo +=100;
			System.out.println("Saldo da Segunda Conta + Cheque Especial: " + segundaConta.saldo);
			
			//Verificando se as duas contas são as mesmas
			// Verifying that the two accounts are the same
			System.out.println(primeiraConta.saldo);
			
			//Utilizando o if para saber se as duas são as mesmas.
			// Using the if to see if the two are the same.
			if(primeiraConta == segundaConta) {
				System.out.println("São a mesma conta!");
			}else {
				System.out.println("Não, são contas diferentes!");
		}

			//Confirmando que são duas referências para o mesmo Objeto
			// Confirming that there are two references to the same object
			//imprimindo o local de armazenamento na memória
			// printing the storage location in memory
			System.out.println(primeiraConta);
			System.out.println(segundaConta);
		}
}
