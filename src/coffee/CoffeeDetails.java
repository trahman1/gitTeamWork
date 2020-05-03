package coffee;

public class CoffeeDetails {

   private int coffeeTaste;
   private String coffeeName;
   double coffeePrize;
   float coffeeQuantity;
   int coffeeColor;


    CoffeeDetails(double coffeePrize){  // constructor
        this.coffeePrize = coffeePrize;
        System.out.println("Coffee is hot");

    }

    public CoffeeDetails(int coffeeTaste, String coffeeName) {
        this.coffeeTaste = coffeeTaste;
        this.coffeeName = coffeeName;

    }


    public int getCoffeeTaste() {
        return coffeeTaste;
    }

    public void setCoffeeTaste(int coffeeTaste) {
        this.coffeeTaste = coffeeTaste;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }
}
