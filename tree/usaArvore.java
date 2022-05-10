package tree;

import javax.swing.JOptionPane;

public class usaArvore {
    public static void main(String[] args) {
        String entra;
        int opcao;
        ArvoreB minha;
        minha = new ArvoreB();
        minha.construir(minha.getRaiz(), 'r', 0);
        if (minha.getRaiz() != null) {
            entra = JOptionPane.showInputDialog(
                    "\n\t\tMENU\n\n\t1.CONSTRUIR\n\t2.PRE ORDEM ESQUERDA\n\t3.PRE ORDEM DIREITA\n\t4.POS ORDEM ESQUERDA\n\t5.POS ORDEM DIREITA\n\t6.IN ORDEM ESQUERDA\n\t7.IN ORDEM DIREITA\n\t8.VAZAR\n\n\tEscolha uma opcao: ");
            opcao = Integer.parseInt(entra);
            switch (opcao) {
                case 1: // CONSTRUIR
                minha.construir();
                    break;
                case 2: // PRE ORDEM ESQUERDA
                minha.preOrdemEsq(raiz);
                    break;
                case 3: // PRE ORDEM DIREITA
                minha.preOrdemDir(raiz);
                    break;
                case 4: // POS ORDEM ESQUERDA
                minha.posOrdemEsq(raiz);
                    break;
                case 5: // POS ORDEM DIREITA
                minha.posOrdemDir(raiz);
                    break;
                case 6: // IN ORDEM ESQUERDA
                minha.inOrdemEsq(raiz);
                    break;
                case 7: // IN ORDEM DIREITA
                minha.inOrdemDir(raiz);
                    break;
                case 8: // SAIR
                    break;

            }
        }else{
            System.out.println("\nNADA DE ARVORE");
        }

    }

}