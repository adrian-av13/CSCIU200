//Adrian Alamilla-Vega
//CSCI U200 Lab 8
//03-27-23
//An example of a class using headphones describing its brand, color ,and cost. The main method can be found in Lab7.java file.
//Also is the Parent class to EarbudHeadphone.java class.
public class Headphone {
    private String brand;
    private String color;
    private double cost;

    //DEFAULT VALUES
    public Headphone() {
        brand = "Unknown";
        color = "Unknown";
        cost = 0;
    }

    //CONSTRUCTOR-CONSTRUCTOR-CONSTRUCTOR-CONSTRUCTOR
    public Headphone(String newBrand, String newColor, double newCost) {
        if(newBrand.matches("[a-zA-Z]+")) {
                brand = newBrand;
        } else {
                brand = "Unknown";
        }

        if(newColor.matches("[a-zA-Z]+")) {
            color = newColor;
        } else {
            color = "Unknown";
        }

        if(newCost<0) {
            cost = 0;
        } else {
            cost = newCost;
        }
    }

    public Headphone(double newCost) {
        brand = "Unknown";
        color = "Unknown";
        cost = newCost;
    }

    //SETTER-SETTER-SETTER-SETTER
    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public void setCost(double newCost) {
        if (newCost > 0) {
            cost = newCost;
        }
    }
    //GETTER-GETTER-GETTER-GETTER
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getCost() {
        return cost;
    }

    /**
     * Calculates the estimated total cost of headphones including South Carolina's sales tax rate of 6%.
     * @return Estimated total price of headphones.
     */
    public double salesTax() {
        return Math.round((cost + (cost*.06)));
    }

    public String toString() {
        return "The headphone brand is " + brand + " and the color is " + color + " valued at a price of $" + cost +".";
    }
}
