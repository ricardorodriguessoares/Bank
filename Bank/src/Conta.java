//Projeto de um Banco
//Autor: Ricardo Rodrigues
// Contact: ri.rodriguesoares@gmail.com / +55 11 961607406
public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//trabalhando com métodos
	//o void nesse caso serve para não devolver nenhuma resposta sobre o método "depósito"
	public void deposita(double valor) {
		
		//para somar o saldo da conta ao depósito
		//o this serve para informar qual conta buscar o saldo
		this.saldo = this.saldo + valor;
	}
}
