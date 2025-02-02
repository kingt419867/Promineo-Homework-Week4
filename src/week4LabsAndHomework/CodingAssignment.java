package week4LabsAndHomework;
import java.util.*;
import java.io.*;

public class CodingAssignment {

	public static void main(String[] args) {
		// 1.a.  Creating the initial array.
		System.out.println("Section 1.a");
		int ages[] = {3, 9, 23, 64, 2, 8, 28, 93};
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");	//Showing the contents of the array, ages.
		}
		System.out.println();
		System.out.println("The array length is " + ages.length);
		System.out.println("The altered array is: ");
		int agesAlt = ages[ages.length-1] - ages[0]; // Subtracting the first element value from the last element value.
		ages[ages.length-1] = agesAlt;				//Re-assigning the last element with its new value.
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");	//Printing the contents of the altered array, ages.
		}
		System.out.println(); //blank line
		System.out.println();
		
		// 1.b Creating the 2nd array.
		System.out.println("Section 1.b");
		int ages2[] = new int[9]; // The ages2 array has 9 elements.
		System.out.println("The ages2 array is:  ");
		for (int j = 0; j < ages2.length; j++) {
			ages2[j] = j + (int) (Math.random() * 100);	// Populating the array.
			System.out.print(ages2[j] + " "); // Printing the array, for verification.
		}
		System.out.println();
		System.out.println("The array length is " + ages2.length); // Verifying the array length (9)
		int ages2Alt = ages2[ages2.length-1] - ages2[0]; // Subtracting the first element value from the last element value.
		ages2[ages2.length-1] = ages2Alt;				//Re-assigning the last element with its new value.  This shows that this same programming construct works, regardless of array length.
		System.out.println("The altered array is:  ");
		for (int k = 0; k < ages2.length; k++) {
			System.out.print(ages2[k] + " ");	//Printing the contents of the altered array, ages.
		}										
		// Section 1.c Obtaining the average age of ages2.
		System.out.println();
		System.out.println();
		System.out.println("Section 1.c");
		int avgAge2 = 0;
		for (int kl = 0; kl < ages2.length; kl++) { //This loop calculates the sum of ages2, preparatory to the average.
			avgAge2 = avgAge2 + ages2[kl];
		}
		System.out.println("The average age is " + (avgAge2 / ages2.length)); //This calculates and displays the average age.

		// Section 2.a Creating a String array, and calculating the average number of letters per word.
		System.out.println();
		System.out.println("Section 2.a");
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"}; // Creating and initializing the array.
		double totalLetters = 0;
		for (String name : names) {
			totalLetters = totalLetters + name.length(); // Collecting the sum of the length of each element in the names array.
		}
		System.out.println("The total number of letters is " + totalLetters);
		double avgLength = (totalLetters / names.length);  // Calculating the average name length by dividing the sum of the lengths by the length of the array (in elements).
		System.out.println("The average length of each word in the names array is " + avgLength); // Printing out the average length. 
		
		System.out.println();
		// Section 2.b Concatenating the names
		System.out.println("Section 2.b");
		String concatenatedNames = "";
		for (int lm = 0; lm < names.length; lm++) {
			concatenatedNames = concatenatedNames + names[lm] + " ";  // This concatenates the elements of array names.
		}
		System.out.println(concatenatedNames); // Printing them out
		
		System.out.println();
		System.out.println("Section 3");
		System.out.println("You access the last element of any array by using array[array.length-1].");
		
		System.out.println();
		System.out.println("Section 4");
		System.out.println("You access the first element of any array with array[0].");
		
		System.out.println();
		System.out.println("Sections 5 and 6");
		int[] nameLengths = new int[names.length]; // This defines the nameLengths array for Section 5.
		totalLetters = 0; // This resets totalLetters, from Section 2.a.
		for (int mm = 0; mm < names.length; mm++) {
			nameLengths[mm] = names[mm].length(); // This populates the nameLengths array with the lengths of the elements of the names array.
			totalLetters = totalLetters + nameLengths[mm]; // Collecting the sum of the length of each element in the names array, for Section 6, which I already did, in Section 2.a.
		}
		System.out.println("The sum of the elements of the names array is " + totalLetters);

		System.out.println();
		System.out.println("Section 7");
		System.out.println(section7("Hello", 5)); // This calls the section7 method.
		
		System.out.println();
		System.out.println("Section 8");
		System.out.println(section8("Randy", "Pettit")); // This calls the section8 method.
		
		System.out.println();
		System.out.println("Section 9");
		int[] section9InputArray = {25,30,40,50}; // This provides input for the section9 method.
		System.out.println("The input numbers are:  "); 
		for (int op = 0; op < section9InputArray.length; op++) {  // This displays the input numbers.
			System.out.print(section9InputArray[op] + " ");
		} // for
		System.out.println();
		System.out.println(section9(section9InputArray)); // This calls the section9 method.
		if (section9(section9InputArray)) {										// This provides clarification of the answer for Section 9.
			System.out.println("The Section 9 numbers are more than 100.");
		} else {
			System.out.println("The Section 9 numbers are less than or equal to 100.");
		} // if else
		
		System.out.println();
		System.out.println("Section 10");		
		double[] section10InputArray = {15.7,25.33,35.4,65}; // This provides input for the section10 method.
		System.out.println("The input numbers are:  "); 
		for (int pp = 0; pp < section10InputArray.length; pp++) {  // This displays the input numbers.
			System.out.print(section10InputArray[pp] + " ");
		} // for
		System.out.println();
		System.out.print("The average of the Section 10 array of double is:  ");
		System.out.println(section10(section10InputArray)); // This calls the section10 method.
		
		
		System.out.println();
		System.out.println("Section 11");
		double[] section11InputArray1 = {21,34,46,22}; // This provides the first input array for the section11 method.
		double[] section11InputArray2 = {2,4,8,13,20,40}; // This provides the 2nd input array for the section11 method.
		System.out.println(section11(section11InputArray1, section11InputArray2)); // This calls the section11 method.
		
		
		System.out.println();
		System.out.println("Section 12");
		boolean isHotOutside = true; // This declares and initializes the weather condition variable, isHotOutside, outside, for the Section 12 method, willBuyDrink.
		double moneyInPocket = 11.0; // This declares and initializes the amount of money you have in your pocket, as input to the Section 12 method, willBuyDrink.
		if (willBuyDrink(isHotOutside, moneyInPocket)) { // This calls the section12 method, named willBuyDrink(), with the decision being printed out.
			System.out.println("It's hot out, and I have enough money, so I will buy the drink.");
		} else {
			System.out.println("It's either not hot outside, or I don't have enough money, so I'm not buying the drink.");
		} // Section 12 if
		

		System.out.println();
		System.out.println("Section 13");
		System.out.println("This method will convert yards to meters, or meters to yards, based upon your selection.");
		System.out.println("Which measurement do you want to start with?  Enter yards or meters:  ");
		Scanner kb = new Scanner(System.in);				// This sets up the Scanner to collect user input.  
		String section13measure = kb.nextLine();			// This collects the user's choice of yards or meters as input.
		if (section13measure.equals("yards") || section13measure.equals("meters")) { // This does error checking on the user input.  Only selecting 'yards' or 'meters' will allow it to continue.
			System.out.println("Ok, how many " + section13measure + " do you want to convert?  "); // This prompts the user to enter the number of yards or meters they want to convert, as input.
			double section13InputValue = kb.nextInt();			// this collects the user's number of yards or meters they want converted.
			String oppositeSection13measure = ""; // This variable, and the following if statement, sets up the target measurement unit, for use in the output display after that.
			if (section13measure.equals("yards")) {
				oppositeSection13measure = "meters";
			} else {
				oppositeSection13measure = "yards";
			}
			System.out.println("The equivalent number of " + oppositeSection13measure + " is " + section13(section13measure, section13InputValue)); // This calls the section13 method and provides the output.
			kb.close(); // Closing the kb input variable.
		} else {
			System.out.println("You've provided invalid input. Please re-run this and select only either yards or meters.");
		} // Section 13 if.

		
	} //main
	
	public static String section7(String word, int n) {  // Defines the method for Section 7.
		String returnString = "";
		for (int nn = 0; nn < n; nn++) {
			returnString = returnString + word; // This performs the concatenation.
		} // for
		return returnString;
	} // section7 method
	
	public static String section8(String firstName, String lastName) { // Defines the method for Section 8.
		String fullName = "";
		fullName = firstName + " " + lastName; // This performs the concatenation to create the fullName.
		return fullName;
	} // section8 method
	
	public static boolean section9(int[] section9Array) { // Defines the method for Section 9.
		int section9sum = 0;
		boolean section9Answer = false;
		for (int oo = 0; oo < section9Array.length; oo++) { // This populates the section9Array.
			section9sum += section9Array[oo];  // This adds the elements of the array.
		} // for
		if (section9sum > 100) { // This tests whether the sum of the elements of section9Array > 100.
			section9Answer = true; // This sets section9Answer to true.
		} // if.
		return section9Answer;  
	} // section 9 method
	
	public static double section10(double[] section10Array) { // Defines the method for Section 10.
		double section10Sum = 0;
		for (int pq = 0; pq < section10Array.length; pq++) {
			section10Sum = section10Sum + section10Array[pq];  // This adds the elements of the array.
		} //for
		return section10Sum / section10Array.length; // This calculates the average of the elements of the array and then returns that figure to the call.
	} // section 10 method
	
	public static boolean section11(double[] section11Array1, double[] section11Array2) { // Defines the method for Section 11.
		boolean section11Answer = false;  // These declare and initialize the variables for the section11 method.
		double section11FirstSum = 0;
		double section11SecondSum = 0;
		double section11FirstAvg = 0;
		double section11SecondAvg = 0;
		for (int qq = 0; qq < section11Array1.length; qq++) {
			section11FirstSum += section11FirstSum + section11Array1[qq]; // This calculates the sum of the elements of section11Array1.
		} // for section11Array1
		for (int qr = 0; qr < section11Array2.length; qr++) {
			section11SecondSum += section11SecondSum + section11Array2[qr]; // This calculates the sum of the elements of section11Array2.
		} // for section11Array2
		section11FirstAvg = section11FirstSum / section11Array1.length; // This calculates the average of the elements of section11Array1.
		section11SecondAvg = section11SecondSum / section11Array2.length; // This calculates the average of the elements of section11Array2.
		if (section11FirstAvg > section11SecondAvg) { 					// This determines whether the average of the elements of section11Array1 is larger than that of section11Array2.
			section11Answer = true;
		} // if
		System.out.println("The average of the first array is " + section11FirstAvg + " and the average of the second array is " + section11SecondAvg);  // This provides clarification for the method11 answer.
		return section11Answer;  // This provides the boolean return for method11.
	} // section 11 method
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { // This defines the method for Section 12.
		boolean willBuyDrinkDecision = false; // This declares and initializes the return variable for Section 12.
		if (isHotOutside && moneyInPocket > 10.5) {						// These if statements determine whether to buy a drink, or not, based on the outside temperature and how much money you have.
				willBuyDrinkDecision = true;	// This makes the decision Yes.
		} // if									// All of the other possibilities (It's hot, but you don't have enough money, or it's cold, but you may or may not have enough money) result in a No decision.
		return willBuyDrinkDecision; // This returns the decision.
	} // section 12 method
	
	
	public static double section13(String section13measure, double section13InputValue) { // This defines the method for Section 13.
		double section13Answer = 1;
		if (section13measure.equals("yards")) { // For yards to meters conversion.
			section13Answer = section13InputValue * 0.9144; // Calculates the number of meters, given the input number of yards, based on https://www.metric-conversions.org/length/yards-to-meters.htm
		} else if (section13measure.equals("meters")) { // for meters to yards conversion.
			section13Answer = section13InputValue * 1.09361; // Calculates the number of yards, given the input number of meters, based on https://www.metric-conversions.org/length/meters-to-yards.htm
		} // else if
		return section13Answer;  // This returns the section13 method answer.
	} // section 13 method

} //Class
