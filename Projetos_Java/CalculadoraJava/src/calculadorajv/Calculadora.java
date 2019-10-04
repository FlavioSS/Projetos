package calculadorajv;

import javax.swing.JOptionPane;

public class Calculadora {

    static int opc;

    public static void main(String args[]) {

        String v1;
        String v2;
        String opcao;
        double resultadofinal = 0D;
        String msg;

        opcao = JOptionPane.showInputDialog(
                "Informe a operação: \n1 - Soma;" + " \n2 - Subtração; "
                        + "\n3 - Multiplicação " + "\n4 - Divisão.");

        opc = Integer.parseInt(opcao);
        v1 = JOptionPane.showInputDialog("Informe o primeiro valor: ");
        v2 = JOptionPane.showInputDialog("Informe o segundo valor: ");
        final double valor1 = Double.parseDouble(v1);
        final double valor2 = Double.parseDouble(v2);

        if (opc == 1) {
            resultadofinal = Calculadora.some(valor1, valor2);
        } else if (opc == 2) {
            resultadofinal = Calculadora.sub(valor1, valor2);
        } else if (opc == 3) {
            resultadofinal = Calculadora.multi(valor1, valor2);

        } else if (opc == 4) {
            resultadofinal = Calculadora.div(valor1, valor2);
        }

        msg = "O Resultado Final é: " + resultadofinal;
        JOptionPane.showMessageDialog(null, msg);

    }

    public static double some(double valor1, double valor2) {
        double resultar = 0D;

        resultar = valor1 + valor2;

        return resultar;
    }

    public static double sub(double valor1, double valor2) {
        double resultar = 0D;

        resultar = valor1 - valor2;

        return resultar;
    }

    public static double multi(double valor1, double valor2) {
        double resultar = 0D;

        resultar = valor1 * valor2;

        return resultar;
    }

    public static double div(double valor1, double valor2) {

        double resultar = 0D;

        resultar = valor1 / valor2;

        return resultar;

    }

}
