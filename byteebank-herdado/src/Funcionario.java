public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario; //protect: visibilidade apenas entre classes mãe/filha

    public abstract double getBonificacao(); /* No caso de métodos abstratos, ele não tem um corpo, ou seja, não foi
    implementado. Tal método será implementado somente nas classes filhas, de forma 'obrigatória'. A não imlementação
    de um método abstrato nas classes filhas, gera erro de compilação na classe filha em questão.*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
