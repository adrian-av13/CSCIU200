//Adrian Alamilla-Vega
//CSCI U200 Lab8
//03-27-23
//An example of a Main method used for my headphone class from the file named Headphone.java.
// Also includes an Extended class called EarbudHeadphone.java that extends from the headphone.java class.
public class Lab8 {
    public static void main(String[] arg) {
        Headphone[] type = new Headphone[4];
        type[0] = new Headphone("Beats", "Silver", 250);
        type[1] = new Headphone(500);
        type[2] = new Headphone();
        type[2].setBrand("Bose");
        type[2].setColor("Black");
        type[2].setCost(300);
        type[3] = new EarbudHeadphone("Sony", "Blue", 50,"wireless");
        for (int i = 0; i < type.length; i++) {
            System.out.println(type[i]);
            System.out.println("The total cost of the "+type[i].getBrand()+" headphones are $"+type[i].salesTax()+".");
        }
    }
}
