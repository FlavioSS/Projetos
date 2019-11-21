import java.io.File;
import java.io.FileNotFoundException; //vem de java.lang.Exception
import java.io.FileReader;

public class Main {

    public static void main(String[] args)
            throws FileNotFoundException /* throws FileNotFoundException */ {
        System.out.println("Curso de Java!! FSS");
        /*
         * // apagar o final File file = new File("C:\\teste.txt"); //recebe compo parâmetro um objeto do tipo file
         * //quando instancio o file reader, posso gerar uma exceção para tratar de FileNotFound. a ide acompanha.
         * //pois ele invoca um construtor. Essa exceção é checked! //a previsão de erro existe pela possibilidade do
         * arquivo não existir (ser excluído ou renomeado) //lançado o throwns no próprio método para ignorar isso.
         * //após isso o arquivo ainda não existe, a exceção vai devidamente barrar. Como é o main ele vai executar,
         * mas vai dá o errro. FileReader reader = new FileReader(file);
         * 
         */
        // resolvendo aqui
        final Main m = new Main();
        // com o throws em outro método, vamos resolver aqui nesse o tratamento para o erro.
        // colocando o throws novamente o erro vai está sendo ignorado e novamente passado para outro método resolver.
        m.teste();
    }

    // testando no método fora do método principal
    // com throws eu tô lançando a exceção pro próximo que chamar ele
    // sem essa exception o erro vai dá dentro do próprio método
    // se tratar com Exception (generic), como também a IOException ele vai lançar 3 ou mais exceções diferentes, já q
    // ela é a exceção pai. aí vou ficar sem saber qual o erro especificamente q ele tá apontando.
    // Não faz sentido por exemplo eu aplicar uma ClassNotFoundException, pois ela vai tratar pra uma referência de
    // classe e não de arquivo (file).
    // ver no java docs da oracle sobre a class do java FileNotFoundException (hierarquia). A io.File*** herda da
    // io.IO*** que herda da lang.Exception que herda de Trownable q herda de Object
    // Já a classe vem de outra hierarquia, lang.ReflectiveOperationException, Exception, Trownable, Object
    // nesse projeto vamos trabalhar sempre com as exceções finais como uma boa prática
    public void teste() throws FileNotFoundException {

        // apagar o final
        // se estivéssemos usando banco, ao invés da persistência direto em txt, a exceção seria SQLNotFoundException
        // se for usado JDBC
        final File file = new File("C:\\teste.txt");
        // recebe compo parâmetro um objeto do tipo file
        // quando instancio o file reader, posso gerar uma exceção para tratar de FileNotFound. a ide acompanha.
        // pois ele invoca um construtor. Essa exceção é checked!
        // a previsão de erro existe pela possibilidade do arquivo não existir (ser excluído ou renomeado)
        // lançado o throwns no próprio método para ignorar isso.
        // após isso o arquivo ainda não existe, a exceção vai devidamente barrar. Como é o main ele vai executar, mas
        // vai dá o errro.
        final FileReader reader = new FileReader(file);

    }

}
