import javax.swing.JOptionPane;


public class Carro {
	/*Se executar sem m�todo main aqui ela vai retornar no console o que h� na classe principal (main)*/
	/*public static void main (String args[]){
		System.out.println("TESTE");
	}*/
	
	/*a classe carro tem atributos, (vari�veis). tipo do atributo � string*/
	// Atributos
	public String carro;
	public int ano;
	/*Continuando... resolvendo problema. este atributo n�o pode ser alterado em main. Vamos criar uma seguran�a:. E depois ENCAPSULAR*/
	/*public*/private int marcha =0; /*Iniciando vari�vel. Sua l�gica � que come�a em ponto morto.*/
	/*Um atributo n�o server apenas para uma caracter�stica da classe, mas tamb�m para guardar status.*/
	/*Eu s� posso trocar um carro se ele estiver ligado, assim como outras a��es; Aplicando o true...*/
	public boolean ligado;
	public int velocidade;
	/*Por padr�o todo atributo boolean � false se n�o especificar*/
	/*Pela l�gica a minha classe carro inicia com o carro desligado. ent�o freio recebe direto true no atributo da vari�vel. e irei passar no m�todo acelerar a chamada do atributo*/ 
	public boolean freio = true;
	
	
	//M�todos
	/*S� vai executar esses m�todos quando eu invocar na classe main (em new - criando o objeto)*/
	
	public void ligar() {
		/*Antes de ligar um carro (pro this fora do if ter funcionalidade, precisamos saber antes se ele j� est� ligado ou n�o*/
		if(this.ligado == false) {
			/*Para acessar embros da classe o this � uma boa pr�tica*/
			this.ligado = true;
			//System.out.println("Carro ligado.");
			/*Com swing al�m de criar ele via interface e form, eu posso criar ele via codigo. Comenta a linha acima*/
			/*Apenas com uma linha ele usa uma interface gr�fica. Seu visual � do pr�prio java!*/
			/*Se n�o fizer em todos os m�todos, o que estiver no println vai car no console*/
		    JOptionPane.showMessageDialog(null, "Carro Ligado!");		
		} else {
			System.out.println("O carro j� est� ligado");
		}
		
		/*o this acessa membros da pr�pria classe*/
		
	}
	
	public void acelerar(int velocidade) {

		if (this.ligado == true){
			/*Continuando... vamos determinar que um caro s� ser� acelerado sem o freio puchado*/
			if(this.freio == false){
				
				/*Continuando... ap�s inciar a vari�vel da marcha*/
				if (this.marcha == 0){
					JOptionPane.showMessageDialog(null, "...est� em ponto morto...");
				} else if (this.marcha == 1) {
					/*Embora a constru��o feita abaixo, ele s� vai deixar acelerar se*/
					if (marcha < 30){

						this.velocidade = /*20*/ velocidade;
						System.out.println(this.velocidade);
					}
					
				} else if (this.marcha == 2) {
					if (marcha < 50){
						this.velocidade = velocidade;
						System.out.println(this.velocidade);
					}
				} else if (this.marcha == 3) {
					if(marcha < 80) {
						this.velocidade = velocidade;
						System.out.println(this.velocidade);
					}
				}
			
			}
		}

	}
	
	public void desligar() {
		
		if(this.ligado = true) {
			this.ligado = false;
			//System.out.println("Carro desligado");
			JOptionPane.showMessageDialog(null, "Carro Desligado!!");
		} else {
			System.out.println("O cara n�o est� ligado!");
		}
		
		
	}
	
	public void trocarMarcha() {
		//Encapsulando para resolver problema da O.O
		/*Aqui ele recebe ele de novo pra ir incrementando*/
		this.marcha = this.marcha + 1;
		/*System.out.println("Marcha trocada");*/
	}
}

/*pra essa classe funcionar ela tem que se tornar um objeto. Instaciando as classes... v� para a classe main*/