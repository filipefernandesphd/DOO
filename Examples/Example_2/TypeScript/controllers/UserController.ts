import { Request, Response } from "express";
import { UserModel } from "../models/UserModel";
import { UserView } from "../views/UserView";

export class UserController {
  private userModel: UserModel = new UserModel();
  private userView: UserView = new UserView();

  list(req:Request, res:Response): void {
    const users = this.userModel.getAll();

    res.send(this.userView.listUsers(users));
  }

  add(req:Request, res:Response): void {
    const user = req.query.name as string;
    this.userModel.add(user);

    res.send(this.userView.addUser(user));
  }
}
