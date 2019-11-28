
public class MinhaThread extends Thread {

    // quando um m�todo, no caso o run, est� sobrescrito (utilizando override), eu n�o posso relan�ar a excess�o para
    // outro m�todo com o throws
    @Override // se o m�todo n�o existir, o override vai dar erro
    public void run() /* throws InterruptedException */ {
        for (int i = 0; i < 10; i++) {
            // a sleep gera uma excess�o checked do tipo InterruptException. Vou aplicar essa excess�o relan�ando-a
            try {
                Thread.sleep(1000);
                System.out.println("Atual: " + i); // aqui ele vai mostrar a thread q est� executando
                // mthread.interrupt();
                interrupt(); // chamando direto no m�todo
            } catch (final InterruptedException e) {
                // TODO Auto-generated catch block
                // e.printStackTrace();
                System.out.println("I: " + i); // aqui vai mostrar onde a thread parou caso d� um erro
            }
            // a trhead ficar� rodando, ele executar� e pausar� por 1s, e continua..
        }
    }
}
//fazer uma chamada no main ap�s constru�da essa classe.
//essa excess�o interrupted � utilizada quando a thread para. 
//se passar -1000 na temporiza��o do sleep ele vai d� o erro da exce��o IllegalArgumentException
