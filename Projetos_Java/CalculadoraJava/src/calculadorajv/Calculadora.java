package calculadorajv;

import javax.swing.JOptionPane;;

public class Calculadora {
	
	public static void main (String args[]) {
		
		String v1;
		String v2;
		String opcao;
		double resultadofinal;
		String msg;
		
		v1 = JOptionPane.showInputDialog("Informe o primeiro valor: ");
		
		opcao = JOptionPane.showInputDialog("Informe a opera��o: \n1 - Soma;"
				+ " \n2 - Subtra��o; "
				+ "\n3 - Multiplica��o "
				+ "\n4 - Divis�o.");
		
		int opc;
		opc = Integer.parseInt(opcao);
		
		v2 = JOptionPane.showInputDialog("Informe o segundo valor: ");
		double valor1 = Double.parseDouble(v1);
		double valor2 = Double.parseDouble(v2);
		

		
		if(opc == 1){

			resultadofinal = valor1 + valor2;
			
			msg = "O Resultado Final �: "+resultadofinal;
			JOptionPane.showMessageDialog(null, msg);
			
		}
		
		if(opc == 2){
			
			resultadofinal = valor1 - valor2;
	
			msg = "O resultado Final �: "+resultadofinal;
			JOptionPane.showMessageDialog(null, msg);
			
		}
		
		if(opc == 3){
			
			resultadofinal = valor1 * valor2;

			msg = "O Resultado Final �: "+resultadofinal;
			JOptionPane.showMessageDialog(null, msg);
			
		}
		
		if(opc == 4){
			
			resultadofinal = valor1 / valor2;

			msg = "O Resultado Final �: "+resultadofinal;
			JOptionPane.showMessageDialog(null, msg);
		}
		
	}

}
