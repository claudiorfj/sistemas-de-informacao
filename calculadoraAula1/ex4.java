package calculadoraAula1;

public class ex4 {
	public ex4(){}
	
	public void soma (double n1, double n2){
		double resultado = n1+n2;
		System.out.println("Soma: "+resultado);
	}
	public void sub (double n1, double n2){
		double resultado = n1-n2;
		System.out.println("Subtracao: "+resultado);
	}
	public void mul (double n1, double n2){
		double resultado = n1*n2;
		System.out.println("Multiplicacao: "+resultado);
	}
	public void div (double n1, double n2){
		if(n2 != 0){
			double resultado = n1/n2;
			System.out.println("Soma: "+resultado);
		}else
			System.err.println("Divisao por 0!");
	}

	
}