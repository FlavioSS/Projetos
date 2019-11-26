
public class Calculadora {
    
    public int dividir (int x, int y) {
        return x/y;
    }
    
    public double parcela (double valorTotal) {
        
        if(valorTotal < 100) 
            //aqui o ideal seria criar sua própria excessão, 
            //o java não tem um método pra essa ação da parcela, mas podemos usufruir do arithmetic para a regra
            //throw new ArithmeticException("Valor Total é Inferior ao valor mínimo requisitado!");
            //para verificar o tipo de parâmetro que estou passando, posso usar o IllegalArgumentException
            //quando esse parâmetro for incorreto.
            throw new IllegalArgumentException("Valor Total é Inferior ao valor mínimo requisitado!");
            double juro = valorTotal + 1;
            
            return juro / 3;        
        
    }
    
}
