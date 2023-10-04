package Table;

import java.util.ArrayList;
import java.util.Map.Entry;

import Order.*;
import Product.*;

public class Table {
  private int tablenumber;
  private ArrayList<Order> orders = new ArrayList<>();

  public Table(int tablenumber){
    this.tablenumber = tablenumber;
  }

  private double calculateTotalPrice(){
    double totalprice = 0;

    if( !this.orders.isEmpty() ){
      for (int i = 0; i < this.orders.size(); i++) {
        totalprice += this.orders.get(i).calculateTotalPrice();
      }
    }
    
    return totalprice;
  }
  
  // SET AND GET TABLE NUMBER
  public void setTableNumber(int tablenumber){
    this.tablenumber = tablenumber;
  }
  public int getTableNumber(){
    return this.tablenumber;
  }

  public void setOrder(Order order){
    this.orders.add(order);
  }

  public void finishingTable(){
    double totalprice = 0;    

      if( !this.orders.isEmpty() ){
        System.out.println("Finishing Table " + this.tablenumber+":");
        
        for (int i = 0; i < this.orders.size(); i++) {
          for (Entry<Product, Integer> entry : this.orders.get(i).getProducts().entrySet() ) {
            Product product = entry.getKey();
            double price = product.getPrice();
            Integer quantity = entry.getValue();
            double totalpriceproduct = price * quantity;

            System.out.println("\t"+product.getName()+"\t\t"+price+"\t"+quantity+"\t"+totalpriceproduct);

            totalprice += totalpriceproduct;
          }
        }
        System.out.println("\tTotal price is "+totalprice+"\n");
      }else{
        System.out.println("There are not orders");
      }
  }

  public void payment(){
    this.orders = new ArrayList<>();

    System.out.println("Table "+ this.tablenumber+" paid successfully");
  }
}
