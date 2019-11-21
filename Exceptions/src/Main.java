import java.io.File;
import java.io.FileNotFoundException; //vem de java.lang.Exception
import java.io.FileReader;

public class Main {

    public static void main(String[] args)
            throws FileNotFoundException /* throws FileNotFoundException */ {
        System.out.println("Curso de Java!! FSS");
        /*
         * // apagar o final File file = new File("C:\\teste.txt"); //recebe compo par�metro um objeto do tipo file
         * //quando instancio o file reader, posso gerar uma exce��o para tratar de FileNotFound. a ide acompanha.
         * //pois ele invoca um construtor. Essa exce��o � checked! //a previs�o de erro existe pela possibilidade do
         * arquivo n�o existir (ser exclu�do ou renomeado) //lan�ado o throwns no pr�prio m�todo para ignorar isso.
         * //ap�s isso o arquivo ainda n�o existe, a exce��o vai devidamente barrar. Como � o main ele vai executar,
         * mas vai d� o errro. FileReader reader = new FileReader(file);
         * 
         */
        // resolvendo aqui
        final Main m = new Main();
        // com o throws em outro m�todo, vamos resolver aqui nesse o tratamento para o erro.
        // colocando o throws novamente o erro vai est� sendo ignorado e novamente passado para outro m�todo resolver.
        m.teste();
    }

    // testando no m�todo fora do m�todo principal
    // com throws eu t� lan�ando a exce��o pro pr�ximo que chamar ele
    // sem essa exception o erro vai d� dentro do pr�prio m�todo
    // se tratar com Exception (generic), como tamb�m a IOException ele vai lan�ar 3 ou mais exce��es diferentes, j� q
    // ela � a exce��o pai. a� vou ficar sem saber qual o erro especificamente q ele t� apontando.
    // N�o faz sentido por exemplo eu aplicar uma ClassNotFoundException, pois ela vai tratar pra uma refer�ncia de
    // classe e n�o de arquivo (file).
    // ver no java docs da oracle sobre a class do java FileNotFoundException (hierarquia). A io.File*** herda da
    // io.IO*** que herda da lang.Exception que herda de Trownable q herda de Object
    // J� a classe vem de outra hierarquia, lang.ReflectiveOperationException, Exception, Trownable, Object
    // nesse projeto vamos trabalhar sempre com as exce��es finais como uma boa pr�tica
    public void teste() throws FileNotFoundException {

        // apagar o final
        // se estiv�ssemos usando banco, ao inv�s da persist�ncia direto em txt, a exce��o seria SQLNotFoundException
        // se for usado JDBC
        final File file = new File("C:\\teste.txt");
        // recebe compo par�metro um objeto do tipo file
        // quando instancio o file reader, posso gerar uma exce��o para tratar de FileNotFound. a ide acompanha.
        // pois ele invoca um construtor. Essa exce��o � checked!
        // a previs�o de erro existe pela possibilidade do arquivo n�o existir (ser exclu�do ou renomeado)
        // lan�ado o throwns no pr�prio m�todo para ignorar isso.
        // ap�s isso o arquivo ainda n�o existe, a exce��o vai devidamente barrar. Como � o main ele vai executar, mas
        // vai d� o errro.
        final FileReader reader = new FileReader(file);

    }

}
