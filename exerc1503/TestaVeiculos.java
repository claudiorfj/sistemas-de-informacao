package exerc1503;

import exerc1503.Poo.Veiculos;

public class TestaVeiculos {
    public static void main (String[] args){
        Veiculos v = new Veiculos();

        v.setModelo("Gol");
        System.out.println("Modelo: "+v.getModelo());

        v.setAno("2001");
        System.out.println("Ano: "+v.getAno());

        v.setCor("Cinza");
        System.out.println("Cor: "+v.getCor());

    }
    
}