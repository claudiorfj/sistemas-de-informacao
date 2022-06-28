import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int opcao = 0;
		String escolherFio;

		Metodos fios;
		fios = new Metodos();

		escolherFio = JOptionPane.showInputDialog(
				"\n\n\t Escolha um fio \n1) Azul \n2) Amarelo \n3) Vermelho \n4) Preto \n5) Verde \n6) Branco");
		opcao = Integer.parseInt(escolherFio);
		fios.Cortar(opcao);
		fios.Informa(opcao);
	}
}
