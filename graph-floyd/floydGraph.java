import java.util.Scanner;

public class floydGraph {
    static int[][] graph = new int[10][10];
    static int n;

    static int[][] matriz() {
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                dist[i][j] = graph[i][j];
        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    if (dist[i][j] > dist[i][k] + dist[k][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
        return dist;
    }

    static void printSolution(int[][] dist) {
        System.out.println("A menor distancia entre cada par: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(dist[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o numero de vertices do grafo: ");
        n = reader.nextInt();
        System.out.println("Digite a matriz do grafo (infinito = 999):");
        /* Exemplo:
        0    1    2    999
        999  0    999  3
        999  999  0    4
        5    999  999  0
         */
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                graph[i][j] = reader.nextInt();
        printSolution(matriz());
        reader.close();
    }
}