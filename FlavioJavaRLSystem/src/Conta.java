//classe pai contendo m�todos e atributos que todas as outras classes filhas de contas possuem em comum. Heran�a
public class Conta {
	
	//atributos
	//Ajustar o modificador de acesso aos membros da classe. Usar protected para q as classes filhas de conta possam acessa-las exceto outras como a main. Ou seja, quem recebe extends no m�todo. 
	/*public*/ /*private*/ protected double saldo; //s� poder� ser alterado pelos m�todos sacar e depositar
	public int conta;
	public String nome; ////pode declarar um atributo com classe String
	
	//m�todos
	//colocar valor nos atributos
	
	public void sacar(double valor){
		//quando sacar tem que debitar a conta
		//this.saldo = this.saldo - valor;
		
		//Aplicando regra para o sacar ap�s aplicar a regra de desconto por saque
		//apenas com essa condi��o no m�todo sacar ele n�o vai conseguir sacar um valor maior do que o seu saldo e vai continuar com o mesmo valor no retorno
		//Como o meu if executa uma �nica linha de c�digo, eu posso n�o usar as chaves
			if (this.saldo >= valor)/*{*/
				this.saldo -= valor;
//				this.saldo -= 1;
				//this.juro(); //acessando o m�todo do juro
				///tratando retorno A.5
//			/*}*/  /*{*/
				else
				System.out.println("N�o Possui Saldo.");
			/*}*/
		
		//simplificando
		//this.saldo -= valor;
		//ap�s instanciar verSaldo no main, vamos aplicar para as regras de neg�cio espec�ficas do banco
		//this.saldo = -1; //aqui n�o funciona por que ele vai atribuir -1 e n�o vai manter o saldo
		//this.saldo -= 1; //descontando 1 real a cada opera��o de saque //essa regra n�o se coloca dentro um atributo no main. tem que encapsular dentro do m�todo como aqui. se ficar public n�o funciona.
	}
	
	public void depositar(double valor){
		this.saldo += valor;
		///this � da classe, e o valor j� est� dentro do m�todo
		if(valor == 100/*> 99*/){
			System.out.println("Voc� foi sorteado!");
		}
	}
	//feito esses 2 m�todos, agora vou testar estanciando ela na classe main
	//encapsulado o saldo:
	public void verSaldo(){
		//this.juro();
		//o que � herdado em todas basta apenas ajustar na classe pai.
		System.out.println("Saldo: US$" + this.saldo); //concatenando com this
//		this.juro(); //nao posso acessar o juros depois de ver pois n�o vai exibir atualizado em tela
	}
	
	//criar um m�todo juros para facilitar a manuten��o. se apenas replicar o this.saldo no m�todo ver saldo para a mesma regra no m�todo sacar n�o � uma boa pr�tica. pois se for uma classe com regra complexa ter� que mudar manualmente em todos os this soltos dos m�todos. e passar a chamar o this.juro em todos os m�todos, fazendo a altera��o apenas no m�todo de juros que est� sendo acessado
	//n�o pode ser public. boa pr�tica, s� tem utilidade aqui e n�o geral
	/*private void juro() {
		this.saldo -= 1;
	}
*/
	
}
