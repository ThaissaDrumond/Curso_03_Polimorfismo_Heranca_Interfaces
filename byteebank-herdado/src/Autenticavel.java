/*Contrato Autenticavel
    quem "assinar" esse contrato precisa implementar:
        metodo setSenha
        metodo autentica
    ‘Interfaces’ definem regras
    Não aceita código "concreto", não sendo possível definir atributos ou métodos concretos. Todos os métodos devem
        ser "implementados" nas classes que utilizarm essa ‘interface’.*/
public abstract interface Autenticavel{
    //private int senha;

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

}
