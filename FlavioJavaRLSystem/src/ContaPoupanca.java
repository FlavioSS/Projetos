//herdando da classe pai
//Ninguém pode herdar da classe poupança. Mesmo que aconteça um erro de requisito ou de codificação o final faz a segurança;
public final class ContaPoupanca extends Conta {

	//reescrever o método para que não tenha juros de saque e saldo na poupança
	
	public void depositar(double valor){
		super.depositar(valor);
		this.juro();
	}
	//na aula 7 coloquei esse método vazio na classe pai. Passar o protected na conta corrente também.
	//Tem que ser protected e não private, se não não poderei reencrever, override, o método
	//Não poderei usar override na classe pai se em nenhum momento ele será aproveitado da mesma forma, ou numa única classe total. E na outra ser um pouco reinscrita por exemplo
	//a subscrição torna o método abstrato no main como existente, e sobescreve com a regra de negócio que a poupança tem.
	@Override
	protected /*private*/ void juro(){
		this.saldo += 1; //rendendo //Implementado com função; Como herda de uma classe abstrata se não colocar ele vai dá um erro dizendo que add implement, pq você está herndando de uma classe abstrata sem aplicar o método abstrato. Mas você inclui. No caso de conta salário isso também vai ser implementado, mas deixando esse método vazio.
	}
}
