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

}*/

//aula 3
public class Main {

    public static void main(String[] args) {
        /*
         * // throws SQLException, IOException { /* COMENTANDO PARA A AULA 6 DE UNCHECKEDS // ao executar isso aqui
         * diretamente, ele não vai executar, pois tem exceção para tratar na classe clientes. Clientes clientes = new
         * Clientes(); clientes.BuscarClientes(); clientes.Salvar();
         * 
         * Clientes clientes = new Clientes();
         * 
         * try { clientes.BuscarClientes(); clientes.Salvar(); } catch (FileNotFoundException e) {
         * System.out.println("!!Arquivo Não Encontrado!!"); } catch (IOException e) {
         * System.out.println("!!IOEXCEPTION!!"); } catch (SQLException e) { System.out.println("!!ERRO NO BANCO!!"); }
         * 
         * 
         * // UNCKECKEDS try { Calculadora calc = new Calculadora(); System.out.println(calc.dividir(30435, 12)); //
         * aqui gera uma exceção unckecked que muito provavelmente só vai aparecer em tempo de execução. //
         * AritmethicExcepiotn, // Posso tratar ou não. Mas se a regra de negócios é financeiras, e não são valores
         * manuais,iremos tratar. // A depender da regra de negócio e ou lógica.
         * //System.out.println(calc.dividir(30435, 0)); System.out.println(calc.parcela(99)); } catch
         * (ArithmeticException ae) { System.out.println(ae.getMessage()); } catch (IllegalArgumentException ie) {
         * System.out.println(ie.getMessage()); }
         * 
         * ArrayList<String> lista = new ArrayList<String>(); lista.add("JAVA"); lista.add("SQL"); lista.add("PHP");
         * lista.add("javaScript"); lista.add("Mobile"); //exibindo o valor do array: //começa na posição 0, se colocar
         * uma posição além do que tem no array, vai dá a unchecked IndexOutBoundsException
         * 
         * try { System.out.println(lista.get(5)); } catch (IndexOutOfBoundsException ie) {
         * System.out.println(ie.getMessage()); } //Comentando a aula 3 para a aula 7
         */
        /*
         * //comentando para testar a thread //Aula 7.1 // NULL // sem try/catch vai dá NullPointerException //tratar
         * // Não sou obrigado a tratar mas pode dá excessão em tempo de execução try { Calculadora calc = null;
         * System.out.println(calc.dividir(20, 4)); } catch (NullPointerException ne) { //
         * System.out.println(ne.getMessage()); // acredito que o printStackTrace seja uma boa prática como o return
         * para reaproveitar o código ne.printStackTrace(); }
         * 
         * // serve para carregar um JAR // CHECKEDEXCEPTION, sou obrigado a tratar // biblioteca pra criar pdf no
         * java, uso ela pra carregar essa classe / biblioteca // se trabalhar com JSF vai usar o class for name pra
         * trabalhar // bibliotecas externas, se não tiver ela gera uma exception ao invés de travar tudo e sabermos q
         * é uma lib // faltando // mencionou ver depois sobre threads. Também geram excessões // sou obrigado a tratar
         * para não dá erro try { Object o = Class.forName("Teste"); } catch (ClassNotFoundException e) { // TODO
         * Auto-generated catch block e.printStackTrace(); }
         */
        /*
         * //comentando a thread para testar a aula 12 MinhaThread mthread = new MinhaThread(); mthread.start();
         * //mthread.interrupt();
         * 
         */

        // criando a própria excessão
        // como retorna uma exception uso o try/catch
        final Clientes c = new Clientes();
        try {
            //Object o = Class.forName("Teste"); //com isso precisa fazer o tratamento
            System.out.println(c.SalvarEmail("flavius.protopaco@gmail.com")); // sem o arroba cai no catch
        } catch (final EmailException ee) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println(ee.getMessage());
        } /*
           * catch (ClassNotFoundException ce) { System.out.println(ce.getMessage()); }
           */
        // aqui eu to tratando tudo como uma excessão obrigatória global, o certo é criar a própria excessão. ir na
        // classe EmailException

    }

}
//5:06