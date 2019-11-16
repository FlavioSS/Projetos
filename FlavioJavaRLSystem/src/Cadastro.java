import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Cadastro {

	private JFrame frame;
	private JTextField jTxtNome; //declara o objeto e nomeou
	private JTextField jTxtEmail;
	private JTextField jTxtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * abosolutelayout
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 222);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setBounds(10, 19, 46, 20);
		frame.getContentPane().add(lblNewLabel);
		
		jTxtNome = new JTextField();
		jTxtNome.setBounds(52, 19, 372, 20);
		frame.getContentPane().add(jTxtNome);
		jTxtNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(10, 59, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblNewLabel_1 = new JLabel("Idade: ");
		lblNewLabel_1.setBounds(10, 96, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		jTxtEmail = new JTextField(); //iniciando o objeto
		jTxtEmail.setBounds(51, 56, 373, 20); //setando atribtutos
		frame.getContentPane().add(jTxtEmail);
		jTxtEmail.setColumns(10);
		
		jTxtIdade = new JTextField();
		jTxtIdade.setBounds(52, 93, 372, 20);
		frame.getContentPane().add(jTxtIdade);
		jTxtIdade.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente cliente = new Cliente();
				cliente.setNome(jTxtNome.getText());
				cliente.setEmail(jTxtEmail.getText());
				cliente.setIdade(Integer.parseInt(jTxtIdade.getText())); //idade não quer string. converter
				//não pode pôr aqui direto. Tem que nomear os jtext
				//método salvar não pega o que tá no formulário, pega o que tá no atributo. filewriter.
				//o atributo é privado, então terá q encapsular. crio métodos para encapsular. get e set. na classe cliente
				JOptionPane.showMessageDialog(null, cliente.salvar());
				//Solução para o problema de salvar mais cadastros. No caso tirando o valor para cadastrar outro.
				jTxtNome.setText("");
				jTxtEmail.setText("");
				jTxtIdade.setText("");
			}
		});
		btnNewButton.setBounds(271, 138, 122, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
