//testando classe criando a pr�pria excess�o personalizada
//se for uma excess�o obrigat�ria herda de exception, se n�o herda de 
//com essa classe podemos fazer outros tipos de verifica��es no pr�prio construtor!!
//mais produtividade e organiza��o no c�digo
public class EmailException extends Exception {

    // terceiro construtor, aqui n�o estou passando nenhuma mensagem, pois estou apenas relan�ando o construtor
    public EmailException() {
        super(); // j� � o construtor
    }

    // escrevendo o construtor, reescrevendo seu m�todo
    // @Override //n�o precisa de override pois j� temos o pr�prio construtor
    // Construtor n�o tem void
    public EmailException(String msg) {
        super(msg); // j� � o construtor
    }

    // trabalhando com a causa do erro. mais um construtor
    public EmailException(String msg, Throwable cause) {
        super(msg, cause); // j� � o construtor
    }

    // ir na classe clientes gerar a excess�o personalizada
}
