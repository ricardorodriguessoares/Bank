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
	
	//Um novo método para sacar, usando o this para informar a conta e o if para averiguar se tem valor
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}else {
			return false;
		}
		
	}
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			//retur é uma palavra chave que para a execusão do método
			//portando colocar o else é opcional, no caso optei por colocar
			return false;
		}
}
}
