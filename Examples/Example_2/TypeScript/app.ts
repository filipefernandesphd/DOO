import express from 'express';
import { UserController } from './controllers/UserController';

const app = express();
const PORT = process.env.PORT || 3000;

const userController = new UserController();

app.get('/users', (req, res) => userController.list(req, res));
app.get('/adduser', (req, res) => userController.add(req, res));

app.listen(PORT, () => {
  console.log(`Server running on http://localhost:${PORT}`);
});
