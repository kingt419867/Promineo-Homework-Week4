package week4LabsAndHomework;

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
		int totalLetters = 0;
		for (String name : names) {
			totalLetters = totalLetters + name.length(); // Collecting the sum of the length of each element in the names array.
		}
		System.out.println("The total number of letters is " + totalLetters);
		double avgLength = Math.round(totalLetters / names.length);  // Calculating the average name length by dividing the sum of the lengths by the length of the array (in elements).
		System.out.println("The average length of each word in the names array is " + avgLength); // Printing out the average length. ** Not sure why it's not finding the real average, 3.8333.
		
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
		
		
		
	} //main

} //Class
