
public class TesteReferencias {

		public static void main(String [] args) {
			Conta primeiraConta = new Conta();
			primeiraConta.saldo = 300;
			
			System.out.println("Saldo da Primeira Conta: " + primeiraConta.saldo);
			
			//Criando refer�ncia para a Primeira conta
			//N�o foi criado um novo objeto e sim uma refer�ncia
			Conta segundaConta = primeiraConta;
			
			System.out.println("Saldo da Segunda Conta: " + segundaConta.saldo);
			
			//atribuindo um "Cheque Especial"
			segundaConta.saldo +=100;
			System.out.println("Saldo da Segunda Conta + Cheque Especial: " + segundaConta.saldo);
			
			//Verificando se as duas contas s�o as mesmas
			System.out.println(primeiraConta.saldo);
			
			//Utilizando o if para saber se as duas s�o as mesmas.
			if(primeiraConta == segundaConta) {
				System.out.println("S�o a mesma conta!");
			}else {
				System.out.println("N�o, s�o contas diferentes!");
		}

			//Confirmando que s�o duas refer�ncias para o mesmo Objeto
			//imprimindo o local de armazenamento na mem�ria
			System.out.println(primeiraConta);
			System.out.println(segundaConta);
		}
}
