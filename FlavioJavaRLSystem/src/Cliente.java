//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

//import javax.swing.JOptionPane;


public class Cliente {
	
	//atributo
	//boa pr�tica - todo privado
	private String nome;
	private String email;
	private int idade;
	
	//gerando m�todos get e setter para encapsular, e chamar no jbutton no cadatro.
	
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
	
	//m�todo
	//o m�todo vai entrar numa string. pois n�o � uma boa pr�tica colocar o m�todo para retornar texto (Joptionpane ou syso)
	//precisamos descrever o erro
	public /*void*/ String salvar(){
		//instanciando classe File
		File fl = new File("C:\\Users/Fl�vio/workspace/FlavioJavaRLSystem/dados/clientes.txt"); //verificar caminho
		
		//verificando se o arquivo existir
		// ! (se o arquivo n�o existir) //sem ! � se existir.
		if(!fl.exists()){
			//o java n�o consegue criar o ar	uivo, faz o try catch
			//fazer a seguran�a de um m�todo q pode d� erro por n motivos (l�gicos)
			try{
				fl.createNewFile();
				//pra finalizar:
				//classe
				//BufferedWriter writer = new BufferedWriter(new W);
				FileWriter writer = new FileWriter(fl);
				
				//se usar o append vai ter q colocar char por char dando mais trabalho
				//como vai ficar exibido. concatenando objeto
				writer.write("Nome: " + this.nome + " - Email: " + this.email + " - Idade: " + this.idade);
				writer.flush(); //para liberar mem�ria pra fechar
				writer.close();
				//writer.hashCode();
				
				
			} catch (Exception ex){
				//JOptionPane.showMessageDialog(arg0, arg1); //n�o d� pra aproveitar no android
				return "Erro no sistema. Msg: " + ex.getMessage(); //codigo reaproveit�vel para android, boa pr�tica
			}
			//at� aqui criou o arquivo.
			
		}
		return "Sucesso ao cadastrar";
		//importante � que o m�todo retorne s� uma string. sem syso e sem JO, boa pr�tica dentro deste m�todo.
	}
	//finalizada esta classe, vamos declarar a classe cliente dentro do m�todo do JButton!!


}
