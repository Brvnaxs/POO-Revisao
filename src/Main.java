import entidades.Animal;
import entidades.Ave;
import entidades.Mamifero;
import entidades.Peixe;
import repositorio.RepositorioAnimais;

public class Main {
    public static void main(String[] args) {
        RepositorioAnimais vetor = new RepositorioAnimais();
        Mamifero cachorro = new Mamifero("Cachorro", 2, 10, "longo","Canis lupus familiaris");
        Ave galinha = new Ave("Galinha", 1, 2, "curta","Gallus gallus domesticus");
        Peixe sardinha = new Peixe("Sardinha", 1, 0.200, "cinza escuro", "Sardinella janeiro");
        vetor.inserir(cachorro);
        vetor.inserir(galinha);
        vetor.inserir(sardinha);
        vetor.emitirSomTodos();
    }

}