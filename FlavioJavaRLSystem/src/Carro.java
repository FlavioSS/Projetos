import javax.swing.JOptionPane;


public class Carro {
	/*Se executar sem método main aqui ela vai retornar no console o que há na classe principal (main)*/
	/*public static void main (String args[]){
		System.out.println("TESTE");
	}*/
	
	/*a classe carro tem atributos, (variáveis). tipo do atributo é string*/
	// Atributos
	public String carro;
	public int ano;
	/*Continuando... resolvendo problema. este atributo não pode ser alterado em main. Vamos criar uma segurança:. E depois ENCAPSULAR*/
	/*public*/private int marcha =0; /*Iniciando variável. Sua lógica é que começa em ponto morto.*/
	/*Um atributo não server apenas para uma característica da classe, mas também para guardar status.*/
	/*Eu só posso trocar um carro se ele estiver ligado, assim como outras ações; Aplicando o true...*/
	public boolean ligado;
	public int velocidade;
	/*Por padrão todo atributo boolean é false se não especificar*/
	/*Pela lógica a minha classe carro inicia com o carro desligado. então freio recebe direto true no atributo da variável. e irei passar no método acelerar a chamada do atributo*/ 
	public boolean freio = true;
	
	
	//Métodos
	/*Só vai executar esses métodos quando eu invocar na classe main (em new - criando o objeto)*/
	
	public void ligar() {
		/*Antes de ligar um carro (pro this fora do if ter funcionalidade, precisamos saber antes se ele já está ligado ou não*/
		if(this.ligado == false) {
			/*Para acessar embros da classe o this é uma boa prática*/
			this.ligado = true;
			//System.out.println("Carro ligado.");
			/*Com swing além de criar ele via interface e form, eu posso criar ele via codigo. Comenta a linha acima*/
			/*Apenas com uma linha ele usa uma interface gráfica. Seu visual é do próprio java!*/
			/*Se não fizer em todos os métodos, o que estiver no println vai car no console*/
		    JOptionPane.showMessageDialog(null, "Carro Ligado!");		
		} else {
			System.out.println("O carro já está ligado");
		}
		
		/*o this acessa membros da própria classe*/
		
	}
	
	public void acelerar(int velocidade) {

		if (this.ligado == true){
			/*Continuando... vamos determinar que um caro só será acelerado sem o freio puchado*/
			if(this.freio == false){
				
				/*Continuando... após inciar a variável da marcha*/
				if (this.marcha == 0){
					JOptionPane.showMessageDialog(null, "...está em ponto morto...");
				} else if (this.marcha == 1) {
					/*Embora a construção feita abaixo, ele só vai deixar acelerar se*/
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
			System.out.println("O cara não está ligado!");
		}
		
		
	}
	
	public void trocarMarcha() {
		//Encapsulando para resolver problema da O.O
		/*Aqui ele recebe ele de novo pra ir incrementando*/
		this.marcha = this.marcha + 1;
		/*System.out.println("Marcha trocada");*/
	}
}

/*pra essa classe funcionar ela tem que se tornar um objeto. Instaciando as classes... vá para a classe main*/