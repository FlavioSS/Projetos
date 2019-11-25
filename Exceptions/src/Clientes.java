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
                "C:\\Users\\Flávio\\workspace\\Exceptions\\data\\clientes.txt"); //mudando nome do txt para teste
    }


    public void BuscarClientes() throws FileNotFoundException, SQLException {
     
        FileReader reader = null; 
        reader = new FileReader(this.getFile());

        Connection c = DriverManager.getConnection(""); 
        PreparedStatement pstm = c.prepareStatement("SELECT * FROM");        
        System.out.println("...Processada");
          
    }

    public void Salvar() throws IOException, SQLException {
    	
        FileWriter writer = null; 
        writer = new FileWriter(this.getFile());

        Connection c = DriverManager.getConnection(""); 
        PreparedStatement pstm = c.prepareStatement("SELECT * FROM");        
        System.out.println("...Salvo");
                 
    }
    //runtimer - erros em tempo de execução - tratamento
    //na parte do salvar vamos ver por que não é bom try catch dentro do método de busca
}
//8:34