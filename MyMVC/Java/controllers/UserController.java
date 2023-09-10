package controllers;

import models.UserModel;
import views.UserView;
import java.util.List;

public class UserController {
  private UserModel userModel;
  private UserView userView;

  public UserController(){
    this.userModel = new UserModel();
    this.userView = new UserView();
  }

  public String list() {
    List<String> users = userModel.getAll();
    return userView.listUsers(users);
  }

  public String add(String user) {
    userModel.add(user);
    return userView.addUser(user);
  }
}
