// Adrian Alamilla-Vega
// CSCI U200 Lab 2
// January 30, 2023
//This implements a math formula, the Pythagorean theorem, in Java
public class Lab2 {
	public static void main(String[] args) {
		double distance, firstPointsXValue, firstPointsYValue, secondPointsXValue, secondPointsYValue;
		firstPointsXValue = 1;
		firstPointsYValue = 6;
		secondPointsXValue = 4;
		secondPointsYValue = 2;
		distance = Math.sqrt(Math.pow((firstPointsXValue-secondPointsXValue), 2.0)+Math.pow((firstPointsYValue-secondPointsYValue), 2.0));
		System.out.println("The distance between ("+firstPointsXValue+", "+firstPointsYValue+") and ("+secondPointsXValue+", "+secondPointsYValue+") is "+distance+".");
	}
}