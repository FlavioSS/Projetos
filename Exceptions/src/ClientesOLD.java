import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//quando a a��o de um m�todo gerar uma exce��o, temos que tratar essa exce��o; Se o m�todo n�o obrigar, n�o necessariamente ela n�o v� gerar uma exce��o.
//temos a classe que o pr�prio java nos remete. como tamb�m podemos usar classes de exce��es que n�s mesmos criemos.
//quando j� demos um trhows e criei um m�todo, n�o faz sentido usar o tru/catch dentro desse m�todo. Correto � na chamada .
//pq por exemplo, tenho o m�todo teste q � chamado no main, mas no main n�o estaremos usando apenas o m�todo teste.
//N�o terei um try/catch pra cada a��o, como um pro m�todo cadastrar e outro pro m�todo validar. 
//Ao inv�s disso teremos um �nico try/catch valendo para os dois no m�todo main onde usa o cadastro e a valida��o.
public class ClientesOLD {

    // protect retorna file
    // organiza��o do c�digo. Ao inv�s de instanciar a classe em todos os m�todos, uso aqui com um get para ambos os
    // m�todos acessarem.
    // acessado apenas aqui, pois s� tem esse uso.
    protected File getFile() {
        // retorna ele mesmo
        // mudar caminho a depender do workspace de outra m�quina
        return new File(
                "C:\\CursoJava\\Projetos\\Exceptions\\data\\clientes.txt"); //mudando nome do txt para teste
    }

//gravar dados num txt
    // oos erros abaixo n�o s�o erros de c�digo, e sim de exce��o para tratar.
    public void BuscarClientes() {
        //para o finally
        //FileReader reader = new FileReader(this.getFile()); //declarando o objeto, abaixo vai ser instanciado.
        FileReader reader = null; //tamb�m posso iniciar a vari�vel com NULL, apenas para inicializa-la. Pois quando ela entrar no m�todo abaixo ela ir� receber o valor.
        // File file = new File("C:\\clientes.txt");
        // coloca dentro do try tudo o q pode gerar a exce��o. (o que temos)
        try {
            // leu um arquivo de texto na primeira linha, e na segunda linha est� se conectando com o JDBC (conex�es de
            // banco q pode gerar um SQLNotFound. Se estiver usando banco e n�o arquivo txt com o File). A exce��o sql
            // tamb�m � unchecked
            // file e sql herdam ambos de Exception. Ent�o eu poderia tratar direto com exception. s� dificultaria
            // depois onde t� o erro.
             reader = new FileReader(this.getFile());

             Connection c = DriverManager.getConnection(""); /* null */ // vai dar nullpointer com o driver //com driver ele tamb�m vai d� o erro espec�fico dele sql, mas vai fechar tamb�m
             //Connection c = null; //para testar o erro geral                                                               // manager tira o nullpointer
            // dessa maneira, ele vai indicar q o erro � do sql. mas, se tiver com erro no nome do arquivo, vai cair
            // antes no file.
             PreparedStatement pstm = c.prepareStatement("SELECT * FROM"); // aqui eu tenho um sqlexception para
                                                                                // tratar. O m�todo clientes retorna 2
                                                                                // exce��es agora e tratando s� o
                                                                                // filenotfound n�o vai retornar.

            // aqui o que o catch vai tratar. (como vamos tratar).
            // se passar o mouse acima no FileReader ele vai dizer q a exce��o q pode gerar � de FileNotFoundException
            // vamos fazer esse tratamento pois o arquivo ainda n�o existe
            System.out.println("...Processado");
           // reader.close(); //se o arquivo abriu ele tem q fechar ao final. l�gica
            // acima vai processar se tiver o caminho e o arquivo espeficado no m�todo file atrav�s do get
            // se o arquivo for renomeado no local, tamb�m ir� cair na exce��o na pr�xima vez q a a��o for realizada
            // pode tratar com Exception direto tamb�m, mas se der um erro n�o vai saber qual o erro.
            // erro ao abrir o arquivo ou erro ao conectar ao banco?
            // mensagens customizadas mais amig�veis para o usu�rio tamb�m � uma boa pr�tica
            // eu posso tratar com outro catch dentro do mesmo bloco
        } catch (FileNotFoundException /* Exception */ ex) {
            // TODO Auto-generated catch block
            // n�o vai trazer nada se deixar o catch vazio
            // ex.printStackTrace(); aqui � pra declarar o objeto que cont�m a informa��o do erro. sendo assim uso syso
            // pra ter retorno
            System.out.println("ERRO no arquivo de texto! - " + ex.getMessage()); //para teste muda o nome do txt
        } catch (SQLException ex) {
            // TODO: handle exception
            System.out
                    .println("ERRO no banco de dados! - " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("ERRO geral! - " + ex.getMessage()); //bota null q vai d� o erro
        } finally {
            //o finally vai ser sempre executado
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    System.out.println("ERRO no arquivo de texto! - " + ex.getMessage());
                } finally {
                    System.out.println("FECHOU O ARQUIVO");
                }
                
            }
            
        }
    }

    public void Salvar() {
        // File file = new File("C:\\clientes.txt");
        // FileWriter writer = new FileWriter(this.getFile()); //comentando apenas para testar o m�todo de busca
        
        //construindo o salvar, os mesmos parametros do buscar, s� mudando o tipo do file
      //para o finally
        //FileReader reader = new FileReader(this.getFile()); //declarando o objeto, abaixo vai ser instanciado.
        FileWriter writer = null; //tamb�m posso iniciar a vari�vel com NULL, apenas para inicializa-la. Pois quando ela entrar no m�todo abaixo ela ir� receber o valor.
        // File file = new File("C:\\clientes.txt");
        // coloca dentro do try tudo o q pode gerar a exce��o. (o que temos)
        try {
            // leu um arquivo de texto na primeira linha, e na segunda linha est� se conectando com o JDBC (conex�es de
            // banco q pode gerar um SQLNotFound. Se estiver usando banco e n�o arquivo txt com o File). A exce��o sql
            // tamb�m � unchecked
            // file e sql herdam ambos de Exception. Ent�o eu poderia tratar direto com exception. s� dificultaria
            // depois onde t� o erro.
            writer = new FileWriter(this.getFile());

             Connection c = DriverManager.getConnection(""); /* null */ // vai dar nullpointer com o driver //com driver ele tamb�m vai d� o erro espec�fico dele sql, mas vai fechar tamb�m
             //Connection c = null; //para testar o erro geral                                                               // manager tira o nullpointer
            // dessa maneira, ele vai indicar q o erro � do sql. mas, se tiver com erro no nome do arquivo, vai cair
            // antes no file.
             PreparedStatement pstm = c.prepareStatement("SELECT * FROM"); // aqui eu tenho um sqlexception para
                                                                                // tratar. O m�todo clientes retorna 2
                                                                                // exce��es agora e tratando s� o
                                                                                // filenotfound n�o vai retornar.

            // aqui o que o catch vai tratar. (como vamos tratar).
            // se passar o mouse acima no FileReader ele vai dizer q a exce��o q pode gerar � de FileNotFoundException
            // vamos fazer esse tratamento pois o arquivo ainda n�o existe
            System.out.println("...Processado");
           // reader.close(); //se o arquivo abriu ele tem q fechar ao final. l�gica
            // acima vai processar se tiver o caminho e o arquivo espeficado no m�todo file atrav�s do get
            // se o arquivo for renomeado no local, tamb�m ir� cair na exce��o na pr�xima vez q a a��o for realizada
            // pode tratar com Exception direto tamb�m, mas se der um erro n�o vai saber qual o erro.
            // erro ao abrir o arquivo ou erro ao conectar ao banco?
            // mensagens customizadas mais amig�veis para o usu�rio tamb�m � uma boa pr�tica
            // eu posso tratar com outro catch dentro do mesmo bloco
        } catch (FileNotFoundException /* Exception */ ex) {
            // TODO Auto-generated catch block
            // n�o vai trazer nada se deixar o catch vazio
            // ex.printStackTrace(); aqui � pra declarar o objeto que cont�m a informa��o do erro. sendo assim uso syso
            // pra ter retorno
            System.out.println("ERRO no arquivo de texto! - " + ex.getMessage()); //para teste muda o nome do txt
        } catch (SQLException ex) {
            // TODO: handle exception
            System.out
                    .println("ERRO no banco de dados! - " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("ERRO geral! - " + ex.getMessage()); //bota null q vai d� o erro
        } finally {
            //o finally vai ser sempre executado
            if(writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("ERRO no arquivo de texto! - " + ex.getMessage());
                } finally {
                    System.out.println("FECHOU O ARQUIVO");
                }
                
            }
            
        }

        
    }
    //runtimer - erros em tempo de execu��o - tratamento
    //na parte do salvar vamos ver por que n�o � bom try catch dentro do m�todo de busca
}
