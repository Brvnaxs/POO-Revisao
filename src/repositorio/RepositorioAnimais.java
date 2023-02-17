package repositorio;

import entidades.Animal;

public class RepositorioAnimais {
   private Animal vetor [] = new Animal[100];

    public RepositorioAnimais() {}
    public void inserir(Animal animal){
        if(this.vetor[0] == null){
            this.vetor[0] = animal;
        }else{
            for(int i = 0; i < this.vetor.length; i++){
                if(this.vetor[i] == null){
                    this.vetor[i] = animal;
                }
            }
        }
    }
    public void emitirSomTodos(){
        for(int i = 0; i < this.vetor.length; i++){
            if(this.vetor[i] != null){
                System.out.println(this.vetor[i].emitirSom(this.vetor[i].getNome()));
            }
        }
    }

}
