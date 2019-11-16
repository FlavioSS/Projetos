//interfaces n�o s�o classes, s� possui metodos abstratos. A diferen�a � q a abstrata pode ter m�todos abstrados, e implementados.
//na cra��o do cadastro de um cliente, esse cadastro nunca vai ser igual, aplicamos uma interface. S� vai ter fun��o quando uma classe implementar ela. Uma descri��o que a classe ir� seguir.

public interface IDb {
	//todo m�todo de interface � public, pois ela tem que ser implementada por alguma classe
	//sistema que utilize v�rios sistemas de banco (exemplo)
	//Quando toda classe tenha uma a��o diferente para aquele m�todo. Exemplo j� q todo sistema se conecta de uma maneira diferente
	//interface � um pouco do conceito de heran�a; toda classe que tenha essas caracter�sticas, sigam o padr�o de seu m�todo abstrato. Embora funcionem de maneira diferente. Mas se tiver aquela interface segue aquele padr�o.
	//Deve implementar todos os m�todos a classe que implementar uma interface. Mas pode sobrescrever (override).
	//Uma classe abstrata pode ter m�todos implementados ou n�o. A interface apenas m�todos  n�o implementados.
	void conectar();
	void desconectar();
	
}
