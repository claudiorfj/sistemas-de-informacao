package fifoTest;

import javax.swing.JOptionPane;

public class usafifoDinamica{
    public static void main(String[] args){
            String entraop, entramtr, entraidd;
            Fifo minha;
            int opcao, procurarmtr, idade;
            minha = new Fifo();
        do {
            entraop = JOptionPane.showInputDialog(
					"\n\t\tMENU\n\n\t1.Inserir\n\t2.Retirar\n\t3.Mostrar\n\t4.Mostrar invertido\n\t5.Detonar\n\t6.Procurar\n\t7.Mais velho\n\t8.Media idade\n\t9.Cabeca\n\t10.Ultimo\n\n\t99.Vazar\n\n\tEscolha uma opcao: ");
			opcao = Integer.parseInt(entraop);
            switch (opcao){
                case 1://INSERIR
                    entramtr = JOptionPane.showInputDialog("Digite a matricula: ");
                    procurarmtr = Integer.parseInt(entramtr);
                    entraidd = JOptionPane.showInputDialog("Digite a idade: ");
                    idade = Integer.parseInt(entraidd);
                break;
            
                case 2://RETIRAR
                    if (minha.retirar() == -999)
                        System.out.println("Underflow");
                    else
                        System.out.println("Retirado");
                break;
                
                case 3://MOSTRAR
                    minha.mostrar();
                break;

                case 4://INVERTER
                    minha.inverter();
                break;

                case 5://DETONAR
                    minha.detonar();
                    break;
                
                case 6://PROCURAR
                    entramtr = JOptionPane.showInputDialog("Digite a matricula: ");
                    procurarmtr = Integer.parseInt(entramtr);
                    if (minha.procurar(procurarmtr) == true)
                        System.out.println("Matricula encontrada: "+entramtr);
                    else
                        System.out.println("Matricula nao encontrada.");
                break;

                case 7://MAIS VELHO
                    minha.maisvelho();
                break;

                case 8://MEDIA IDADE
                    minha.mediaidade();
                break;

                case 9://CABECA
                    minha.cabeca();
                break;

                case 10://ULTIMO
                    minha.ultimo();
                break;
            }
        }
        while (opcao != 99); 
                
    }
}