package views;

import java.util.List;

public class UserView {
  public String listUsers(List<String> users) {
    return "Lista de usuários: " + String.join(", ", users);
  }

  public String addUser(String user) {
    return "Usuário " + user + " adicionado com sucesso!";
  }
}
