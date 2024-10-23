//Adrian Alamilla-Vega
//CSCI U200 Lab 7
//03-20-23
//An example of a Main method used for my headphone class from the file named Headphone.java.
public class Lab7 {
    public static void main(String[] arg) {
        Headphone[] type = new Headphone[3];
        type[0] = new Headphone("Beats", "Silver", 250);
        type[1] = new Headphone(500);
        type[2] = new Headphone();
        type[2].setBrand("Bose");
        type[2].setColor("Black");
        type[2].setCost(300);
        for (int i = 0; i < 3; i++) {
            System.out.println(type[i]);
            System.out.println("The total cost of the "+type[i].getBrand()+" headphones are $"+type[i].salesTax());
        }
    }
}
