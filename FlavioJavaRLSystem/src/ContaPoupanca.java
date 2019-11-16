//herdando da classe pai
//Ningu�m pode herdar da classe poupan�a. Mesmo que aconte�a um erro de requisito ou de codifica��o o final faz a seguran�a;
public final class ContaPoupanca extends Conta {

	//reescrever o m�todo para que n�o tenha juros de saque e saldo na poupan�a
	
	public void depositar(double valor){
		super.depositar(valor);
		this.juro();
	}
	//na aula 7 coloquei esse m�todo vazio na classe pai. Passar o protected na conta corrente tamb�m.
	//Tem que ser protected e n�o private, se n�o n�o poderei reencrever, override, o m�todo
	//N�o poderei usar override na classe pai se em nenhum momento ele ser� aproveitado da mesma forma, ou numa �nica classe total. E na outra ser um pouco reinscrita por exemplo
	//a subscri��o torna o m�todo abstrato no main como existente, e sobescreve com a regra de neg�cio que a poupan�a tem.
	@Override
	protected /*private*/ void juro(){
		this.saldo += 1; //rendendo //Implementado com fun��o; Como herda de uma classe abstrata se n�o colocar ele vai d� um erro dizendo que add implement, pq voc� est� herndando de uma classe abstrata sem aplicar o m�todo abstrato. Mas voc� inclui. No caso de conta sal�rio isso tamb�m vai ser implementado, mas deixando esse m�todo vazio.
	}
}
