
public class Calc {
	 // recebe a + b
    // usar printLN dentro dos m�todos � uma m� pr�tica
    // o m�todo void s� deve ser usado se ele n�o for retornar nada
    // no caso abaixo retorna a soma
    // se eu vou enviar um dado para o BD preciso do retorno se salvou ou n�o
    // enviar um relat�rio pro adm pode ter um retorno ou n�o
    // m�todo juro n�o tem retorno, s� aplicar o juro. n�o retorna mensagem juro com sucesso
    // funciona mas t� errado usar.
    public int/* void */ Somar(int a, int b) {
        System.out.println(a + b);
        // sempre que um m�todo n�o for void ele vai ter o m�todo return
        return a + b;
    }

    public int Diminuir(int a, int b) {
        return a - b;

    }

    public String Copyright() {
        return "Feito por Fl�vio S. Sobreira";

    }

    // overloading v�rios m�todos com o mesmo nome, que fazem quase a mesma coisa, mas com par�metros diferentes.
    // o syso � um exemplo
    // chamar v�rios datatype sem ter que fazer v�rias declara��es. Como um m�todo com nome diferente pra cada coisa a
    // exibir
}
