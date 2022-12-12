public class Jantar {
    public static void main(String[] args) {
        // Este desafio consiste em criar três classes: Pessoa, Comida e Jantar[main]. As classes Pessoa
        // e Comida deverão receber nome e peso, para que o peso da comida seja acrescentado à pessoa quando
        // essa pessoa "comê-la".

        Comida c1 = new Comida();
        c1.nomePrato = "Tutu de Feijão";
        c1.pesoPrato = 0.300;

        Pessoa p1 = new Pessoa();
        p1.nomePessoa = "Matheus";
        p1.pesoPessoa = 75.0;

        System.out.printf("A pessoa %s pesa %f kg. \n", p1.nomePessoa, p1.pesoPessoa);

        p1.Comer(c1);

        System.out.printf("A pessoa %s pesa %f kg. \n", p1.nomePessoa, p1.pesoPessoa);

    }
}