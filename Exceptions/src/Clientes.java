import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Clientes {

    protected File getFile() {
        return new File(
                "C:\\Users\\Flávio\\workspace\\Exceptions\\data\\clientes.txt"); // mudando nome do txt para teste
    }

    public void BuscarClientes() throws FileNotFoundException, SQLException {

        FileReader reader = null;
        reader = new FileReader(this.getFile());

        final Connection c = DriverManager.getConnection("");
        final PreparedStatement pstm = c.prepareStatement("SELECT * FROM");
        System.out.println("...Processada");

    }

    public void Salvar() throws IOException, SQLException {

        FileWriter writer = null;
        writer = new FileWriter(this.getFile());

        final Connection c = DriverManager.getConnection("");
        final PreparedStatement pstm = c.prepareStatement("SELECT * FROM");
        System.out.println("...Salvo");

    }
    // runtimer - erros em tempo de execução - tratamento
    // na parte do salvar vamos ver por que não é bom try catch dentro do método de busca

    // testando classe criando a própria excessão personalizada
    // vai retornar uma string, sem void
    public String SalvarEmail(String email) throws EmailException {
        // verificar que retorna. encontrar uma ocorrência que é o @. Só como exemplo. Pra fazer verificação de email
        // usar expressão regular pra verificar o .com e etc;
        if (email.indexOf("@") < 1) {
            throw new EmailException("EMAIL_INVALID"); // se não encontrar o @ vai lançar uma excessão.
        }
        return email; // a mensagem é obrigatória. criar outro construtor na classe da excessão personalizada
        // fazer a chamada do cliente na Main
    }

}
//8:34