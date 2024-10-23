//Adrian Alamilla-Vega
//CSCI U200 Lab 9
//04-04-23
//This class is executed in the Lab9.java file and is an example of how to use a queue function.

/*******************************************************************
This is the file you will edit and turn in.
Don't forget to add your name, date, etc... to the top of this file.
********************************************************************/
import java.util.LinkedList;
import java.util.Queue;

public class Intersection {
	/** BEGIN EDITING HERE **/
	private char curdir;
	/**
	* Pulls one vehicle from one of the queues and returns it.
	* It can return null if the queues are empty.
	* Note: I strongly suggest explaining your algorithm here.
	 * The following algorithm releases the lane with the most cars in a clockwise order starting with the North lane.
	 * First comparing North to East and if East has more cars it will check if West has a larger value etc...
	 * And if only one car is at each location it will release in clockwise order.
	* @return An Integer, representing a vehicle from one of the queues
	*/
	public Integer poll() {
		System.out.println("Popping");
		//The waiting call out to what car is released.
		Queue<Integer> releaseLocation = n;
		//Stores the car count of each lane.
		int carLength = n.size();
		//Compares the length of each lane starting with North lane.
		//If the lane is Larger we change what lane is called out and new biggest car quantity.
		if (e.size() > carLength) {
			releaseLocation = e;
			carLength = e.size();
		} else if (s.size() > carLength) {
			releaseLocation = s;
			carLength = s.size();
		} else if (w.size() > carLength) {
			releaseLocation = w;
			carLength = w.size();
		} else
			carLength = n.size();
		return releaseLocation.poll();
	}
	/** STOP EDITING HERE **/

	// Attributes
	private LinkedList<Integer> n, e, s, w;
	// Constructor
	public Intersection() {
		n = new LinkedList<Integer>();
		e = new LinkedList<Integer>();
		s = new LinkedList<Integer>();
		w = new LinkedList<Integer>();
		curdir = 'N';
		// If you added a class attribute, initialize it here
	}
	// Add a vehicle to one of the queues
	public void add(char dir, Integer val) {
		System.out.println("Adding "+val+" to "+dir);
		if(dir=='N') n.add(val);
		if(dir=='E') e.add(val);
		if(dir=='S') s.add(val);
		if(dir=='W') w.add(val);
	}
	// Return the intersection as a String
	public String toString() {
		String str = "";
		for(int wi=0; wi<w.size(); wi++) str+= " ";
		str+= " | |\n";
		for(int ni=n.size()-1; ni>=0; ni--) {
			for(int wi=0; wi<w.size(); wi++) str+= " ";
			str+= " |"+n.get(ni)+"|\n";
		}
		for(int wi=0; wi<w.size(); wi++) str+= "-";
		str+= "-+ +-";
		for(int ei=0; ei<e.size(); ei++) str+= "-";
		str+= "\n ";
		for(int wi=w.size()-1; wi>=0; wi--) str+= w.get(wi);
		str+= "   ";
		for(int ei=0; ei<e.size(); ei++) str+= e.get(ei);
		str+= "\n";
		for(int wi=0; wi<w.size(); wi++) str+= "-";
		str+= "-+ +-";
		for(int ei=0; ei<e.size(); ei++) str+= "-";
		str+= "\n";
		for(int si=0; si<s.size(); si++) {
		  for(int wi=0; wi<w.size(); wi++) str+= " ";
		  str+= " |"+s.get(si)+"|\n";
		}
		for(int wi=0; wi<w.size(); wi++) str+= " ";
		str+= " | |\n";
		return str;
	}
}
