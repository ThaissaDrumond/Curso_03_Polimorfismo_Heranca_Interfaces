/* A palavra 'abstract' está sempre relacionada com herança. Essa classe passa a ser apenas um 'conceito', não é algo
concreto e por isto não é possível instanciar essa classe
    Abstração está relacionada a herança, mas é diferente de herança. Na classe, signiffica que não será possível
instanciar nenhum objeto daquele tipo, enquanto no método, indica que ele não tem implementação, e o filho concreto
precisará implementa-lo.*/
public class TesteFuncionario {
    public static void main(String[] args) {

        /*"Funcionario nico = new Funcionario();" O 'new' indica a criação de algo 'concreto', como a classe
        'Funcionario' é abstrata, corre erro de compilação */
        Funcionario nico = new Gerente(); /*Instanciar a partir da classe funcionario é possível, pois o conceito
        abstrato existe, porém não é possível criar um objeto do tipo da classe abstrata(objeto do tipo Funcionario).
            Neste caso, temos um filho concreto(Gerente) de uma superclasse abstrata(Funcionario)*/
        nico.setNome("Nico Steppat");
        nico.setCpf("223355646-9");
        nico.setSalario(2600.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

    }
}
