//import br.com.rlsystem.carros.C4; //teste

public class Main {

    /* Quando quero que uma classe seja a classe principal */
    /* Classe Inicial */
    /* É a partir da classe main que todas as classe seram executadas, chamadas... */
    public static void main(String args[]) {

        /*
         * System.out.println("Hello Guy's");
         * 
         * //Instânciar classe => Objeto //nome da classe e como vai se chamar o objeto. Só com isso é só uma
         * referência.// //Com o new ele passa a ser um objeto// //Posso chamar métodos do c4 e do ix35 na classe
         * carro. E posso definir valores diferentes para cada um// //Sem métodos ela ainda não faz nada. Vamos definir
         * os métodos da classe carro para nossos objetos aqui no main// //definindo e centralizando comandos em blocos
         * de códigos. Na classe main com a classe carro.// Carro c4 = new Carro(); //definindo objeto //chamando
         * métodos //Pela lógica de O.O eu não posso desligar (chamar primeiro o objeto desligar) pra depois ligar. Se
         * não fica sempre true (ligado)// //Aplicando lógica na sequencia dos métodos para os objetos instanciados no
         * main que acessam os atributos da classe carro// c4.ligar();
         * 
         * //Além de chamar um método na minha main eu posso alterar, ex que por padrão é true. Para seguir a lógica
         * sem quebrar a funcionalidade// c4.freio = false;
         * 
         * //Atributos e métodos são membros de um objeto (usando o ponto)// //c4.trocarMarcha();
         * 
         * //Resolvendo com o this problema da O.O: (na necessidade da inicialização da variável freio) Se colocar em
         * terceira marcha direto// //Não pode iniciar a 80 nem em outra marcha acima de 1. Tem que tratar.//
         * //c4.marcha = 1; //só quem pode saber é a classe. atributo tem que ser private!!
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
         * //CAda objeto aponta um lugar diferente em memória. Eu não posso ligar o c4 e depois desligar o ix35// //Ele
         * vai ser tudo o que um obj da classe carro é, mas não vai ser o que c4 é// Carro ix35 = new Carro();
         * //ix35.desligar();
         * 
         */

        // aula 8
        final Calc ca = new Calc();
        final int Total = /* à esquerda estou atribuindo para uma variável */ca
                .Somar(1, 10); // exemplo
        // jogando na variável se torna uma boa prática!! pq está jogando na variável e não retornando
        // na main já posso exibir
        System.out.println(10 + Total);

        /* ca.Copyright(); */ // assim vazio está chamando, mas não diz pra que vai usar
        System.out.println(ca.Copyright()); // assim pra seguir a organização do código;
        // se o sistema tiver vários idiomas, retornar o valor da soma em pt acoplado direto no syso já dá mau prática
        // o android não tem println, aí já não pode reaproveitar a classe somar
        // por isso nunca coloque syso no retorno de um método de classe, use o return e não apenas declare como void.

        /// criando uma variável
        final double valor = 100.50;

        final int valor2 = 200;

        final Integer valor3 = 200;

        final char txt = 'A';

        //// no java não existe String, e sim a classe String. Assim como Integer. (Letra maiúscula) double, int e char
        //// são tipos primitivos.
        final String nome = "Flávio";

        /// declarando array
        /// tipo do array + nome do array
        final int[] numeros = {1, 2, 3, 4};
        final String[] paises =
                {"Brasil", "EUA", "Portugal", "Argentina", "Angola"};

        /// se chamar uma string sem o array ele vai retornar o número de caracteres que tem em String nome, exemplo:
        /// nome.length();

        /// Posteriormente posso criar um for a partir de um arrray declarado e exibido. O for é um laço de repetição.
        /// loop
        /// Com uma variável auxiliar igual a 0.
        // começando da posição 0 ele vai autoincrementar mais 1 até chegar na posição 3.
        for (int i = 0; i <= 3; i++) {
            System.out.println(numeros[i]);
        }
        /// como String é uma classe, e classe tem métodos e atributoscomo o length, eu posso fazer a melhoria em i <=
        /// length vai retornar o número dos valores nesse array.
        /// o length conta 0 + 4
        for (final String paise : paises) {// <= paises.length; i++){//3; i++){
            // System.out.println(paises[i]); //comentado para testar o outro for
        }

        /// como um for each. Varrer um array. declara o tipo do array que vai ler, nome : o array que vai ler. Vai
        /// declarar cada pais à variável pais;
        for (final String pais : paises) {
            System.out.println(pais);
        }

        /// o while é usado enquanto uma coisa for verdadeira
        /// 1==1 loop infinito
        int e = 0; ///

        // muito utilizado ao buscar dados do banco
        while (e < 5) {
            System.out.println(paises[e]);
            e++; // pra não ser sempre 0
        }

        /// exibindo
        /// tem que informar a posição
        /// posição do array começa em 0
        System.out.println(numeros[2]);
        // instanciando classe ContaCorrente após construída
        final ContaCorrente c = new ContaCorrente();
        // recebe:
        c.depositar(valor);// 100);
        // c.saldo -= 50; sempre 50 e não vai funcionar a regra mesmo encapsulando
        // AULA 8
        c.sacar(50);// aqui chama o double (overloading)
        // c.sacar();// aqui chama o sem parâmetro (overloading)
        c.sacar(50, "123");// aqui chama o sem parâmetro (overloading) chamando os 2 métodos.
        // abaixo é um problema lógico, eu não posso mecher direto no saldo. Tornar atributo private encapsulado. Mas
        // também não poderei mostrar em tela.
        /* c.saldo = 5000; */
        // mostrar na tela
        /* System.out.println(c.saldo); */
        // após colocar segurança no atributo saldo e encapsular:
        // c.juro //não precisa no main, só tem utilidade na classe em que estão sendo declarado
        c.verSaldo();

        // aula 8
        // Procedimentos p = new Procedimentos(); //estanciar um objeto pra depois chamar ele, pq ele é uma classe.
        // p.Escrever("TESTE"); //chamar
        Procedimentos.Escrever("TESTE"); // aqui escrever é um método estático, já que não pode ser estanciado. escreve
                                         // mais direto. Não pertence ao objeto.
        // se estanciar após a aplica

        // C4 c = new C4(); //teste
        // c.velocidade //não vai enxergar por está protected

        /*
         * ContaPoupanca p = new ContaPoupanca(); p.depositar(100);
         * 
         * p.sacar(50); p.verSaldo();
         */
    }

}