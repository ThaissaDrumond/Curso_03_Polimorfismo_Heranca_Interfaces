
/* Composição: Evita repetição de código
 As classes que usam essa composição tem um relacionamento de um compoe o outro. Ou seja, clasee X tem a compisção Y
 A classe Y compoe a classe X */
public class Autenticador {
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
}
