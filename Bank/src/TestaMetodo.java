//Projeto de um Banco
//Autor: Ricardo Rodrigues
// Contact: ri.rodriguesoares@gmail.com / +55 11 961607406
public class TestaMetodo {
	
	public static void main(String [] args) {
		Conta contaDoRicardo = new Conta();
		contaDoRicardo.saldo = 100;
		contaDoRicardo.deposita(50);
		
		
		System.out.println(contaDoRicardo.saldo);
		//invocando o metodo entre parentes ()
		boolean conseguiuRetirar = contaDoRicardo.saca(20);
		System.out.println(contaDoRicardo.saldo);
		System.out.println(conseguiuRetirar);
		
		//Novo obeto criado para transferir valor
		Conta contaDaLuciana = new Conta();
		contaDaLuciana.deposita(1000);
		
		//Ao executar o saldo ficou em R$ 700,00
		//depois inclui o If para saber se haviua valor em conta sim ou não
		if (contaDaLuciana.transfere(3000, contaDoRicardo)) {
			System.out.println("Transferência realizada com Sucesso ");
			}else {
				System.out.println("Faltou Dinheiro em Conta ");
			}
		System.out.println(contaDaLuciana.saldo);
		
		//execultamos novamente o System para verificar se o valor foi transferido
		System.out.println(contaDoRicardo.saldo);
		
		contaDoRicardo.titular = "Ricardo Rodrigues ";
		System.out.println(contaDoRicardo.titular);
	}

}
