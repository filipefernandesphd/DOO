export class UserModel{
  private name: string[] = [];

  getAll(): string[] {
    return this.name;
  }

  add(name: string): void {
    this.name.push(name);
  }
}
