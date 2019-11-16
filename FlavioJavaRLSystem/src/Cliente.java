//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

//import javax.swing.JOptionPane;


public class Cliente {
	
	//atributo
	//boa prática - todo privado
	private String nome;
	private String email;
	private int idade;
	
	//gerando métodos get e setter para encapsular, e chamar no jbutton no cadatro.
	
	//pegando o objeto
	public String getNome() {
		return nome;
	}

	//setando um valor para o objeto
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}	
	
	//método
	//o método vai entrar numa string. pois não é uma boa prática colocar o método para retornar texto (Joptionpane ou syso)
	//precisamos descrever o erro
	public /*void*/ String salvar(){
		//instanciando classe File
		File fl = new File("C:\\Users/Flávio/workspace/FlavioJavaRLSystem/dados/clientes.txt"); //verificar caminho
		
		//verificando se o arquivo existir
		// ! (se o arquivo não existir) //sem ! é se existir.
		if(!fl.exists()){
			//o java não consegue criar o ar	uivo, faz o try catch
			//fazer a segurança de um método q pode dá erro por n motivos (lógicos)
			try{
				fl.createNewFile();
				//pra finalizar:
				//classe
				//BufferedWriter writer = new BufferedWriter(new W);
				FileWriter writer = new FileWriter(fl);
				
				//se usar o append vai ter q colocar char por char dando mais trabalho
				//como vai ficar exibido. concatenando objeto
				writer.write("Nome: " + this.nome + " - Email: " + this.email + " - Idade: " + this.idade);
				writer.flush(); //para liberar memória pra fechar
				writer.close();
				//writer.hashCode();
				
				
			} catch (Exception ex){
				//JOptionPane.showMessageDialog(arg0, arg1); //não dá pra aproveitar no android
				return "Erro no sistema. Msg: " + ex.getMessage(); //codigo reaproveitável para android, boa prática
			}
			//até aqui criou o arquivo.
			
		}
		return "Sucesso ao cadastrar";
		//importante é que o método retorne só uma string. sem syso e sem JO, boa prática dentro deste método.
	}
	//finalizada esta classe, vamos declarar a classe cliente dentro do método do JButton!!


}
