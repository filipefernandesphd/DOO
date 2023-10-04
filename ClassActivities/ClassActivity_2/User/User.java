package User;

import Table.*;

public abstract class User {
  protected String name;
  protected String cpf;

  // SET AND GET NAME
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }

  // SET AND GET CPF
  public void setCPF(String cpf){
    this.cpf = cpf;
  }
  public String getCPF(){
    return this.cpf;
  }

}
