//herdando da classe pai
public class ContaPoupanca extends Conta {

	//reescrever o m�todo para que n�o tenha juros de saque e saldo na poupan�a
	
	public void depositar(double valor){
		super.depositar(valor);
		this.juro();
	}
	
	private void juro(){
		this.saldo += 1; //rendendo
	}
}
