package Order;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.management.relation.Role;

import Product.*;
import User.*;

public class Order {
  private Employee employee;
  private Map<Product, Integer> products = new HashMap<Product, Integer>();
  private Client client;

  public Order(Employee employee){
    this.employee = employee;
  }

  // SET AND GET CLIENT
  public void setClient(Client client){
    this.client = client;
  }
  public Client getClient(){
    return this.client;
  }

  // SET AND GET PRODUCTS
  public void setProduct(Product product, Integer quantity){
    this.products.put(product, quantity);
  }
  public Map<Product, Integer> getProducts(){
    return this.products;
  }

  public double calculateTotalPrice(){
    double totalprice = 0;

    for (Entry<Product, Integer> entry : this.products.entrySet() ) {
      totalprice += entry.getKey().getPrice() * entry.getValue();
    }

    return totalprice;
  }
}
