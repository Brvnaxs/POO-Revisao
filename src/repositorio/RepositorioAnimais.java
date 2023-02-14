package repositorio;

import entidades.Animal;

public class RepositorioAnimais {
   private Animal vetor [] = new Animal[100];

    public RepositorioAnimais() {}
    public void inserir(Animal animal){
        if(vetor[0].equals(null)){
            vetor[0] = animal;
        }else{
            for(int i = 0; i < vetor.length; i++){
                if(vetor[i].equals(null)){
                    vetor[i] = animal;
                }
            }
        }
    }
    public void emitirSom(){
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i].getNome());
        }
    }

}
