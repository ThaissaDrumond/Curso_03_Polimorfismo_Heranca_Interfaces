//Gerente é um Funcionário, Gerente herda da classe Funcionário

public class Gerente extends Funcionario{
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
    public double getBonificacao() {/* Polimorfismo: "public double getBonificacao()" é a assinatura do método. Quando
    a assinatura do método de uma classe filha é a mesma que a da classe mãe, alterando apenas o comportamento do
    método(bloco de execução), chamamos de reescrita(tambbém pode-se chamar de Subtipo, sobrescrita ou sobreposição).*/
        System.out.println("Chamando o método bonificacao do GERENTE");
        return super.getSalario(); /* Neste caso, não se usa o 'this', pois esta palavra
        reservada é referente a atributos definidos dentro da própria classe. Como este atributo não foi definido nesta
        classe, mas sim na classe mãe, usamos a palavra reservada 'super', referente a "superclasse". Assim, sabemos que
        será necessário subir na herarquia para encontrar o atributo.
            Alterado a implementação do método, pois o mesmo método na classe mãe é abstrato, sendo obrigatório a
        implementação nas classes filhas.*/
    }/* Outra forma de polimorfismo é a sobrecarga. Na sobrecarga, mantém-se a assinatura e o bloco de excução iguais
    nas classes mãe e filha, alterando os parametros).*/
}
