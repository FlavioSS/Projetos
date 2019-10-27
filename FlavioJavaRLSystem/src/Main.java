
public class Main {
	
	/*Quando quero que uma classe seja a classe principal*/
	/*Classe Inicial*/
	/*É a partir da classe main que todas as classe seram executadas, chamadas...*/
	public static void main (String args[]) {
		System.out.println("Hello Guy's");
		
		//Instânciar classe => Objeto
		/*nome da classe e como vai se chamar o objeto. Só com isso é só uma referência.*/
		/*Com o new ele passa a ser um objeto*/
		/*Posso chamar métodos do c4 e do ix35 na classe carro. E posso definir valores diferentes para cada um*/
		/*Sem métodos ela ainda não faz nada. Vamos definir os métodos da classe carro para nossos objetos aqui no main*/
		/*definindo e centralizando comandos em blocos de códigos. Na classe main com a classe carro.*/
		Carro c4 = new Carro(); //definindo objeto
		//chamando métodos
		/*Pela lógica de O.O eu não posso desligar (chamar primeiro o objeto desligar) pra depois ligar. Se não fica sempre true (ligado)*/
		/*Aplicando lógica na sequencia dos métodos para os objetos instanciados no main que acessam os atributos da classe carro*/
		c4.ligar();
		
		/*Além de chamar um método na minha main eu posso alterar, ex que por padrão é true. Para seguir a lógica sem quebrar a funcionalidade*/
		c4.freio = false;
		
		/*Atributos e métodos são membros de um objeto (usando o ponto)*/
		//c4.trocarMarcha();
		
		/*Resolvendo com o this problema da O.O: (na necessidade da inicialização da variável freio) Se colocar em terceira marcha direto*/
		/*Não pode iniciar a 80 nem em outra marcha acima de 1. Tem que tratar.*/
		/*c4.marcha = 1;*/ //só quem pode saber é a classe. atributo tem que ser private!!
		
		c4.trocarMarcha();
		
		c4.acelerar(/*80*/25);
		
		c4.trocarMarcha();
		
		c4.acelerar(45);
		
		c4.trocarMarcha();
		
		c4.acelerar(75);
		
		c4.desligar();

		/*CAda objeto aponta um lugar diferente em memória. Eu não posso ligar o c4 e depois desligar o ix35*/
		/*Ele vai ser tudo o que um obj da classe carro é, mas não vai ser o que c4 é*/
		Carro ix35 = new Carro();
		//ix35.desligar();
		
	}
	
}