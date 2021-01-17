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
	}

}
