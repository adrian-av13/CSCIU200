//Adrian Alamilla-Vega
//CSCI U200 Lab 8
//03-27-23
// An example of an Extended class. The EarbudHeadphone class extends from Headphone.java class, "Earbud headphones is a headphone."
public class EarbudHeadphone extends Headphone {
    //ATTRIBUTE
    private String wired;
    //GETTER
    public String getWired() {
        return wired;
    }
    //SETTER
    public void setWired(String newWired) {
        wired = newWired;
    }
    //EMPTY CONSTRUCTOR
    public EarbudHeadphone() {
        super();
        wired = "Unknown";
    }
    //FULL-CONSTRUCTOR
    public EarbudHeadphone(String newBrand, String newColor, double newCost, String newWired) {
        super(newBrand, newColor, newCost);
        wired = newWired;
    }
    public String toString() {
        String str = super.toString();
        str+= " The "+ super.getBrand() +" earbud headphones are "+wired+".";
        return str;
    }
}
