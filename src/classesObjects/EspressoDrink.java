/*
 * Heather Taylor
 * CIS 2212 Tuesdays Fall 2016
 * Lab 06 - Objects & Classes
 * Due October 4, 2016
 */

package classesObjects;

import java.text.NumberFormat;

public class EspressoDrink {
	
	// Set up currency object
	NumberFormat currency = NumberFormat.getCurrencyInstance();
	
	// data fields
	private String milk = null;  	
	private String flavor = null; 
	private boolean extraShot = false; // add an extra shot of espresso? yes or no
	private double cost = 2.00; // initialize with minimum cost of a 12 oz. espresso
	
	// no-arg constructor
	public EspressoDrink(){	
	}
	
	// overloaded constructor
	public EspressoDrink(String mlk, String flr, boolean shot){		
		milk = mlk;
		flavor = flr;
		extraShot = shot;
	}

	// getters & setters
	public String getMilk() {
		return milk;
	}

	public void setMilk(String milk) {
		this.milk = milk;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public boolean isExtraShot() {
		return extraShot;
	}

	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	// create method to calculate the total cost of a cup of espresso
	public double calcTotal(){
		double total; // amount to be returned
		
		// add .50 cents for any milk that isn't whole or skim, and .35 cents for flavoring
		if ((milk != "whole" && milk != "skim") && flavor != "no"){
			cost += 0.85;	
		}
		
		// add .35 cents for flavoring
		else if (flavor != "no"){
			cost += 0.35;	
		}
		
		// add .50 cents for milk that isn't whole or skim
		else if (milk != "whole" && milk != "skim"){
			cost += 0.50;
		}
		
		else{
		}
		
		// add .50 cents for extra shot of espresso
		if (extraShot != false){
			total = cost + 0.50;
		}
		else
			total = cost;
		
		return total;
	}
	 
	// display toString()
	@Override
	public String toString(){
		
		String str;
		
		if (extraShot != false){
			if (flavor == "no"){
				str = "\nA cup of espresso with ";
				str += milk + " milk and an extra shot of espresso ";
				str += "cost " + currency.format(calcTotal()) + ".";
				}
			else {
				str = "\nA cup of espresso with ";
				str += milk + " milk, " + flavor + " flavoring, ";
				str += "and an extra shot of espresso ";
				str += "cost " + currency.format(calcTotal()) + ".";
				}
		} // end if statement when extraShot != false
		
		else{
			if (flavor == "no"){
				str = "\nA cup of espresso with " + milk + " milk ";
				str += "cost " + currency.format(calcTotal()) + ".";
			}
			else {
				str = "\nA cup of espresso with ";
				str += milk + " milk and " + flavor + " flavoring ";
				str += "cost " + currency.format(calcTotal()) + ".";
			}
		} // end of else statement
		
		return str;
	}

} // end EspressoDrink class
