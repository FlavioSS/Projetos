package calculadorajv;

import javax.swing.JOptionPane;;

public class Calculadora {
	
	public static void main (String args[]) {
		
		String opcao;
		
		opcao = JOptionPane.showInputDialog("Informe a opera��o: \n1 - Soma;"
				+ " \n2 - Subtra��o; "
				+ "\n3 - Multiplica��o "
				+ "\n4 - Divis�o.");
		
		int opc;
		opc = Integer.parseInt(opcao);
		
		if(opc == 1){
			String v1;
			String v2;
			v1 = JOptionPane.showInputDialog("Informe o primeiro valor: ");
			v2 = JOptionPane.showInputDialog("Informe o segundo valor: ");
			
			double valor1 = Double.parseDouble(v1);
			double valor2 = Double.parseDouble(v2);
			
			double resultadofinal = valor1 + valor2;
			String msg;
			msg = "O Resultado Final �: "+resultadofinal;
			JOptionPane.showMessageDialog(null, msg);
			
		}
		
		if(opc == 2){
			String v1;
			String v2;
			v1 = JOptionPane.showInputDialog("Informe o primeiro valor: ");
			v2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
			
			double valor1 = Double.parseDouble(v1);
			double valor2 = Double.parseDouble(v2);
			
			double resultadofinal = valor1 - valor2;
			String msg;
			msg = "O resultado Final �: "+resultadofinal;
			JOptionPane.showMessageDialog(null, msg);
			
		}
		
		if(opc == 3){
			String v1;
			String v2;
			v1 = JOptionPane.showInputDialog("Informe o primeiro valor: ");
			v2 = JOptionPane.showInputDialog("Informe o segundo valor: ");
			
			double valor1 = Double.parseDouble(v1);
			double valor2 = Double.parseDouble(v2);
			
			double resultadofinal = valor1 * valor2;
			String msg;
			msg = "O Resultado Final �: "+resultadofinal;
			JOptionPane.showMessageDialog(null, msg);
			
		}
		
		if(opc == 4){
			String v1;
			String v2;
			v1 = JOptionPane.showInputDialog("Informe o primeiro valor: ");
			v2 = JOptionPane.showInputDialog("Informe o segundo valor: ");
			
			double valor1 = Double.parseDouble(v1);
			double valor2 = Double.parseDouble(v2);
			
			double resultadofinal = valor1 / valor2;
			
			String msg;
			msg = "O Resultado Final �: "+resultadofinal;
			JOptionPane.showMessageDialog(null, msg);
		}
		
	}

}
