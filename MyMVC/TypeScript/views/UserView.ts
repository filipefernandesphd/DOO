export class UserView {
  listUsers(users: string[]): string {
    return `Lista de usuários: ${users.join(', ')}`;
  }

  addUser(user: string): string {
    return `Usuário ${user} adicionado com sucesso!`;
  }
}
