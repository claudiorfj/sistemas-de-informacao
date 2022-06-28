import java.util.Random;

import javax.swing.JOptionPane;

public class Metodos {
	private int perdeu;
	private int mostrar;
	private int proxNivel;
	private int fio;
	private int venceu;

	public void Cortar(int Opcao) {
		int aux = 1;
		String Final;

		Random aleatorio = new Random();
		fio = aleatorio.nextInt(12) + 1;
		System.out.println("Numero: " + fio);

		try {
			if (fio % 2 > 0) {
				proxNivel++;
				System.out.println("Cortou o fio certo");
				System.out.println("Voce avancou de nivel");
			}

			else if (fio % 2 == 0) {
				if (aux % 0 == 1) {
				}
			}
		} catch (Exception e) {
			perdeu++;
			System.out.println("Cortou o fio errado");
			System.out.println("Voce perdeu");
		}

		if (proxNivel == 1) {
			System.out.println("Escolha novamente um fio");

			Final = JOptionPane.showInputDialog(
					"\n\t Nivel final \n1) Azul \n2) Amarelo \n3) Vermelho \n4) Preto \n5) Verde \n6) Branco");
			Integer.parseInt(Final);

			Random aleatorioB = new Random();
			fio = aleatorioB.nextInt(12) + 1;

			System.out.println("Numero: " + fio);

			try {
				if (fio % 2 > 0) {
					venceu++;
					mostrar++;
					System.out.println("Cortou o fio certo");
				}

				else if (fio % 2 == 0) {
					if (aux % 0 == 1) {
					}
				}
			} catch (Exception e) {
				perdeu++;
				System.out.println("Cortou o fio errado");
			}

		}
	}

	public void Informa(int Opcao) {
		if (Opcao == 1)
			System.out.println("O primeiro fio cortado foi o azul");

		if (Opcao == 2)
			System.out.println("O primeiro fio cortado foi o amarelo");

		if (Opcao == 3)
			System.out.println("O primeiro fio cortado foi o vermelho");

		if (Opcao == 4)
			System.out.println("O primeiro fio cortado foi o preto");

		if (Opcao == 5)
			System.out.println("O primeiro fio cortado foi o verde");

		if (Opcao == 6)
			System.out.println("O primeiro fio cortado foi o branco");

		try {
			if (mostrar % 0 == 1) {
			}
		} catch (Exception e2) {
			if (proxNivel == 1) {

				if (Opcao == 1)
					System.out.println("O segundo fio cortado foi o azul");

				if (Opcao == 2)
					System.out.println("O segundo fio cortado foi o amarelo");

				if (Opcao == 3)
					System.out.println("O segundo fio cortado foi o vermelho");

				if (Opcao == 4)
					System.out.println("O segundo fio cortado foi o preto");

				if (Opcao == 5)
					System.out.println("O segundo fio cortado foi o verde");

				if (Opcao == 6)
					System.out.println("O segundo fio cortado foi o branco");
			}
		}

		if (venceu == 1) {
			System.out.println("Voce venceu");
		}

		if (perdeu == 1) {
			System.out.println("Voce perdeu");
		}

	}
}
