package exerc1904;

public class Main {
    public static void main(String[] args) {
        Maria m = new Maria("Maria");

        m.setNome("Maria das Dores");
        System.out.println("Nome: " + m.getNome());
        m.setEndereco("Rua Cunha");
        System.out.println("Endereço: " + m.getEndereco());
        m.setIdade(28);
        System.out.println("Idade: " + m.getIdade());
        m.setSexo("Feminino");
        System.out.println("Sexo: " + m.getSexo());

        m.saudacao();
        m.andar();
        // m.parar();


    }
}