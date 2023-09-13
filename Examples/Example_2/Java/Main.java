import controllers.UserController;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    UserController userController = new UserController();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Escolha uma opção:");
      System.out.println("1. Listar usuários");
      System.out.println("2. Adicionar usuário");
      System.out.println("3. Sair");
      int choice = scanner.nextInt();
      scanner.nextLine();  // Consume newline

      switch (choice) {
        case 1:
          System.out.println(userController.list());
          break;
        case 2:
          System.out.print("Digite o nome do usuário: ");
          String user = scanner.nextLine();
          System.out.println(userController.add(user));
          break;
        case 3:
          System.out.println("Até logo!");
          scanner.close();
          System.exit(0);
          break;
        default:
          System.out.println("Opção inválida!");
      }
    }
  }
}
