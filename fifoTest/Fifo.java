package fifoTest;

public class Fifo{
    private Nodo fim;
    private Nodo inicio;
    private Nodo ant;
    Fifo() {
        fim = null;
        inicio = null;
    }

    public void inserir(int matri, int idade) {
        Nodo aux;
        aux = new Nodo(matri, idade);
        if (inicio == null)
            inicio = aux;
        else
            fim.vizinho = aux;
        fim = aux;
        fim.anterior = ant;
        ant = aux;
    }

    public void detonar() {
        fim = null;
        inicio = null;
        ant = null;
    }

    public void mostrar(){
        Nodo aux;
        if (inicio == null){
            System.out.println("LISTA VAZIA");
            return;
          }
            System.out.println("\nVEJA A LISTA: ");
            aux = inicio;
            while (aux != null){
                System.out.println(" "+aux.matricula);
                aux = aux.vizinho;
            }
        }

    public int retirar() {
        int aux = -999;
        if (inicio != null) {
            aux = inicio.matricula;
            inicio = inicio.vizinho;
            inicio.anterior = null;
            if (inicio == null)
                fim = null;
            ant = null;
        }
        return aux;
    }

    public boolean procurar(int quem){
        Nodo aux = inicio;
        while (aux != null){
            if (aux.matricula == quem)
                return true;
            aux = aux.vizinho;
        }
        return false;
    }

    public void inverter(){
        Nodo aux;
        if (inicio == null){
            System.out.println("LISTA VAZIA");
            return;
          }
            System.out.println("\nVEJA A LISTA: ");
            aux = fim;
            while (aux != null){
                System.out.println(" "+aux.matricula);
                aux = aux.anterior;
        }
    }

    public void maisvelho(){
        Nodo aux = inicio;
        int velho = 0;
        while (aux != null){
            if (aux.idade > velho)
                velho = aux.idade;
            aux = aux.vizinho;
        }
        System.out.println("O mais velho eh: "+velho);
    }

    public void mediaidade(){
        Nodo aux = inicio;
        int mediaidd = 0;
        int soma = 0;
        int cont = 0;
        while (aux != null){
            soma = soma + aux.idade;
            cont++;
            aux = aux.vizinho;
        }
        if (soma != 0)
            mediaidd = soma / cont;
            System.out.println("A media de idade eh: "+mediaidd);
    }

    public void cabeca(){
        if (inicio == null)
            return;
        System.out.println("O primeiro numero eh: "+inicio.matricula);
    }

    public void ultimo(){
        if (inicio == null)
            return;
        System.out.println("O ultimo numero eh:"+fim.matricula);
    }
}