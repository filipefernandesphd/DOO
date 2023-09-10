package models;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
  private ArrayList<String> name;

  public UserModel(){
    this.name = new ArrayList<>();
  }

  public List<String> getAll() {
    return name;
  }

  public void add(String user) {
    name.add(user);
  }
}
