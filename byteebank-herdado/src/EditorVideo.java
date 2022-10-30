public class EditorVideo extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do Editor de Video");
        return 150; /*Alterado a implementação do método, pois o mesmo método na classe
        mãe é abstrato, sendo obrigatório a implementação nas classes filhas.*/
    }
}