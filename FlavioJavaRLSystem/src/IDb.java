//interfaces não são classes, só possui metodos abstratos. A diferença é q a abstrata pode ter métodos abstrados, e implementados.
//na cração do cadastro de um cliente, esse cadastro nunca vai ser igual, aplicamos uma interface. Só vai ter função quando uma classe implementar ela. Uma descrição que a classe irá seguir.

public interface IDb {
	//todo método de interface é public, pois ela tem que ser implementada por alguma classe
	//sistema que utilize vários sistemas de banco (exemplo)
	//Quando toda classe tenha uma ação diferente para aquele método. Exemplo já q todo sistema se conecta de uma maneira diferente
	//interface é um pouco do conceito de herança; toda classe que tenha essas características, sigam o padrão de seu método abstrato. Embora funcionem de maneira diferente. Mas se tiver aquela interface segue aquele padrão.
	//Deve implementar todos os métodos a classe que implementar uma interface. Mas pode sobrescrever (override).
	//Uma classe abstrata pode ter métodos implementados ou não. A interface apenas métodos  não implementados.
	void conectar();
	void desconectar();
	
}
