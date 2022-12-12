public class Pessoa {

    String nomePessoa;
    double pesoPessoa;

    // metodo comer (recebe objeto da classe comida) e acrescenta o peso da comida à pessoa.
    void Comer(Comida c){
        if (c != null){
            this.pesoPessoa += c.pesoPrato;
        }
    }
}
