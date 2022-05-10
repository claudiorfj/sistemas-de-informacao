package calculadoraAula2;

import java.util.Scanner;

public class Principal {

    public void menu(double x, double y, Scanner ler) {
        int op = -1;
        ex5 calc = new ex5();

        while (op != 3) {
            System.out.println("Digite uma das opcoes:");
            System.out.println("1. Funcao A.");
            System.out.println("2. Funcao B.");
            System.out.println("3. SAIR.");

            op = ler.nextInt();
            switch (op) {
                case 1:
                    calc.funcaoa(x, y);
                    break;
                case 2:
                    calc.funcaob(x, y);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Opcao Invalida");
                    break;
            }
        }
    }

    public void run() {
        double x, y;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro nro:");
        x = ler.nextDouble();

        System.out.println("Digite o segundo nro:");
        y = ler.nextDouble();

        menu(x, y, ler);
    }

    public static void main(String[] args) {
        new Principal().run();
    }

}