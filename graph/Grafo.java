import javax.swing.JOptionPane;

public class Grafo {
	private int grafo[][];
	private int tamanho;
	private int pilhaAbertos[];
	private int pilhaFechados[];
	private int topoAbertos;
	private int topoFechados;
	private int filaAbertos[];
	private int filaFechados[];
	private int comecoAbertos;
	private int comecoFechados;
	private int fimAbertos;
	private int fimFechados;

	Grafo(int tam) {
		String entra;
		int i, j;
		topoAbertos = -1;
		topoFechados = -1;
		comecoAbertos = -1;
		comecoFechados = -1;
		fimAbertos = -1;
		fimFechados = -1;
		tamanho = tam;
		pilhaAbertos = new int[tamanho];
		pilhaFechados = new int[tamanho];
		filaAbertos = new int[tamanho];
		filaFechados = new int[tamanho];
		grafo = new int[tam][tam];
		for (i = 0; i < tam; i++) {
			for (j = 0; j < tam; j++) {
				if (i != j) {
					entra = JOptionPane.showInputDialog("INFORME ARESTA DE: " + i + " ATE: " + j);
					grafo[i][j] = Integer.parseInt(entra);
				} else
					grafo[i][j] = 0;
			}
		}
	}

	public void mostrar() {
		int i, j;
		System.out.println("VEJA O GRAFO:");
		for (i = 0; i < tamanho; i++) {
			for (j = 0; j < tamanho; j++) {
				System.out.print(" " + grafo[i][j]);
			}
			System.out.println();
		}
	}

	public void Buscar(int quem) {
		int aux;
		for (aux = topoFechados; aux >= 0; aux--) {
			if (quem == pilhaFechados[aux]) {
				System.out.println(" Grafo Encontrado ");
				topoFechados = -1;
				return;
			}
		}
		System.out.println(" Grafo não encontrado ");
		topoFechados = -1;
	}

	public void buscaprofundidade() {
		int x, j;
		topoAbertos++;
		pilhaAbertos[topoAbertos] = 0;
		while (topoAbertos >= 0) {
			x = pilhaAbertos[topoAbertos];
			topoAbertos--;
			for (j = 0; j < tamanho; j++) {
				if (grafo[x][j] == 1) {
					if (!(temPilhaAbertos(j))) {
						if (!(temPilhaFechados(j))) {
							topoAbertos++;
							pilhaAbertos[topoAbertos] = j;
						}
					}
				}
			}
			topoFechados++;
			pilhaFechados[topoFechados] = x;
		}
	}

	public boolean temPilhaAbertos(int quem) {
		int aux;
		for (aux = topoAbertos; aux >= 0; aux--) {
			if (pilhaAbertos[aux] == quem)
				return true;
		}
		return false;
	}

	public boolean temPilhaFechados(int quem) {
		int aux;
		for (aux = topoFechados; aux >= 0; aux--) {
			if (pilhaFechados[aux] == quem)
				return true;
		}
		return false;
	}

	public void mostrarPilhaFechados() {
		int aux;
		System.out.print("\nVeja a pilha fechados: ");
		for (aux = topoFechados; aux >= 0; aux--)
			System.out.print(" " + pilhaFechados[aux]);
		topoFechados = -1;
	}

	public void mostrarPilhaAbertos() {
		int aux;
		System.out.print("\nVeja a pilha abertos: ");
		for (aux = topoAbertos; aux >= 0; aux--)
			System.out.print(" " + pilhaAbertos[aux]);
	}

	public void buscalargura() {
		int x, j;
		fimAbertos++;
		filaAbertos[fimAbertos] = 0;
		while (comecoAbertos != fimAbertos) {
			x = filaAbertos[fimAbertos];
			fimAbertos--;
			for (j = 0; j < tamanho; j++) {
				if (grafo[x][j] == 1) {
					if (!(temfilaAbertos(j))) {
						if (!(temfilaFechados(j))) {
							fimAbertos++;
							filaAbertos[fimAbertos] = j;
						}
					}
				}
			}
			fimFechados++;
			filaFechados[fimFechados] = x;
		}

	}

	public boolean temfilaAbertos(int quem) {
		int aux;
		for (aux = fimAbertos; aux >= 0; aux--) {
			if (filaAbertos[aux] == quem)
				return true;
		}
		return false;
	}

	public boolean temfilaFechados(int quem) {
		int aux;
		for (aux = fimFechados; aux >= 0; aux--) {
			if (filaFechados[aux] == quem)
				return true;
		}
		return false;
	}

	public void mostrarfilaFechados() {
		int aux = comecoFechados;
		System.out.print("\nVeja a fila fechados: ");

		while (aux != fimFechados) {
			aux = (aux + 1) % filaFechados.length;
			System.out.print(" " + filaFechados[aux]);
		}
		fimFechados = -1;
	}

}
