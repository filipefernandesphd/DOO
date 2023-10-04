import Order.*;
import Product.*;
import Table.*;
import User.*;

public class Main{
  public static void main(String[] args) {
    // System.out.println("");

    // Creating products
    HotCoffee vanilla = new HotCoffee();
    vanilla.setIngredients("Ingredient A, Ingredient B, Ingredient C");
    vanilla.setName("Vanilla");
    vanilla.setPrice(15.95);
    
    IcedCoffee sensacao = new IcedCoffee();
    sensacao.setIngredients("Ingredient D, Ingredient E");
    sensacao.setName("Sensação");
    sensacao.setPrice(19.99);

    Drink sodamelancia = new Drink();
    sodamelancia.setIngredients("Ingredient F, Ingredient G, Ingredient H, Ingredient I");
    sodamelancia.setName("Soda Italiana Melancia");
    sodamelancia.setPrice(21.19);

    Snack pastelbelem = new Snack();
    pastelbelem.setIngredients("Ingredient J, Ingredient K");
    pastelbelem.setName("Pastel de Belém");
    pastelbelem.setPrice(6.99);

    Souvenir copoclube = new Souvenir();
    copoclube.setName("Colo Clube do Café");
    copoclube.setPrice(23.59);

    // Creating Tables
    Table table1 = new Table(1);
    Table table2 = new Table(2);

    // Creating Employees
    Employee employee1 = new Employee();
    employee1.setName("Employee 1");

    Employee employee2 = new Employee();
    employee2.setName("Employee 2");

    // Creating Clients
    Client client1 = new Client();

    // Creating orders
    Order order1 = new Order(employee1);
    order1.setClient(client1);
    order1.setProduct(vanilla, 1);
    table1.setOrder(order1);

    Order order2 = new Order(employee2);
    order2.setProduct(sensacao, 2);
    order2.setProduct(pastelbelem, 2);
    order2.setProduct(copoclube, 1);
    table2.setOrder(order2);

    // Finishing orders
    table1.finishingTable();
    table2.finishingTable();
    
    // Payment orders
    table1.payment();
    table2.payment();    
  }
}