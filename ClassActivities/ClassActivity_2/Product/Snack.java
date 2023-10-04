package Product;

public class Snack extends Product implements IFood{
  private String ingredients;

  public void setIngredients(String ingredients){
    this.ingredients = ingredients;
  }
}
