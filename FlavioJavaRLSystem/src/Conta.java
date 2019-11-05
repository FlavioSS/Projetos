//classe pai contendo métodos e atributos que todas as outras classes filhas de contas possuem em comum. Herança
public class Conta {
	
	//atributos
	//Ajustar o modificador de acesso aos membros da classe. Usar protected para q as classes filhas de conta possam acessa-las exceto outras como a main. Ou seja, quem recebe extends no método. 
	/*public*/ /*private*/ protected double saldo; //só poderá ser alterado pelos métodos sacar e depositar
	public int conta;
	public String nome; ////pode declarar um atributo com classe String
	
	//métodos
	//colocar valor nos atributos
	
	public void sacar(double valor){
		//quando sacar tem que debitar a conta
		//this.saldo = this.saldo - valor;
		
		//Aplicando regra para o sacar após aplicar a regra de desconto por saque
		//apenas com essa condição no método sacar ele não vai conseguir sacar um valor maior do que o seu saldo e vai continuar com o mesmo valor no retorno
		//Como o meu if executa uma única linha de código, eu posso não usar as chaves
			if (this.saldo >= valor)/*{*/
				this.saldo -= valor;
//				this.saldo -= 1;
				//this.juro(); //acessando o método do juro
				///tratando retorno A.5
//			/*}*/  /*{*/
				else
				System.out.println("Não Possui Saldo.");
			/*}*/
		
		//simplificando
		//this.saldo -= valor;
		//após instanciar verSaldo no main, vamos aplicar para as regras de negócio específicas do banco
		//this.saldo = -1; //aqui não funciona por que ele vai atribuir -1 e não vai manter o saldo
		//this.saldo -= 1; //descontando 1 real a cada operação de saque //essa regra não se coloca dentro um atributo no main. tem que encapsular dentro do método como aqui. se ficar public não funciona.
	}
	
	public void depositar(double valor){
		this.saldo += valor;
		///this é da classe, e o valor já está dentro do método
		if(valor == 100/*> 99*/){
			System.out.println("Você foi sorteado!");
		}
	}
	//feito esses 2 métodos, agora vou testar estanciando ela na classe main
	//encapsulado o saldo:
	public void verSaldo(){
		//this.juro();
		//o que é herdado em todas basta apenas ajustar na classe pai.
		System.out.println("Saldo: US$" + this.saldo); //concatenando com this
//		this.juro(); //nao posso acessar o juros depois de ver pois não vai exibir atualizado em tela
	}
	
	//criar um método juros para facilitar a manutenção. se apenas replicar o this.saldo no método ver saldo para a mesma regra no método sacar não é uma boa prática. pois se for uma classe com regra complexa terá que mudar manualmente em todos os this soltos dos métodos. e passar a chamar o this.juro em todos os métodos, fazendo a alteração apenas no método de juros que está sendo acessado
	//não pode ser public. boa prática, só tem utilidade aqui e não geral
	/*private void juro() {
		this.saldo -= 1;
	}
*/
	
}
