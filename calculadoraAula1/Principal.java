package calculadoraAula1;

import java.util.Scanner;


public class Principal{

	public void menu(double x, double y,Scanner ler){
		int op=-1;
		ex4 calc = new ex4();//objeto da classe ex4

		while(op != 5){
		System.out.println("Digite uma das opcoes:");
		System.out.println("1. Somar");
		System.out.println("2. Subtrair");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. SAIR");
		
		op=ler.nextInt();//le opcao
		switch(op){
			case 1: calc.soma(x,y);break;
			case 2: calc.sub(x,y);break;
			case 3: calc.mul(x,y);break;
			case 4: calc.div(x,y);break;
			case 5: System.exit(0);break;
			default: System.err.println("Opcao Invalida");break;
		}
	   }
	}

	public void run(){
		double x,y;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro nro:");
		x=ler.nextDouble();

		System.out.println("Digite o segundo nro:");
		y=ler.nextDouble();

		menu(x,y,ler);
	}
	public static void main(String[] args){
		new Principal().run();
	}

}