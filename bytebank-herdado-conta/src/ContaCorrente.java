public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    } /* Na classe mãe(Conta) existe um construtor específico. Porém, construtores não são hherdados, pois cada
    construtor pertence somente a sua própria classe. Com isto, o construtoor da classe conta não é automaticamente
    disponível para as cllasses filhas, sendo necessário escrever na classe filha o próprio construtor.
        O construtor 'super()' tenta chamar o construtor padrão. Como a classe mãe tem um contrutor específico, este
    construtor 'super()' não compila nesta classe, sendo necessario a definição dos parametros conforme o construtor
    da classe mãe      */

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}