package verificadorIP;

import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String args[]) {
        Verificador verificador = new Verificador();
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um IP e sua mascara(Ex.: 200.110.4.115/24): ");
		String str = ler.next();
		String[] IP = new String[5];
		
		StringTokenizer st = new StringTokenizer(str,"./");  
		int i = 0;
	    while (st.hasMoreTokens()){  
	        IP[i] = st.nextToken();
	        i++;
	    }  	     
	    verificador.Conversor(IP);
        }
}