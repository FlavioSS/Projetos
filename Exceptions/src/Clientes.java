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
                "C:\\Users\\Fl�vio\\workspace\\Exceptions\\data\\clientes.txt"); // mudando nome do txt para teste
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
    // runtimer - erros em tempo de execu��o - tratamento
    // na parte do salvar vamos ver por que n�o � bom try catch dentro do m�todo de busca

    // testando classe criando a pr�pria excess�o personalizada
    // vai retornar uma string, sem void
    public String SalvarEmail(String email) throws EmailException {
        // verificar que retorna. encontrar uma ocorr�ncia que � o @. S� como exemplo. Pra fazer verifica��o de email
        // usar express�o regular pra verificar o .com e etc;
        if (email.indexOf("@") < 1) {
            throw new EmailException("EMAIL_INVALID"); // se n�o encontrar o @ vai lan�ar uma excess�o.
        }
        return email; // a mensagem � obrigat�ria. criar outro construtor na classe da excess�o personalizada
        // fazer a chamada do cliente na Main
    }

}
//8:34