//comentando tudo isso para a aula 3
/*public class Main {

    public static void main(String[] args)
            throws FileNotFoundException  throws FileNotFoundException  {
        System.out.println("Curso de Java!! FSS");
        
         * // apagar o  File file = new File("C:\\teste.txt"); //recebe compo par�metro um objeto do tipo file
         * //quando instancio o file reader, posso gerar uma exce��o para tratar de FileNotFound. a ide acompanha.
         * //pois ele invoca um construtor. Essa exce��o � checked! //a previs�o de erro existe pela possibilidade do
         * arquivo n�o existir (ser exclu�do ou renomeado) //lan�ado o throwns no pr�prio m�todo para ignorar isso.
         * //ap�s isso o arquivo ainda n�o existe, a exce��o vai devidamente barrar. Como � o main ele vai executar,
         * mas vai d� o errro. FileReader reader = new FileReader(file);
         * 
         
        // resolvendo aqui
         Main m = new Main();
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

        // apagar o 
        // se estiv�ssemos usando banco, ao inv�s da persist�ncia direto em txt, a exce��o seria SQLNotFoundException
        // se for usado JDBC
         File file = new File("C:\\teste.txt");
        // recebe compo par�metro um objeto do tipo file
        // quando instancio o file reader, posso gerar uma exce��o para tratar de FileNotFound. a ide acompanha.
        // pois ele invoca um construtor. Essa exce��o � checked!
        // a previs�o de erro existe pela possibilidade do arquivo n�o existir (ser exclu�do ou renomeado)
        // lan�ado o throwns no pr�prio m�todo para ignorar isso.
        // ap�s isso o arquivo ainda n�o existe, a exce��o vai devidamente barrar. Como � o main ele vai executar, mas
        // vai d� o errro.
         FileReader reader = new FileReader(file);

    }

}*/

//aula 3
public class Main {

    public static void main(String[] args) {
        /*
         * // throws SQLException, IOException { /* COMENTANDO PARA A AULA 6 DE UNCHECKEDS // ao executar isso aqui
         * diretamente, ele n�o vai executar, pois tem exce��o para tratar na classe clientes. Clientes clientes = new
         * Clientes(); clientes.BuscarClientes(); clientes.Salvar();
         * 
         * Clientes clientes = new Clientes();
         * 
         * try { clientes.BuscarClientes(); clientes.Salvar(); } catch (FileNotFoundException e) {
         * System.out.println("!!Arquivo N�o Encontrado!!"); } catch (IOException e) {
         * System.out.println("!!IOEXCEPTION!!"); } catch (SQLException e) { System.out.println("!!ERRO NO BANCO!!"); }
         * 
         * 
         * // UNCKECKEDS try { Calculadora calc = new Calculadora(); System.out.println(calc.dividir(30435, 12)); //
         * aqui gera uma exce��o unckecked que muito provavelmente s� vai aparecer em tempo de execu��o. //
         * AritmethicExcepiotn, // Posso tratar ou n�o. Mas se a regra de neg�cios � financeiras, e n�o s�o valores
         * manuais,iremos tratar. // A depender da regra de neg�cio e ou l�gica.
         * //System.out.println(calc.dividir(30435, 0)); System.out.println(calc.parcela(99)); } catch
         * (ArithmeticException ae) { System.out.println(ae.getMessage()); } catch (IllegalArgumentException ie) {
         * System.out.println(ie.getMessage()); }
         * 
         * ArrayList<String> lista = new ArrayList<String>(); lista.add("JAVA"); lista.add("SQL"); lista.add("PHP");
         * lista.add("javaScript"); lista.add("Mobile"); //exibindo o valor do array: //come�a na posi��o 0, se colocar
         * uma posi��o al�m do que tem no array, vai d� a unchecked IndexOutBoundsException
         * 
         * try { System.out.println(lista.get(5)); } catch (IndexOutOfBoundsException ie) {
         * System.out.println(ie.getMessage()); } //Comentando a aula 3 para a aula 7
         */
        /*
         * //comentando para testar a thread //Aula 7.1 // NULL // sem try/catch vai d� NullPointerException //tratar
         * // N�o sou obrigado a tratar mas pode d� excess�o em tempo de execu��o try { Calculadora calc = null;
         * System.out.println(calc.dividir(20, 4)); } catch (NullPointerException ne) { //
         * System.out.println(ne.getMessage()); // acredito que o printStackTrace seja uma boa pr�tica como o return
         * para reaproveitar o c�digo ne.printStackTrace(); }
         * 
         * // serve para carregar um JAR // CHECKEDEXCEPTION, sou obrigado a tratar // biblioteca pra criar pdf no
         * java, uso ela pra carregar essa classe / biblioteca // se trabalhar com JSF vai usar o class for name pra
         * trabalhar // bibliotecas externas, se n�o tiver ela gera uma exception ao inv�s de travar tudo e sabermos q
         * � uma lib // faltando // mencionou ver depois sobre threads. Tamb�m geram excess�es // sou obrigado a tratar
         * para n�o d� erro try { Object o = Class.forName("Teste"); } catch (ClassNotFoundException e) { // TODO
         * Auto-generated catch block e.printStackTrace(); }
         */
        /*
         * //comentando a thread para testar a aula 12 MinhaThread mthread = new MinhaThread(); mthread.start();
         * //mthread.interrupt();
         * 
         */

        // criando a pr�pria excess�o
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
        // aqui eu to tratando tudo como uma excess�o obrigat�ria global, o certo � criar a pr�pria excess�o. ir na
        // classe EmailException

    }

}
//5:06