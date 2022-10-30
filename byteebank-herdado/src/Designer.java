public class Designer extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do Designer");
        return 200;
    }/*Na classe mãe existem métodos abstratos. Diante disto, as classes filhas são "obrigadas" a
        implementar os métodos abstratos. */
}