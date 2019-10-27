
public class Main {
	
	/*Quando quero que uma classe seja a classe principal*/
	/*Classe Inicial*/
	/*� a partir da classe main que todas as classe seram executadas, chamadas...*/
	public static void main (String args[]) {
		System.out.println("Hello Guy's");
		
		//Inst�nciar classe => Objeto
		/*nome da classe e como vai se chamar o objeto. S� com isso � s� uma refer�ncia.*/
		/*Com o new ele passa a ser um objeto*/
		/*Posso chamar m�todos do c4 e do ix35 na classe carro. E posso definir valores diferentes para cada um*/
		/*Sem m�todos ela ainda n�o faz nada. Vamos definir os m�todos da classe carro para nossos objetos aqui no main*/
		/*definindo e centralizando comandos em blocos de c�digos. Na classe main com a classe carro.*/
		Carro c4 = new Carro(); //definindo objeto
		//chamando m�todos
		/*Pela l�gica de O.O eu n�o posso desligar (chamar primeiro o objeto desligar) pra depois ligar. Se n�o fica sempre true (ligado)*/
		/*Aplicando l�gica na sequencia dos m�todos para os objetos instanciados no main que acessam os atributos da classe carro*/
		c4.ligar();
		
		/*Al�m de chamar um m�todo na minha main eu posso alterar, ex que por padr�o � true. Para seguir a l�gica sem quebrar a funcionalidade*/
		c4.freio = false;
		
		/*Atributos e m�todos s�o membros de um objeto (usando o ponto)*/
		//c4.trocarMarcha();
		
		/*Resolvendo com o this problema da O.O: (na necessidade da inicializa��o da vari�vel freio) Se colocar em terceira marcha direto*/
		/*N�o pode iniciar a 80 nem em outra marcha acima de 1. Tem que tratar.*/
		/*c4.marcha = 1;*/ //s� quem pode saber � a classe. atributo tem que ser private!!
		
		c4.trocarMarcha();
		
		c4.acelerar(/*80*/25);
		
		c4.trocarMarcha();
		
		c4.acelerar(45);
		
		c4.trocarMarcha();
		
		c4.acelerar(75);
		
		c4.desligar();

		/*CAda objeto aponta um lugar diferente em mem�ria. Eu n�o posso ligar o c4 e depois desligar o ix35*/
		/*Ele vai ser tudo o que um obj da classe carro �, mas n�o vai ser o que c4 �*/
		Carro ix35 = new Carro();
		//ix35.desligar();
		
	}
	
}