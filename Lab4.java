// Adrian Alamilla-Vega
// CSCI U200 Lab 4
// February 13, 2023
// This program finds mode, the most frequent value, of a provided array. *I only programed section between lines*
public class Lab4 {
	public static int mode(int[] values) {
		/** DO NOT EDIT ANYTHING ABOVE THIS LINE **/
		int[] frequencyCounter = new int[10];
		for(int i=0; i<frequencyCounter.length; i++) {
			frequencyCounter[i] = 0;
			for(int j=0; j<values.length-1; j++) {
				frequencyCounter[values[j]]++;
			}
		}
		int greatestCount = 0;
		for(int z=0; z<frequencyCounter.length; z++) {
			if(frequencyCounter[greatestCount]<frequencyCounter[z]) {
				greatestCount = z;
			}
		}
		return greatestCount; 
		/** DO NOT EDIT ANYTHING BELOW THIS LINE **/
	}

	public static void main(String[] args) {
		int size=100; // This sets the size of the array to use
		int[] vals = new int[size]; // This creates an empty array of ints
		for(int i=0; i<size; i++) vals[i] = (int)Math.floor(Math.PI*i)%10; // This fills the array with digits of PI
		int mode = mode(vals); // Use the mode function to get the most common digit
		System.out.println("The most common digit is "+mode); // Print the result
	}
}