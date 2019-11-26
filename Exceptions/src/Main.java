import java.util.ArrayList;

//comentando tudo isso para a aula 3
/*public class Main {

    public static void main(String[] args)
            throws FileNotFoundException  throws FileNotFoundException  {
        System.out.println("Curso de Java!! FSS");
        
         * // apagar o  File file = new File("C:\\teste.txt"); //recebe compo parâmetro um objeto do tipo file
         * //quando instancio o file reader, posso gerar uma exceção para tratar de FileNotFound. a ide acompanha.
         * //pois ele invoca um construtor. Essa exceção é checked! //a previsão de erro existe pela possibilidade do
         * arquivo não existir (ser excluído ou renomeado) //lançado o throwns no próprio método para ignorar isso.
         * //após isso o arquivo ainda não existe, a exceção vai devidamente barrar. Como é o main ele vai executar,
         * mas vai dá o errro. FileReader reader = new FileReader(file);
         * 
         
        // resolvendo aqui
         Main m = new Main();
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

        // apagar o 
        // se estivéssemos usando banco, ao invés da persistência direto em txt, a exceção seria SQLNotFoundException
        // se for usado JDBC
         File file = new File("C:\\teste.txt");
        // recebe compo parâmetro um objeto do tipo file
        // quando instancio o file reader, posso gerar uma exceção para tratar de FileNotFound. a ide acompanha.
        // pois ele invoca um construtor. Essa exceção é checked!
        // a previsão de erro existe pela possibilidade do arquivo não existir (ser excluído ou renomeado)
        // lançado o throwns no próprio método para ignorar isso.
        // após isso o arquivo ainda não existe, a exceção vai devidamente barrar. Como é o main ele vai executar, mas
        // vai dá o errro.
         FileReader reader = new FileReader(file);

    }

}
*/
//aula 3
public class Main {

    public static void main(String[] args)
    /* throws SQLException, IOException */ {
        /*
         * COMENTANDO PARA A AULA 6 DE UNCHECKEDS // ao executar isso aqui diretamente, ele não vai executar, pois tem
         * exceção para tratar na classe clientes. Clientes clientes = new Clientes(); clientes.BuscarClientes();
         * clientes.Salvar();
         * 
         * Clientes clientes = new Clientes();
         * 
         * try { clientes.BuscarClientes(); clientes.Salvar(); } catch (FileNotFoundException e) {
         * System.out.println("!!Arquivo Não Encontrado!!"); } catch (IOException e) {
         * System.out.println("!!IOEXCEPTION!!"); } catch (SQLException e) { System.out.println("!!ERRO NO BANCO!!"); }
         */

        // UNCKECKEDS
        try {
            Calculadora calc = new Calculadora();
            System.out.println(calc.dividir(30435, 12));
            // aqui gera uma exceção unckecked que muito provavelmente só vai aparecer em tempo de execução.
            // AritmethicExcepiotn,
            // Posso tratar ou não. Mas se a regra de negócios é financeiras, e não são valores manuais,iremos tratar.
            // A depender da regra de negócio e ou lógica.
            //System.out.println(calc.dividir(30435, 0));
            System.out.println(calc.parcela(99));
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        } catch (IllegalArgumentException ie) {
            System.out.println(ie.getMessage());
        }
        
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("JAVA");
        lista.add("SQL");
        lista.add("PHP");
        lista.add("javaScript");
        lista.add("Mobile");
        //exibindo o valor do array:
        //começa na posição 0, se colocar uma posição além do que tem no array, vai dá a unchecked IndexOutBoundsException
        
        try {
            System.out.println(lista.get(5));
        } catch (IndexOutOfBoundsException ie) {
            System.out.println(ie.getMessage());
        }
        

    }

}
//5:06