package calculadorajv;

import javax.swing.JOptionPane;;

public class Calculadora {
	
	public static void main (String args[]) {
		
		String opcao;
		
		opcao = JOptionPane.showInputDialog("Informe a operação: \n1 - Soma;"
				+ " \n2 - Subtração; "
				+ "\n3 - Multiplicação "
				+ "\n4 - Divisão.");
		
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
			msg = "O Resultado Final é: "+resultadofinal;
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
			msg = "O resultado Final é: "+resultadofinal;
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
			msg = "O Resultado Final é: "+resultadofinal;
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
			msg = "O Resultado Final É: "+resultadofinal;
			JOptionPane.showMessageDialog(null, msg);
		}
		
	}

}
