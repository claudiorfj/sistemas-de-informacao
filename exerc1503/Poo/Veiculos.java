package exerc1503.Poo;

public class Veiculos {

    private String Modelo;
    private String Cor;
    private int Ano;

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    public String getModelo(){
        return Modelo;
    }
    public void setAno(int Ano) {
        this.Ano = Ano;
    }
    public int getAno(){
        return Ano;
    }
    public void setCor(String Cor) {
        this.Cor = Cor;
    }
    public String getCor(){
        return Cor;
    }
    public void Buzina() {
        System.out.println("Beep Beep!");
    }

    public void Ligar() {
        System.out.println("O carro esta ligando..");
    }

    public void AbrirPortaMala() {
        System.out.println("Abrindo porta malas..");
    }
    public void setAno(String string) {
    }
}