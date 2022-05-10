package lifoTest;

import javax.swing.JOptionPane;

public class usaLifo{
    public static void main(String[] args){
            String entra;
            Lifo minha;
            int opcao, matricula, idade = 0, procurarMatricula = 0, mediaidade = 0;
            minha = new Lifo();
        do {
            entra = JOptionPane.showInputDialog(
					"\n\t\tMENU\n\n\t1.Inserir\n\t2.Retirar\n\t3.Mostrar\n\t4.Procurar\n\t5.Media das Idades\n\t99.Vazar\n\n\tEscolha uma opcao: ");
			opcao = Integer.parseInt(entra);
            switch (opcao){
                case 1://INSERIR
                    entra = JOptionPane.showInputDialog("Digite a matricula: ");
                    matricula = Integer.parseInt(entra);
                    entra = JOptionPane.showInputDialog("Digite a idade: ");
                    idade = Integer.parseInt(entra);
                    minha.inserir(matricula, idade);
                break;
                case 2://RETIRAR
                	minha.retirar();
                break;
                case 3://MOSTRAR
                    minha.mostrar();
                break;
                case 4://PROCURAR
                	entra = JOptionPane.showInputDialog("Digite a matricula: ");
                	procurarMatricula = Integer.parseInt(entra);
                	System.out.println("A idade do matriculado eh: "+minha.procurar(procurarMatricula));
                break;
                case 5://MEDIA IDADE
                mediaidade = minha.mediaId();
                System.out.println("A media de idade dos alunos eh: "+mediaidade);
                break;
            }
        }
        while (opcao != 99); 
                
    }
}