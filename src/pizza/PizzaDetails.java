package pizza;

public class PizzaDetails {

 public int pizzaName;
 private String pizzaInfo;

 private int ratings;
 public int price;



    public String getPizzaInfo() {
        return pizzaInfo;
    }

    public void setPizzaInfo(String pizzaInfo) {
        this.pizzaInfo = pizzaInfo;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public PizzaDetails(int pizzaName, String pizzaInfo) {
        this.pizzaName = pizzaName;
        this.pizzaInfo = pizzaInfo;
    }

    public PizzaDetails(int price) {
        this.price = price;
    }

    public PizzaDetails(int ratings, int price) {
        this.ratings = ratings;
        this.price = price;
    }

    public void pizzaName(){
        System.out.println("Deluxe pizza");
    }

    public void taste(){
        System.out.println("taste is good");
    }


    public void spicyPizza(){
        System.out.println("i like spicy pizza");
    }


public void pizzaInfo(){
    System.out.println("pizza info");
}

    public void  pizzaCustomer(){
        System.out.println("Pizza customers age are 15-30years old");
    }









}
