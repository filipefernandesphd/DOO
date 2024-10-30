
import java.util.ArrayList;

public class Pessoa {
    String nome;
    String email;
    Pessoa pai;
    Pessoa mae;
    ArrayList<Pet> pets = new ArrayList<>();

    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return this.nome;
    }

    void setPais(Pessoa pai, Pessoa mae) {
        this.pai = pai;
        this.mae = mae;
    } 

    void getPais() {
        System.out.println(this.nome+" e filho de "+this.pai.getNome()+" e "+this.mae.getNome());
    }

    void setPet(Pet pet) {
        this.pets.add(pet);
    }

    void getPets() {
        if (pets.size() >= 1) {
            System.out.println(this.nome + " possui os seguintes pets:");

            for (Pet p : pets) {
                System.out.println(p.getNome());
            }           
        }else {
            System.out.println(this.nome + " NAO possui pets!");
        }
        System.out.println();
    }
}

