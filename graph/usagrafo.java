//CLÁUDIO ROBERTO FERNANDES JÚNIOR

import javax.swing.JOptionPane;

public class usagrafo {

	public static void main(String[] args) {
		int aux, Opcao, procurado;
		String EntraOpcao;
		Grafo c;
		String entra;
		entra = JOptionPane.showInputDialog("Informe o numero de vertices do grafo: ");
		aux = Integer.parseInt(entra);
		c = new Grafo(aux);
		do {
			EntraOpcao = JOptionPane.showInputDialog(
					"\t Menu \n\n 1.Mostrar \n 2.Procurar Alguem \n 3.Varrer Profundidade \n 4.Varrer Largura\n\n\t9.Sair\n\n\tEscolha a opcao:");
			Opcao = Integer.parseInt(EntraOpcao);

			switch (Opcao) {
				case 1:// mostrar
					c.mostrar();

					break;

				case 2: // procurar alguem
					EntraOpcao = JOptionPane.showInputDialog("Informe o grafo");
					procurado = Integer.parseInt(EntraOpcao);
					c.buscaprofundidade();
					c.Buscar(procurado);

					break;

				case 3: // varrer profundidadde
					c.buscaprofundidade();
					c.mostrarPilhaAbertos();
					c.mostrarPilhaFechados();

					break;

				case 4: // Varrer Largura
					c.buscalargura();
					c.mostrarfilaFechados();

					break;

			}

		} while (Opcao != 9);

	}

}
