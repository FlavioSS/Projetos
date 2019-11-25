import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//quando a ação de um método gerar uma exceção, temos que tratar essa exceção; Se o método não obrigar, não necessariamente ela não vá gerar uma exceção.
//temos a classe que o próprio java nos remete. como também podemos usar classes de exceções que nós mesmos criemos.
//quando já demos um trhows e criei um método, não faz sentido usar o tru/catch dentro desse método. Correto é na chamada .
//pq por exemplo, tenho o método teste q é chamado no main, mas no main não estaremos usando apenas o método teste.
//Não terei um try/catch pra cada ação, como um pro método cadastrar e outro pro método validar. 
//Ao invés disso teremos um único try/catch valendo para os dois no método main onde usa o cadastro e a validação.
public class ClientesOLD {

    // protect retorna file
    // organização do código. Ao invés de instanciar a classe em todos os métodos, uso aqui com um get para ambos os
    // métodos acessarem.
    // acessado apenas aqui, pois só tem esse uso.
    protected File getFile() {
        // retorna ele mesmo
        // mudar caminho a depender do workspace de outra máquina
        return new File(
                "C:\\CursoJava\\Projetos\\Exceptions\\data\\clientes.txt"); //mudando nome do txt para teste
    }

//gravar dados num txt
    // oos erros abaixo não são erros de código, e sim de exceção para tratar.
    public void BuscarClientes() {
        //para o finally
        //FileReader reader = new FileReader(this.getFile()); //declarando o objeto, abaixo vai ser instanciado.
        FileReader reader = null; //também posso iniciar a variável com NULL, apenas para inicializa-la. Pois quando ela entrar no método abaixo ela irá receber o valor.
        // File file = new File("C:\\clientes.txt");
        // coloca dentro do try tudo o q pode gerar a exceção. (o que temos)
        try {
            // leu um arquivo de texto na primeira linha, e na segunda linha está se conectando com o JDBC (conexões de
            // banco q pode gerar um SQLNotFound. Se estiver usando banco e não arquivo txt com o File). A exceção sql
            // também é unchecked
            // file e sql herdam ambos de Exception. Então eu poderia tratar direto com exception. só dificultaria
            // depois onde tá o erro.
             reader = new FileReader(this.getFile());

             Connection c = DriverManager.getConnection(""); /* null */ // vai dar nullpointer com o driver //com driver ele também vai dá o erro específico dele sql, mas vai fechar também
             //Connection c = null; //para testar o erro geral                                                               // manager tira o nullpointer
            // dessa maneira, ele vai indicar q o erro é do sql. mas, se tiver com erro no nome do arquivo, vai cair
            // antes no file.
             PreparedStatement pstm = c.prepareStatement("SELECT * FROM"); // aqui eu tenho um sqlexception para
                                                                                // tratar. O método clientes retorna 2
                                                                                // exceções agora e tratando só o
                                                                                // filenotfound não vai retornar.

            // aqui o que o catch vai tratar. (como vamos tratar).
            // se passar o mouse acima no FileReader ele vai dizer q a exceção q pode gerar é de FileNotFoundException
            // vamos fazer esse tratamento pois o arquivo ainda não existe
            System.out.println("...Processado");
           // reader.close(); //se o arquivo abriu ele tem q fechar ao final. lógica
            // acima vai processar se tiver o caminho e o arquivo espeficado no método file através do get
            // se o arquivo for renomeado no local, também irá cair na exceção na próxima vez q a ação for realizada
            // pode tratar com Exception direto também, mas se der um erro não vai saber qual o erro.
            // erro ao abrir o arquivo ou erro ao conectar ao banco?
            // mensagens customizadas mais amigáveis para o usuário também é uma boa prática
            // eu posso tratar com outro catch dentro do mesmo bloco
        } catch (FileNotFoundException /* Exception */ ex) {
            // TODO Auto-generated catch block
            // não vai trazer nada se deixar o catch vazio
            // ex.printStackTrace(); aqui é pra declarar o objeto que contêm a informação do erro. sendo assim uso syso
            // pra ter retorno
            System.out.println("ERRO no arquivo de texto! - " + ex.getMessage()); //para teste muda o nome do txt
        } catch (SQLException ex) {
            // TODO: handle exception
            System.out
                    .println("ERRO no banco de dados! - " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("ERRO geral! - " + ex.getMessage()); //bota null q vai dá o erro
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
        // FileWriter writer = new FileWriter(this.getFile()); //comentando apenas para testar o método de busca
        
        //construindo o salvar, os mesmos parametros do buscar, só mudando o tipo do file
      //para o finally
        //FileReader reader = new FileReader(this.getFile()); //declarando o objeto, abaixo vai ser instanciado.
        FileWriter writer = null; //também posso iniciar a variável com NULL, apenas para inicializa-la. Pois quando ela entrar no método abaixo ela irá receber o valor.
        // File file = new File("C:\\clientes.txt");
        // coloca dentro do try tudo o q pode gerar a exceção. (o que temos)
        try {
            // leu um arquivo de texto na primeira linha, e na segunda linha está se conectando com o JDBC (conexões de
            // banco q pode gerar um SQLNotFound. Se estiver usando banco e não arquivo txt com o File). A exceção sql
            // também é unchecked
            // file e sql herdam ambos de Exception. Então eu poderia tratar direto com exception. só dificultaria
            // depois onde tá o erro.
            writer = new FileWriter(this.getFile());

             Connection c = DriverManager.getConnection(""); /* null */ // vai dar nullpointer com o driver //com driver ele também vai dá o erro específico dele sql, mas vai fechar também
             //Connection c = null; //para testar o erro geral                                                               // manager tira o nullpointer
            // dessa maneira, ele vai indicar q o erro é do sql. mas, se tiver com erro no nome do arquivo, vai cair
            // antes no file.
             PreparedStatement pstm = c.prepareStatement("SELECT * FROM"); // aqui eu tenho um sqlexception para
                                                                                // tratar. O método clientes retorna 2
                                                                                // exceções agora e tratando só o
                                                                                // filenotfound não vai retornar.

            // aqui o que o catch vai tratar. (como vamos tratar).
            // se passar o mouse acima no FileReader ele vai dizer q a exceção q pode gerar é de FileNotFoundException
            // vamos fazer esse tratamento pois o arquivo ainda não existe
            System.out.println("...Processado");
           // reader.close(); //se o arquivo abriu ele tem q fechar ao final. lógica
            // acima vai processar se tiver o caminho e o arquivo espeficado no método file através do get
            // se o arquivo for renomeado no local, também irá cair na exceção na próxima vez q a ação for realizada
            // pode tratar com Exception direto também, mas se der um erro não vai saber qual o erro.
            // erro ao abrir o arquivo ou erro ao conectar ao banco?
            // mensagens customizadas mais amigáveis para o usuário também é uma boa prática
            // eu posso tratar com outro catch dentro do mesmo bloco
        } catch (FileNotFoundException /* Exception */ ex) {
            // TODO Auto-generated catch block
            // não vai trazer nada se deixar o catch vazio
            // ex.printStackTrace(); aqui é pra declarar o objeto que contêm a informação do erro. sendo assim uso syso
            // pra ter retorno
            System.out.println("ERRO no arquivo de texto! - " + ex.getMessage()); //para teste muda o nome do txt
        } catch (SQLException ex) {
            // TODO: handle exception
            System.out
                    .println("ERRO no banco de dados! - " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("ERRO geral! - " + ex.getMessage()); //bota null q vai dá o erro
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
    //runtimer - erros em tempo de execução - tratamento
    //na parte do salvar vamos ver por que não é bom try catch dentro do método de busca
}
