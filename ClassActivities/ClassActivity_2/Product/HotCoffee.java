package Product;

public class HotCoffee extends Product implements IFood{
  private String ingredients;

  public void setIngredients(String ingredients){
    this.ingredients = ingredients;
  }
}
