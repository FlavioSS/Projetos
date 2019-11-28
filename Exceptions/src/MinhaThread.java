
public class MinhaThread extends Thread {

    // quando um método, no caso o run, está sobrescrito (utilizando override), eu não posso relançar a excessão para
    // outro método com o throws
    @Override // se o método não existir, o override vai dar erro
    public void run() /* throws InterruptedException */ {
        for (int i = 0; i < 10; i++) {
            // a sleep gera uma excessão checked do tipo InterruptException. Vou aplicar essa excessão relançando-a
            try {
                Thread.sleep(1000);
                System.out.println("Atual: " + i); // aqui ele vai mostrar a thread q está executando
                // mthread.interrupt();
                interrupt(); // chamando direto no método
            } catch (final InterruptedException e) {
                // TODO Auto-generated catch block
                // e.printStackTrace();
                System.out.println("I: " + i); // aqui vai mostrar onde a thread parou caso dê um erro
            }
            // a trhead ficará rodando, ele executará e pausará por 1s, e continua..
        }
    }
}
//fazer uma chamada no main após construída essa classe.
//essa excessão interrupted é utilizada quando a thread para. 
//se passar -1000 na temporização do sleep ele vai dá o erro da exceção IllegalArgumentException
