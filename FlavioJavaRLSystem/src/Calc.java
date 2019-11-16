
public class Calc {
	 // recebe a + b
    // usar printLN dentro dos métodos é uma má prática
    // o método void só deve ser usado se ele não for retornar nada
    // no caso abaixo retorna a soma
    // se eu vou enviar um dado para o BD preciso do retorno se salvou ou não
    // enviar um relatório pro adm pode ter um retorno ou não
    // método juro não tem retorno, só aplicar o juro. não retorna mensagem juro com sucesso
    // funciona mas tá errado usar.
    public int/* void */ Somar(int a, int b) {
        System.out.println(a + b);
        // sempre que um método não for void ele vai ter o método return
        return a + b;
    }

    public int Diminuir(int a, int b) {
        return a - b;

    }

    public String Copyright() {
        return "Feito por Flávio S. Sobreira";

    }

    // overloading vários métodos com o mesmo nome, que fazem quase a mesma coisa, mas com parâmetros diferentes.
    // o syso é um exemplo
    // chamar vários datatype sem ter que fazer várias declarações. Como um método com nome diferente pra cada coisa a
    // exibir
}
