package calculadorajv;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String args[]) {

        String v1;
        String v2;
        String opcao;
        double resultadofinal = 0D;
        String msg;

        opcao = JOptionPane.showInputDialog(
                "Informe a operação: \n1 - Soma;" + " \n2 - Subtração; "
                        + "\n3 - Multiplicação " + "\n4 - Divisão.");

        int opc;
        opc = Integer.parseInt(opcao);
        v1 = JOptionPane.showInputDialog("Informe o primeiro valor: ");
        v2 = JOptionPane.showInputDialog("Informe o segundo valor: ");
        final double valor1 = Double.parseDouble(v1);
        final double valor2 = Double.parseDouble(v2);

        if (opc == 1) {
            resultadofinal = valor1 + valor2;
        } else if (opc == 2) {
            resultadofinal = valor1 - valor2;
        } else if (opc == 3) {
            resultadofinal = valor1 * valor2;
        } else if (opc == 4) {
            resultadofinal = valor1 / valor2;
        }

        msg = "O Resultado Final é: " + resultadofinal;
        JOptionPane.showMessageDialog(null, msg);

    }
    


    	public double add(double valor1, double valor2) {

    		return valor1 + valor2;

    	}

    	public double sub(double valor1, double valor2) {

    		return valor1 - valor2;

    	}

    	public double multi(double valor1, double valor2) {

    		return valor1 * valor2;

    	}

    	public double div(double valor1, double valor2) {

    		return valor1 / valor2;

    	}

}
