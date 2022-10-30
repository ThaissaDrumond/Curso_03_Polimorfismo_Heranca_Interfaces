public class TesteReferencias {
    public static void main(String[] args) {

        Funcionario g = new Gerente();/*Como gerente é filho de funcionario, podemos instanciar o objeto a partir da
        classe mãe. */
        g.setNome("Marcos");
        String nome = g.getNome();
        System.out.println(nome);


        /*g.autentica(2222); -- A classe Funcionario não possui o método 'autentica'. Neste caso, instanciar um objeto
        da classe Gerente, a partir da classe Funcionário, gera erro de compilação. */


        Gerente g1 = new Gerente();
        g1.setNome("Marcia");
        g1.setSalario(5000.0);

        String nome2 = g1.getNome();

        System.out.println(nome2);
        g1.autentica(2222);
        /*Para utilizar métodos que são exclusivos de uma classe filha, é necessário instanciar o objeto a partir da
        classe filha. */
        // A possbilidade de criar objetos, de formas diferentes, também é polimorfismo

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(d);


        System.out.println(controle.getSoma());



    }
}
