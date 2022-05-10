package fifoTest;

public class Nodo {
    public int matricula;
    public int idade;
    public Nodo vizinho;
    public Nodo anterior;

    Nodo(int mtr, int idd){
        matricula = mtr;
        idade = idd;
        vizinho = null;
        anterior = null;
    }
}