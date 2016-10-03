/*
 * Heather Taylor
 * CIS 2212 Tuesdays Fall 2016
 * Lab 06 - Objects & Classes
 * Due October 4, 2016
 */

/*A program where the class is a 12 ounce cup of espresso. The objects derived from the class can have different
 * types of milk and flavoring, as well as an option to add an extra shot of espresso. The base price of a cup of
 * espresso is $2.00. Whole milk and skim milk are no charge. All other milks (such as coconut, almond, cashew and soy)
 * are an additional .50 cents. Flavoring is an additional .35 cents. An extra shot of espresso is .50 cents.
*/

package classesObjects;

public class DemoEspressoDrink {

	public static void main(String[] args) {
		
		// create instance of EspressoDrink object
		EspressoDrink drink1 = new EspressoDrink();
		EspressoDrink drink2 = new EspressoDrink();
		
		// initialize drink1 & drink2 with setters
		drink1.setMilk("whole");
		drink1.setFlavor("mocha");
		drink1.setExtraShot(false);
		
		drink2.setMilk("coconut");
		drink2.setFlavor("english toffee");
		drink2.setExtraShot(true);
		
		// declare an array of 10 objects
		EspressoDrink[] drinkArray = new EspressoDrink[10];
		
		// populate the array
		drinkArray[0] = drink1;
		drinkArray[1] = drink2;
		drinkArray[2] = new EspressoDrink("almond","butter pecan", false); 
		drinkArray[3] = new EspressoDrink("whole","pumpkin spice", true); // whole milk, flavor + extra shot - cost should be $2.85
		drinkArray[4] = new EspressoDrink("skim","english toffee", false);
		drinkArray[5] = new EspressoDrink("coconut","white mocha", false); 
		drinkArray[6] = new EspressoDrink("almond","caramel", true); // almond milk, flavor + extra shot - cost should be $3.35
		drinkArray[7] = new EspressoDrink("soy","no", true);
		drinkArray[8] = new EspressoDrink("cashew","brown sugar cinnamon", false);
		drinkArray[9] = new EspressoDrink("skim","no", false); // skim milk, no flavoring, no extra shot - cost should be $2.00
		
		// display the array of objects
		displayArray(drinkArray);
		
	} // end main
	
	// display objects in the drinkArry
	public static void displayArray(EspressoDrink[] drinks){
		
		System.out.println("Objects of the EspressoDrink class:");
		System.out.println("--------------------------------------");
		
		for (int i=0; i < drinks.length; i++){
			System.out.print("\nDrink #" + (i+1) + ": " + drinks[i] + "\n");
		}
		
	} // end displayArray

} // end DemoEspressoDrink class
