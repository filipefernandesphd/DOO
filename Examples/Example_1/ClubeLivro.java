import java.util.ArrayList;

public class ClubeLivro {
  private String nome;
  private ArrayList<Membro> listamembros = new ArrayList<Membro>();
  private ArrayList<Livro> listalivros = new ArrayList<Livro>();

  ClubeLivro(String nome){
    this.nome = nome;
  }

  public void addMembro(Membro membro){
    listamembros.add(membro);
  }

  public void addLivro(Livro livro){
    listalivros.add(livro);
  }
}
