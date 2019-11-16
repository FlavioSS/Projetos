//classe pai contendo métodos e atributos que todas as outras classes filhas de contas possuem em comum. Herança
//Classe abstrata. Não pode ser instanciada. Segurança para ninguém instanciar. Vai exibir mensagem de erro se usar no main.
//Passa a poder usar métodos abstratos. Uma conta vai dar ou tirar juros por exemplo.


public abstract class Conta {
	
	//atributos
	//Ajustar o modificador de acesso aos membros da classe. Usar protected para q as classes filhas de conta possam acessa-las exceto outras como a main. Ou seja, quem recebe extends no método. 
	/*public*/ /*private*/ protected double saldo; //só poderá ser alterado pelos métodos sacar e depositar
	public int conta;
	public String nome; ////pode declarar um atributo com classe String
	
	//métodos
	//colocar valor nos atributos
	//exemplo de overloading	
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
	//Tem que ser protected e não private, se não não poderei reencrever, override, o método
	//Não poderei usar override na classe pai se em nenhum momento ele será aproveitado da mesma forma, ou numa única classe total. E na outra ser um pouco reinscrita por exemplo
	//Ex.: Lá em cima o método sacar eu uso igual a da classe pai em poupança. Mas na corrente preciso aplicar o juros. Aí eu posso usar o override nela.
	//Incluir o abstract pois ele não vai ter corpo. Ainda vai ter a classe salário q não tem juros.
	//Método abstrado. Não existe, mas vai existir quando HERDAR!.
	protected abstract void juro();/*{
		
	}*/
	
    // AULA8
    // exemplo de overloading
    // 2 métodos com mesmo nome, este é sem parâmetro. è diferente sendo o mesmo método
    // quem sacar com a senha não paga juros
    // aplicar um parâmetro
    public void sacar(double valor, String senha) {
        if (this.saldo >= 50) {
            this.saldo -= 50;
        } else {
            System.out.println("Não Possui Saldo.");
        }
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
