package Product;
public abstract class Product {
  protected double price;
  protected String name;

  // SET AND GET PRICE
  public void setPrice(double price){
    this.price = price;
  }
  public double getPrice(){
    return this.price;
  }

  // SET AND GET NAME
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
}
