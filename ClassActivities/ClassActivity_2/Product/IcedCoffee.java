package Product;

public class IcedCoffee extends Product implements IFood{
  private String ingredients;

  public void setIngredients(String ingredients){
    this.ingredients = ingredients;
  }
}
