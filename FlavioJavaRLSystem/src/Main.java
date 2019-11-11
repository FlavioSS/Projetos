//import br.com.rlsystem.carros.C4; //teste

public class Main {

    /* Quando quero que uma classe seja a classe principal */
    /* Classe Inicial */
    /* � a partir da classe main que todas as classe seram executadas, chamadas... */
    public static void main(String args[]) {

        /*
         * System.out.println("Hello Guy's");
         * 
         * //Inst�nciar classe => Objeto //nome da classe e como vai se chamar o objeto. S� com isso � s� uma
         * refer�ncia.// //Com o new ele passa a ser um objeto// //Posso chamar m�todos do c4 e do ix35 na classe
         * carro. E posso definir valores diferentes para cada um// //Sem m�todos ela ainda n�o faz nada. Vamos definir
         * os m�todos da classe carro para nossos objetos aqui no main// //definindo e centralizando comandos em blocos
         * de c�digos. Na classe main com a classe carro.// Carro c4 = new Carro(); //definindo objeto //chamando
         * m�todos //Pela l�gica de O.O eu n�o posso desligar (chamar primeiro o objeto desligar) pra depois ligar. Se
         * n�o fica sempre true (ligado)// //Aplicando l�gica na sequencia dos m�todos para os objetos instanciados no
         * main que acessam os atributos da classe carro// c4.ligar();
         * 
         * //Al�m de chamar um m�todo na minha main eu posso alterar, ex que por padr�o � true. Para seguir a l�gica
         * sem quebrar a funcionalidade// c4.freio = false;
         * 
         * //Atributos e m�todos s�o membros de um objeto (usando o ponto)// //c4.trocarMarcha();
         * 
         * //Resolvendo com o this problema da O.O: (na necessidade da inicializa��o da vari�vel freio) Se colocar em
         * terceira marcha direto// //N�o pode iniciar a 80 nem em outra marcha acima de 1. Tem que tratar.//
         * //c4.marcha = 1; //s� quem pode saber � a classe. atributo tem que ser private!!
         * 
         * c4.trocarMarcha();
         * 
         * c4.acelerar(25);
         * 
         * c4.trocarMarcha();
         * 
         * c4.acelerar(45);
         * 
         * c4.trocarMarcha();
         * 
         * c4.acelerar(75);
         * 
         * c4.desligar();
         * 
         * //CAda objeto aponta um lugar diferente em mem�ria. Eu n�o posso ligar o c4 e depois desligar o ix35// //Ele
         * vai ser tudo o que um obj da classe carro �, mas n�o vai ser o que c4 �// Carro ix35 = new Carro();
         * //ix35.desligar();
         * 
         */

        // aula 8
        final Calc ca = new Calc();
        final int Total = /* � esquerda estou atribuindo para uma vari�vel */ca
                .Somar(1, 10); // exemplo
        // jogando na vari�vel se torna uma boa pr�tica!! pq est� jogando na vari�vel e n�o retornando
        // na main j� posso exibir
        System.out.println(10 + Total);

        /* ca.Copyright(); */ // assim vazio est� chamando, mas n�o diz pra que vai usar
        System.out.println(ca.Copyright()); // assim pra seguir a organiza��o do c�digo;
        // se o sistema tiver v�rios idiomas, retornar o valor da soma em pt acoplado direto no syso j� d� mau pr�tica
        // o android n�o tem println, a� j� n�o pode reaproveitar a classe somar
        // por isso nunca coloque syso no retorno de um m�todo de classe, use o return e n�o apenas declare como void.

        /// criando uma vari�vel
        final double valor = 100.50;

        final int valor2 = 200;

        final Integer valor3 = 200;

        final char txt = 'A';

        //// no java n�o existe String, e sim a classe String. Assim como Integer. (Letra mai�scula) double, int e char
        //// s�o tipos primitivos.
        final String nome = "Fl�vio";

        /// declarando array
        /// tipo do array + nome do array
        final int[] numeros = {1, 2, 3, 4};
        final String[] paises =
                {"Brasil", "EUA", "Portugal", "Argentina", "Angola"};

        /// se chamar uma string sem o array ele vai retornar o n�mero de caracteres que tem em String nome, exemplo:
        /// nome.length();

        /// Posteriormente posso criar um for a partir de um arrray declarado e exibido. O for � um la�o de repeti��o.
        /// loop
        /// Com uma vari�vel auxiliar igual a 0.
        // come�ando da posi��o 0 ele vai autoincrementar mais 1 at� chegar na posi��o 3.
        for (int i = 0; i <= 3; i++) {
            System.out.println(numeros[i]);
        }
        /// como String � uma classe, e classe tem m�todos e atributoscomo o length, eu posso fazer a melhoria em i <=
        /// length vai retornar o n�mero dos valores nesse array.
        /// o length conta 0 + 4
        for (final String paise : paises) {// <= paises.length; i++){//3; i++){
            // System.out.println(paises[i]); //comentado para testar o outro for
        }

        /// como um for each. Varrer um array. declara o tipo do array que vai ler, nome : o array que vai ler. Vai
        /// declarar cada pais � vari�vel pais;
        for (final String pais : paises) {
            System.out.println(pais);
        }

        /// o while � usado enquanto uma coisa for verdadeira
        /// 1==1 loop infinito
        int e = 0; ///

        // muito utilizado ao buscar dados do banco
        while (e < 5) {
            System.out.println(paises[e]);
            e++; // pra n�o ser sempre 0
        }

        /// exibindo
        /// tem que informar a posi��o
        /// posi��o do array come�a em 0
        System.out.println(numeros[2]);
        // instanciando classe ContaCorrente ap�s constru�da
        final ContaCorrente c = new ContaCorrente();
        // recebe:
        c.depositar(valor);// 100);
        // c.saldo -= 50; sempre 50 e n�o vai funcionar a regra mesmo encapsulando
        // AULA 8
        c.sacar(50);// aqui chama o double (overloading)
        // c.sacar();// aqui chama o sem par�metro (overloading)
        c.sacar(50, "123");// aqui chama o sem par�metro (overloading) chamando os 2 m�todos.
        // abaixo � um problema l�gico, eu n�o posso mecher direto no saldo. Tornar atributo private encapsulado. Mas
        // tamb�m n�o poderei mostrar em tela.
        /* c.saldo = 5000; */
        // mostrar na tela
        /* System.out.println(c.saldo); */
        // ap�s colocar seguran�a no atributo saldo e encapsular:
        // c.juro //n�o precisa no main, s� tem utilidade na classe em que est�o sendo declarado
        c.verSaldo();

        // aula 8
        // Procedimentos p = new Procedimentos(); //estanciar um objeto pra depois chamar ele, pq ele � uma classe.
        // p.Escrever("TESTE"); //chamar
        Procedimentos.Escrever("TESTE"); // aqui escrever � um m�todo est�tico, j� que n�o pode ser estanciado. escreve
                                         // mais direto. N�o pertence ao objeto.
        // se estanciar ap�s a aplica

        // C4 c = new C4(); //teste
        // c.velocidade //n�o vai enxergar por est� protected

        /*
         * ContaPoupanca p = new ContaPoupanca(); p.depositar(100);
         * 
         * p.sacar(50); p.verSaldo();
         */
    }

}