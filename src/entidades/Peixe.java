package entidades;

public class Peixe extends Animal{
    private String coloracao;
    private String nomeCientifico;

    public Peixe() {
    }

    public Peixe(String nome, int idade, double peso, String coloracao, String nomeCientifico) {
        super(nome, idade, peso);
        this.coloracao = coloracao;
        this.nomeCientifico = nomeCientifico;
    }

    public String getColoracao() {
        return coloracao;
    }

    public void setColoracao(String coloracao) {
        this.coloracao = coloracao;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    @Override
    public String emitirSom(String nome) {
        return "som";
    }

    @Override
    public void seAlimentar(String nome) {
        return;
    }

    @Override
    public void seMovimentar(String nome) {
        return;
    }
}
