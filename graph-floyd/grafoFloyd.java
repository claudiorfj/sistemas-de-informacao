import javax.swing.JOptionPane;

public class grafoFloyd {

    static int[][] grafo = new int[10][10];

    public static void main(String[] args) {
        int j, i, k, n;
        String entra;
        entra = JOptionPane.showInputDialog("Digite o numero de vertices do grafo: ");
        n = Integer.parseInt(entra);

        /*
         * Exemplo:
         * 0   1   2   999
         * 999 0   999 3
         * 999 999 0   4
         * 5   999 999 0
         */
        grafo = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i != j) {
                    entra = JOptionPane.showInputDialog("Informe a aresta de: " + i + " ate: " + j);
                    grafo[i][j] = Integer.parseInt(entra);
                }
            }
        }
        int[][] menor = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                for (k = 0; k < n; k++) {
                    menor[i][j] = grafo[i][j];
                }
            }
        }
        for (k = 0; k < n; k++) {
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    if (menor[i][j] > menor[i][k] + menor[k][j])
                        menor[i][j] = menor[i][k] + menor[k][j];
                }
            }
        }
        System.out.println("A menor distancia entre cada par: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(menor[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int menor(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }
}
