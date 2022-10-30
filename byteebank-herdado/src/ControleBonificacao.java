public class ControleBonificacao {
    private double soma;

    public void registra(Funcionario f) { /* referencia 'generica' que aponta para todos os objetos que estejam dentro
    da hierarquia */
        double boni = f.getBonificacao();
        this.soma += boni;
    }

    public double getSoma() {
        return soma;
    }
}
