
public class ContaCorrente extends Conta {
	/*//atributos
	public private double saldo; //s� poder� ser alterado pelos m�todos sacar e depositar
	public int conta;
	
	//m�todos
	//colocar valor nos atributos
	
	public void sacar(double valor){
		//quando sacar tem que debitar a conta
		//this.saldo = this.saldo - valor;
		
		//Aplicando regra para o sacar ap�s aplicar a regra de desconto por saque
		//apenas com essa condi��o no m�todo sacar ele n�o vai conseguir sacar um valor maior do que o seu saldo e vai continuar com o mesmo valor no retorno
			if (this.saldo >= valor){
				this.saldo -= valor;
//				this.saldo -= 1;
				this.juro(); //acessando o m�todo do juro
			}
		
		//simplificando
		//this.saldo -= valor;
		//ap�s instanciar verSaldo no main, vamos aplicar para as regras de neg�cio espec�ficas do banco
		//this.saldo = -1; //aqui n�o funciona por que ele vai atribuir -1 e n�o vai manter o saldo
		//this.saldo -= 1; //descontando 1 real a cada opera��o de saque //essa regra n�o se coloca dentro um atributo no main. tem que encapsular dentro do m�todo como aqui. se ficar public n�o funciona.
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	//feito esses 2 m�todos, agora vou testar estanciando ela na classe main
	//encapsulado o saldo:
	public void verSaldo(){
		this.juro();
		System.out.println("Saldo: " + this.saldo); //concatenando com this
//		this.juro(); //nao posso tirar o juros depois de ver pois n�o vai exibir atualizado em tela
	}
	
	//criar um m�todo juros para facilitar a manuten��o. se apenas replicar o this.saldo no m�todo ver saldo para a mesma regra no m�todo sacar n�o � uma boa pr�tica. pois se for uma classe com regra complexa ter� que mudar manualmente em todos os this soltos dos m�todos. e passar a chamar o this.juro em todos os m�todos, fazendo a altera��o apenas no m�todo de juros que est� sendo acessado
	//n�o pode ser public. boa pr�tica, s� tem utilidade aqui e n�o geral
*/
	//Reescrever o m�todo da minha classe pai
	//OVERRIDE (existe anota��o do hibernate com isso)
	public void sacar(double valor){
		//posso aplicar novamente os ifs aqui e depois chamar juro(); dentro desse m�todo. Mas a� perderia a utilidade de aplicar heran�a. Usar super
	//vamos chamar novamente com super que � usado para chamar m�todo na minha classe pai
		super.sacar(valor);
		this.juro();
	}
	
	//o m�todo de juro s� pode ser acessado quando o m�todo sacar tiver uma a��o. reescrever m�todo sem mecher na classe pai
	private void juro() {
		this.saldo -= 1;
	}

}
