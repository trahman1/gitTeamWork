package burger;

public class BurgerDetails {
    private String nameOfBurger;
    private String nameTopping;
    private double priceOfBurger;


    public BurgerDetails() {
    }

    public BurgerDetails(String nameOfBurger) {
        this.nameOfBurger = nameOfBurger;
    }

    public BurgerDetails(String nameOfBurger, String nameTopping) {
        this.nameOfBurger = nameOfBurger;
        this.nameTopping = nameTopping;
    }

    public BurgerDetails(String nameOfBurger, String nameTopping, double priceOfBurger) {
        this.nameOfBurger = nameOfBurger;
        this.nameTopping = nameTopping;
        this.priceOfBurger = priceOfBurger;
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

    public double getPriceOfBurger() {
        return priceOfBurger;
    }

    public void setPriceOfBurger(double priceOfBurger) {
        this.priceOfBurger = priceOfBurger;
    }

    public static void burgerInfo(){
        System.out.println("Burger Info");
    }



}
