package burger;

public class BurgerDetails {
    private String nameOfBurger;
    private String nameTopping;
    private double priceOfTheBurger;

    public BurgerDetails() {
    }

    public BurgerDetails(String nameOfBurger) {
        this.nameOfBurger = nameOfBurger;
    }

    public BurgerDetails(String nameOfBurger, String nameTopping) {
        this.nameOfBurger = nameOfBurger;
        this.nameTopping = nameTopping;
    }

    public BurgerDetails(String nameOfBurger, String nameTopping, double priceOfTheBurger) {
        this.nameOfBurger = nameOfBurger;
        this.nameTopping = nameTopping;
        this.priceOfTheBurger = priceOfTheBurger;
    }

    public String getNameOfBurger() {
        return nameOfBurger;
    }

    public void setNameOfBurger(String nameOfBurger) {
        this.nameOfBurger = nameOfBurger;
    }

    public String getNameTopping() {
        return nameTopping;
    }

    public void setNameTopping(String nameTopping) {
        this.nameTopping = nameTopping;
    }

    public double getPriceOfTheBurger() {
        return priceOfTheBurger;
    }

    public void setPriceOfTheBurger(double priceOfTheBurger) {
        this.priceOfTheBurger = priceOfTheBurger;
    }

    public static void burgerInfo(){
        System.out.println("Burger Info");
    }



}
