import javax.swing.JOptionPane;


public class grafo2 {
	private static int grafo[][][];

	public static void main(String[] args) {
		int j,i,k,n;
		String entra;
		entra = JOptionPane.showInputDialog("INFORME O NUMERO DE VERTICES DO GRAFOS");
		n = Integer.parseInt(entra);
		grafo = new int [n][n][n];
		for(i=0; i < n; i++) {
			for(j=0; j < n; j++) {
				if(i !=j) {
					entra=JOptionPane.showInputDialog("INFORME ARESTA DE: "+i+" ATE: "+j);
					grafo[0][i][j]= Integer.parseInt(entra);
				}
				else
					grafo[0][i][i] = 0;
			}
		}
		
		for(k=1; k<n; k++) {
			for(i=0; i<n; i++) {
				for(j=0; j < n;j++) {
					grafo[k][i][j] = menor(grafo[k-1][i][j],(grafo[k-1][i][k] + grafo[k-1][k][j]));
				}
			}
		}
		
		
		System.out.println("\t Menor Caminho");
		for(i=0; i<n; i++) {
			for(j=0; j < n; j++) 
				System.out.print("\t"+grafo[n-1][i][j]);
			System.out.println();
		}
	}
	
	public static int menor(int a, int b) {
		if(a < b) {
			return a;
		}
		return b;
	}
}


