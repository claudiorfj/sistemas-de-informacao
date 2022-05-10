package exerc1904;

public class Maria extends Pessoa implements acoesPessoas {

    public Maria(String nome) {
        super(nome);
    }

    public void saudacao() {
        System.out.println("Olá meu nomeu eh: " + nome);
    }

    public void parar() {
        System.out.println("e parei de andar.");
    }

    public void andar() {
        System.out.println("e estou andando..");
    }
}