//classe pai contendo m�todos e atributos que todas as outras classes filhas de contas possuem em comum. Heran�a
//Classe abstrata. N�o pode ser instanciada. Seguran�a para ningu�m instanciar. Vai exibir mensagem de erro se usar no main.
//Passa a poder usar m�todos abstratos. Uma conta vai dar ou tirar juros por exemplo.


public abstract class Conta {
	
	//atributos
	//Ajustar o modificador de acesso aos membros da classe. Usar protected para q as classes filhas de conta possam acessa-las exceto outras como a main. Ou seja, quem recebe extends no m�todo. 
	/*public*/ /*private*/ protected double saldo; //s� poder� ser alterado pelos m�todos sacar e depositar
	public int conta;
	public String nome; ////pode declarar um atributo com classe String
	
	//m�todos
	//colocar valor nos atributos
	//exemplo de overloading	
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
	//Tem que ser protected e n�o private, se n�o n�o poderei reencrever, override, o m�todo
	//N�o poderei usar override na classe pai se em nenhum momento ele ser� aproveitado da mesma forma, ou numa �nica classe total. E na outra ser um pouco reinscrita por exemplo
	//Ex.: L� em cima o m�todo sacar eu uso igual a da classe pai em poupan�a. Mas na corrente preciso aplicar o juros. A� eu posso usar o override nela.
	//Incluir o abstract pois ele n�o vai ter corpo. Ainda vai ter a classe sal�rio q n�o tem juros.
	//M�todo abstrado. N�o existe, mas vai existir quando HERDAR!.
	protected abstract void juro();/*{
		
	}*/
	
    // AULA8
    // exemplo de overloading
    // 2 m�todos com mesmo nome, este � sem par�metro. � diferente sendo o mesmo m�todo
    // quem sacar com a senha n�o paga juros
    // aplicar um par�metro
    public void sacar(double valor, String senha) {
        if (this.saldo >= 50) {
            this.saldo -= 50;
        } else {
            System.out.println("N�o Possui Saldo.");
        }
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
