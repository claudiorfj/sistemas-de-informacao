package tree;

import javax.swing.JOptionPane;

public class ArvoreB {
    private Nodo raiz;

    ArvoreB() {
        raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void construir(Nodo filho, char lado, int quem) {
        String entra;
        int lido;
        Nodo onde;
        if (lado == 'r') {
            entra = JOptionPane.showInputDialog("INFORME A RAIZ ");
        } else {
            if (lado == 'e') {
                entra = JOptionPane.showInputDialog("INFORME O FILHO ESQUERDO DE " + quem);
            } else {
                entra = JOptionPane.showInputDialog("INFORME O FILHO DIREITO DE " + quem);
            }
            lido = Integer.parseInt(entra);
            if (lido != 0) {
                onde = coloca(filho, lido, lado);
                construir(onde, 'e', lido);
                construir(onde, 'd', lido);
            }
        }
    }

    public Nodo coloca(Nodo atual, int quem, char ld) {
        Nodo alocou;
        alocou = new Nodo(quem);
        if (raiz == null) {
            raiz = alocou;
        }else{
            if(ld == 'e'){
                atual.filhoEsq = alocou;
                atual.filhoDir = alocou;
            }
        }
        return alocou;
    }

    public void preOrdemEsq(Nodo raiz){
        if (raiz != null){
            System.out.println(" "+raiz.dado);
            preOrdemEsq(raiz.filhoEsq);
            preOrdemEsq(raiz.filhoDir);
        }
    }

    public void preOrdemDir(Nodo raiz){
        if (raiz != null){
            System.out.println(" "+raiz.dado);
            preOrdemDir(raiz.filhoDir);
            preOrdemDir(raiz.filhoEsq);
        }
    }
    
    public void posOrdemEsq(Nodo raiz){
        if (raiz != null){
            System.out.println(" "+raiz.dado);
            posOrdemEsq(raiz.filhoEsq);
            posOrdemEsq(raiz.filhoDir);
        }
    }

    public void posOrdemDir(Nodo raiz){
        if (raiz != null){
            System.out.println(" "+raiz.dado);
            posOrdemDir(raiz.filhoDir);
            posOrdemDir(raiz.filhoEsq);
        }
    }

    public void inOrdemEsq(Nodo raiz){
        if (raiz != null){
            inOrdemEsq(raiz.filhoEsq);
            System.out.println(" "+raiz.dado);
            inOrdemEsq(raiz.filhoDir);
        }
    }

    public void inOrdemDir(Nodo raiz){
        if (raiz != null){
            inOrdemDir(raiz.filhoDir);
            System.out.println(" "+raiz.dado);
            inOrdemDir(raiz.filhoEsq);
        }
    }
}