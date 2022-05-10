package lifoTest;

public class Lifo {
	private Nodo topo;
	Lifo (){
		topo = null;
	}
	public void inserir (int ma, int id) {
		Nodo aux;
		aux = new Nodo(ma,id);
		aux.proximo = topo;
		topo = aux;
		}
	
	public void mostrar() {
		Nodo aux;
		if (topo == null) {
			System.out.println("LISTA VAZIA");
			return;
		}
		for (aux = topo; aux != null; aux = aux.proximo) {
			System.out.println(""+aux.matricula);
		}
	}
	
	public int retirar() {
		int aux = -999;
        if (topo != null) {
            aux = topo.matricula;
            topo = topo.proximo;
        }
        return aux;
	}
	
	public int mediaId() {
		Nodo aux = topo;
		int soma = 0; int cont = 0;
		while(aux != null) {
			soma = soma + aux.idade;
			cont++;
			aux = aux.proximo;
		}
		soma = soma / cont;
		return soma;
		}
		
	public int procurar(int procurado) {
		Nodo aux = topo;
		int busca = 0;
		while (aux != null) {
			if(aux.matricula == procurado) {
				busca = aux.idade;
				return busca;
			}
		aux = aux.proximo;
		}
		return 0;
		
	}
}