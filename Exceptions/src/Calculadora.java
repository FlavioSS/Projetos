
public class Calculadora {
    
    public int dividir (int x, int y) {
        return x/y;
    }
    
    public double parcela (double valorTotal) {
        
        if(valorTotal < 100) 
            //aqui o ideal seria criar sua pr�pria excess�o, 
            //o java n�o tem um m�todo pra essa a��o da parcela, mas podemos usufruir do arithmetic para a regra
            //throw new ArithmeticException("Valor Total � Inferior ao valor m�nimo requisitado!");
            //para verificar o tipo de par�metro que estou passando, posso usar o IllegalArgumentException
            //quando esse par�metro for incorreto.
            throw new IllegalArgumentException("Valor Total � Inferior ao valor m�nimo requisitado!");
            double juro = valorTotal + 1;
            
            return juro / 3;        
        
    }
    
}
