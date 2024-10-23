//Adrian Alamilla-Vega
//CSCI U200 Lab 3
//April 24, 2023
//This executes a calculation to find greatest common divisor between two integers provided by user.
public class Lab3 {
	public static void main(String[] args) {
		int firstIntegerValue = 0, secondIntegerValue = 0, greatestCommonDivisor = 0, manipulatedDivisor = 0;
		//If a non-integer is entered program will not continue.
		try {
			System.out.println("Please enter two integers:");
			firstIntegerValue = Integer.parseInt(System.console().readLine());
			secondIntegerValue = Integer.parseInt(System.console().readLine());
		} catch (NumberFormatException e) {
			System.out.println("Invalid value. INTEGERS ONLY!");
			System.exit(1);
		}
		greatestCommonDivisor = 1;
		manipulatedDivisor = 2;
		// < was corrected to <= and || was corrected &&.
		while (manipulatedDivisor <= firstIntegerValue && manipulatedDivisor <= secondIntegerValue) {
			if(firstIntegerValue%manipulatedDivisor==0 && secondIntegerValue%manipulatedDivisor==0) {
				greatestCommonDivisor = manipulatedDivisor;
			}
			manipulatedDivisor = manipulatedDivisor+1;	
		}
		System.out.println("The GCD of "+firstIntegerValue+" and "+secondIntegerValue+" is "+greatestCommonDivisor+".");
	}
}