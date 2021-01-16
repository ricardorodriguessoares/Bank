
public class TesteReferencias {

		public static void main(String [] args) {
			Conta primeiraConta = new Conta();
			primeiraConta.saldo = 300;
			
			System.out.println("Saldo da Primeira Conta: " + primeiraConta.saldo);
			
			//Criando referência para a Primeira conta
			//Não foi criado um novo objeto e sim uma referência
			Conta segundaConta = primeiraConta;
			
			System.out.println("Saldo da Segunda Conta: " + segundaConta.saldo);
			
			//atribuindo um "Cheque Especial"
			segundaConta.saldo +=100;
			System.out.println("Saldo da Segunda Conta + Cheque Especial: " + segundaConta.saldo);
			
			//Verificando se as duas contas são as mesmas
			System.out.println(primeiraConta.saldo);
			
			//Utilizando o if para saber se as duas são as mesmas.
			if(primeiraConta == segundaConta) {
				System.out.println("São a mesma conta!");
			}else {
				System.out.println("Não, são contas diferentes!");
		}

			//Confirmando que são duas referências para o mesmo Objeto
			//imprimindo o local de armazenamento na memória
			System.out.println(primeiraConta);
			System.out.println(segundaConta);
		}
}
