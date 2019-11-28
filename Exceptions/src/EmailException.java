//testando classe criando a própria excessão personalizada
//se for uma excessão obrigatória herda de exception, se não herda de 
//com essa classe podemos fazer outros tipos de verificações no próprio construtor!!
//mais produtividade e organização no código
public class EmailException extends Exception {

    // terceiro construtor, aqui não estou passando nenhuma mensagem, pois estou apenas relançando o construtor
    public EmailException() {
        super(); // já é o construtor
    }

    // escrevendo o construtor, reescrevendo seu método
    // @Override //não precisa de override pois já temos o próprio construtor
    // Construtor não tem void
    public EmailException(String msg) {
        super(msg); // já é o construtor
    }

    // trabalhando com a causa do erro. mais um construtor
    public EmailException(String msg, Throwable cause) {
        super(msg, cause); // já é o construtor
    }

    // ir na classe clientes gerar a excessão personalizada
}
