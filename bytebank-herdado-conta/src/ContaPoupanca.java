public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    } /* Na classe mãe(Conta) existe um construtor específico. Porém, construtores não são hherdados, pois cada
    construtor pertence somente a sua própria classe. Com isto, o construtoor da classe conta não é automaticamente
    disponível para as cllasses filhas, sendo necessário escrever na classe filha o próprio construtor.
        O construtor 'super()' tenta chamar o construtor padrão. Como a classe mãe tem um contrutor específico, este
    construtor 'super()' não compila nesta classe, sendo necessario a definição dos parametros conforme o construtor
    da classe mãe      */

}