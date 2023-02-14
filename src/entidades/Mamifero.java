package entidades;

public class Mamifero extends Animal implements Animais {
    private String tipoPelo;
    private String nomeCientifico;

    public  Mamifero(){

    }
    public Mamifero(String nome, int idade, double peso, String tipoPelo, String nomeCientifico) {
        super(nome, idade, peso);
        this.tipoPelo = tipoPelo;
        this.nomeCientifico = nomeCientifico;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    @Override
    public String emitirSom(String nome) {
        return "Som";
    }

    @Override
    public void seAlimentar(String nome) {
            return;
    }

    @Override
    public void seMovimentar(String nome) {

    }
}
