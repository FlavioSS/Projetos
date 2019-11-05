
public class ContaCorrente extends Conta {
	/*//atributos
	public private double saldo; //só poderá ser alterado pelos métodos sacar e depositar
	public int conta;
	
	//métodos
	//colocar valor nos atributos
	
	public void sacar(double valor){
		//quando sacar tem que debitar a conta
		//this.saldo = this.saldo - valor;
		
		//Aplicando regra para o sacar após aplicar a regra de desconto por saque
		//apenas com essa condição no método sacar ele não vai conseguir sacar um valor maior do que o seu saldo e vai continuar com o mesmo valor no retorno
			if (this.saldo >= valor){
				this.saldo -= valor;
//				this.saldo -= 1;
				this.juro(); //acessando o método do juro
			}
		
		//simplificando
		//this.saldo -= valor;
		//após instanciar verSaldo no main, vamos aplicar para as regras de negócio específicas do banco
		//this.saldo = -1; //aqui não funciona por que ele vai atribuir -1 e não vai manter o saldo
		//this.saldo -= 1; //descontando 1 real a cada operação de saque //essa regra não se coloca dentro um atributo no main. tem que encapsular dentro do método como aqui. se ficar public não funciona.
	}
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	//feito esses 2 métodos, agora vou testar estanciando ela na classe main
	//encapsulado o saldo:
	public void verSaldo(){
		this.juro();
		System.out.println("Saldo: " + this.saldo); //concatenando com this
//		this.juro(); //nao posso tirar o juros depois de ver pois não vai exibir atualizado em tela
	}
	
	//criar um método juros para facilitar a manutenção. se apenas replicar o this.saldo no método ver saldo para a mesma regra no método sacar não é uma boa prática. pois se for uma classe com regra complexa terá que mudar manualmente em todos os this soltos dos métodos. e passar a chamar o this.juro em todos os métodos, fazendo a alteração apenas no método de juros que está sendo acessado
	//não pode ser public. boa prática, só tem utilidade aqui e não geral
*/
	//Reescrever o método da minha classe pai
	//OVERRIDE (existe anotação do hibernate com isso)
	public void sacar(double valor){
		//posso aplicar novamente os ifs aqui e depois chamar juro(); dentro desse método. Mas aí perderia a utilidade de aplicar herança. Usar super
	//vamos chamar novamente com super que é usado para chamar método na minha classe pai
		super.sacar(valor);
		this.juro();
	}
	
	//o método de juro só pode ser acessado quando o método sacar tiver uma ação. reescrever método sem mecher na classe pai
	private void juro() {
		this.saldo -= 1;
	}

}
