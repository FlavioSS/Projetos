//herdando da classe pai
public class ContaPoupanca extends Conta {

	//reescrever o método para que não tenha juros de saque e saldo na poupança
	
	public void depositar(double valor){
		super.depositar(valor);
		this.juro();
	}
	
	private void juro(){
		this.saldo += 1; //rendendo
	}
}
