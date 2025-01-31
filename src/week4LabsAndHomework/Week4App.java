package week4LabsAndHomework;
import java.util.*;
import java.io.*;

public class Week4App {
//    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//
//       System.out.println(numbers.get(0));
//    }
//}

//	
//static void createList(int endNum) {
//		
//		List<Integer> listNums = new ArrayList<>();
//		
//		for (int i = 1; i <= endNum; i++) {
//		    listNums.add(i);
//		}
//	/***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
//	    // WRITE YOUR CODE HERE
//		//for (int j = 1; <= endNum; j++) {
//			System.out.println(listNums);
//		//System.out.println(endNum.get(j));
//		//}
//	
//		
//	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/	
//	}
	//public static void main(String[] args) {
//		//Scanner in = new Scanner(System.in);
//		int endNum = 10;
//		createList(endNum);
//	}
	
//	List<String> str = new ArrayList<>();
//
//	str.add("Nick");
//	str.add("Joe");
//	str.add("Michael");
//	str.add("Tyler");
//	str.add("Mike");
//
//	System.out.println(str.get(3));
		
		//Scanner in = new Scanner(System.in);
//		int indexVal = 6;
//		List<String> productList = new ArrayList<>(); 
//		
//		productList.add("Macbook");
//		productList.add("HP Notebook");
//		productList.add("iPhone 14");
//		productList.add("Acer Aspire");
//		productList.add("Windows Surface");
//		productList.add("Galaxy S23");
//	/***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
//	    
//	    // WRITE YOUR CODE HERE
//		if (indexVal >= 0 && indexVal < productList.size()) {
//			System.out.println(productList.get(indexVal));
//		} else {
//			System.out.println("No product can be found with that product number.");
//		}
		
//		static void wordReplace(List<String> tenWords, int num1, int num2, int num3) {
//		    // WRITE YOUR CODE HERE
//
//			if (num1 >= 0 && num2 >= 0 && num3 >=0 && num1 < tenWords.size() && num2 < tenWords.size() && num3 < tenWords.size()) {
//				List<String> threeWords = new ArrayList<String>();
//				String threeWordsOne = tenWords.get(num1);
//				String threeWordsTwo = tenWords.get(num2);
//				String threeWordsThree = tenWords.get(num3);
//				threeWords.add(threeWordsOne);
//				threeWords.add(threeWordsTwo);
//				threeWords.add(threeWordsThree);
//				System.out.println(threeWords);
//			} else {
//				System.out.println("Sorry, there was an error getting a number you requested.");
//			}
//		/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
//		}
//		public static void main(String[] args) {
//			//Scanner in = new Scanner(System.in);
//			int num1 = 0;
//			int num2 = 11;
//			int num3 = 3;
//			
//			List<String> tenWords = new ArrayList<String>();
//			tenWords.add("Bumfuzzle");
//			tenWords.add("Cattywampus");
//			tenWords.add("Widdershins");
//			tenWords.add("Gubbins");
//			tenWords.add("Lollygag");
//			tenWords.add("Malarkey");
//			tenWords.add("Wabbit");
//			tenWords.add("Impignorate");
//			tenWords.add("Yarborough");
//			tenWords.add("Bloviate");
//			
//			wordReplace(tenWords, num1, num2, num3);
		
//			List<Character> newChars = new ArrayList<>();
//			newChars.add('a');
//			newChars.add('b');
//			newChars.add('c');
//			newChars.add('d');
//			newChars.add('e');
//
//			char letter = newChars.remove(3);
//			System.out.println(letter);
			
			
//			static void sumList(int num1, int num2, int num3, int num4) {
//			    // WRITE YOUR CODE HERE
//				List<Integer> intList = new ArrayList<Integer>();
//				intList.add(num1);
//				intList.add(num2);
//				intList.add(num3);
//				intList.add(num4);
//				intList.add(num1 + num2 + num3 + num4);
//				System.out.println(intList);
//				
//			/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
//			}
//			public static void main(String[] args) {
//				//Scanner in = new Scanner(System.in);
//				int num1, num2, num3, num4;
//				num1 = 1;
//				num2 = 2;
//				num3 = 3;
//				num4 = 4;
//				sumList(num1, num2, num3, num4);
		
	
//	static void beginEnd(int endNum) {
//	    // WRITE YOUR CODE HERE
//		List<Integer> newList = new ArrayList<Integer>();
//		if (endNum > 0) {
//			for (int i = 1; i <= endNum; i++) {
//				newList.add(i);
//			} //for
//			System.out.println("The first number in the List is " + newList.get(0));
//			System.out.println("The last number in the List is " + (newList.get(endNum-1)));
//		} else {
//			System.out.println("Your List cannot be created with a number less than one.");
//		}
//
//
//	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 
//	}
//	public static void main(String[] args) {
//		//Scanner in = new Scanner(System.in);
//		int endNum = 0;
//		beginEnd(endNum);
		
	
//	static void halfList(List<String> words) {
//		  // WRITE YOUR CODE HERE
//			List<String> newList = new ArrayList<String>();
//			for (int i = 0; i <= words.size(); i += 2) {
//				newList.add(words.get(i));
//			}
//
//		/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
//			System.out.println("The old List is: " + words);
//			System.out.println("The new List is: " + newList);
//		}
//		public static void main(String[] args) {
//			//Scanner in = new Scanner(System.in);
//			String word1, word2, word3, word4, word5;
//			word1 = "Jeff";
//			word2 = "Karen";
//			word3 = "Donald";
//			word4 = "Duck";
//			word5 = "Mistletoe";
//			List<String> words = new ArrayList<>();
//			words.add(word1);
//			words.add(word2);
//			words.add(word3);
//			words.add(word4);
//			words.add(word5);
//			
//			halfList(words);

//		List<Integer> newInts = new ArrayList<>();
//		newInts.add(894);
//		newInts.add(-1);
//		newInts.add(1077);
//		newInts.add(43);
//		newInts.add(54329);
//
//		Collections.sort(newInts);
//		System.out.println(newInts);
	
	
//	static List squaredList(int num1, int num2, int num3, int num4, int num5) {
	    // WRITE YOUR CODE HERE
//		List<Integer> squaredNums = new ArrayList<>();
//		squaredNums.add(num1 * num1);
//		squaredNums.add(num2 * num2);
//		squaredNums.add(num3 * num3);
//		squaredNums.add(num4 * num4);
//		squaredNums.add(num5 * num5);
//		
//		return squaredNums;
//		
//	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/		
//	}
//	public static void main(String[] args) {
//		//Scanner in = new Scanner(System.in);
//		int num1 = 1;
//		int num2 = 2;
//		int num3 = 3;
//		int num4 = 4;
//		int num5 = 5;
//		System.out.println(squaredList(num1,num2,num3,num4,num5));
		

//	static void findLetter(List<Character> alphabet, char userLetter) {
//	    // WRITE YOUR CODE HERE
//		char test;
//		for (int i=0; i < alphabet.size(); i++) { // This can also use:  int valueIndex = alphabet.indexOf(userLetter);
//			test = alphabet.get(i);
//			if (test == userLetter) {
//				System.out.println(i);
//			}
//		
//		}
//	
//	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
//	}
//	public static void main(String[] args) {
//		//Scanner in = new Scanner(System.in);
//		char userLetter = 'n';  //in.next().charAt(0);
//		
//		List<Character> alphabet = new ArrayList<>();
//		for (int i = 97; i < (97+26); i++) { // This uses the ASCII codes to generate the lower cases of the alphabet.
//		    alphabet.add((char) i);
//		}
//		findLetter(alphabet, userLetter);
	

//	static void factors(int userNumber) {
//	    // WRITE YOUR CODE HERE
//		List<Integer> factorNum = new ArrayList<>(); // This code provides all the factors of a given number!
//		for (int i = 1; i <= userNumber; i++) {
//			if (userNumber % i == 0) {
//				factorNum.add(i);
//			}
//		}
//		System.out.println(factorNum);
//		
//	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
//	}
//	public static void main(String[] args) {
//		//Scanner in = new Scanner(System.in);
//		int userNumber = 12; //in.nextInt();
//		factors(userNumber);

	
//    public static void main(String[] args) { // This is an example of a LinkedList.
//        // Create a new LinkedList to store our shopping list
//        LinkedList<String> shoppingList = new LinkedList<>();
//
//        // Add some items to the list
//        shoppingList.add("Apples");
//        shoppingList.add("Bread");
//        shoppingList.add("Bananas");
//        shoppingList.add("Milk");
//        shoppingList.add("Cheese");
//        shoppingList.add("Eggs");
//        shoppingList.add("Ham");
//
//        //shoppingList.remove(2);
//
//        // Print out the entire shopping list using an enhanced for loop
//        System.out.println("Shopping List:");
//
//        for (String item : shoppingList) {
//            System.out.println(item);
//        }
//        
	
	public static void main(String[] args) {
	      
//        LinkedList<String> line = new LinkedList<String>();
//        line.add("Amanda");
//        line.add("Brad");
//        line.add("Cori");
//      
//        System.out.println("People in line: " + line);
//        System.out.println("First person in line was: " + line.get(0));
//        System.out.println("The last person in line was: " + line.get(2));
//    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
//        // WRITE YOUR CODE HERE
//        line.remove(0);
//        line.add("Danny");
//        
//    
//    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
//        System.out.println("People in line now: " + line);
//        System.out.println("Now the first person in line is: " + line.get(0));
//        System.out.println("The last person in line is: " + line.get(2));
//    

//	
//		Scanner kb = new Scanner(System.in);
//		ArrayList<String> names =  new ArrayList<>();
//		System.out.println("Please enter a name: Press 0 to exit");
//		
//		while(true) {
//			String name = kb.nextLine();
//			if(name.equals("0"))
//				break;
//			else {
//				names.add(name);
//				System.out.println("Please add another name or press 0.");
//			}
//		}
//		
//	System.out.println(names);
//		System.out.println("Type the phrase you want to encrypt here:  "); //This should take a phrase to encrypt, plus a number that becomes the hash.
//		Scanner kb = new Scanner(System.in);								//It then will determine the ASCII code for each letter, add the hash to it, and return the ASCII code of the new letter,
//		String inputPhrase = kb.nextLine();									//which it will put into a new HashMap.  The new HashMap is then printed out as the encoded phrase.
//																			//A second script will reverse that process and return the decrypted reply.
//		//String phrase = "The man with tHe Plan. The happy pu@#ppy doeth the time.";
//		HashMap<Character,Integer> charMap = new HashMap<>();		char [] letters = inputPhrase.toCharArray();
//		HashMap<Character>
//		for(char c : letters) {
//			
//		}
////			if (charMap.containsKey(c)) {
////				//charMap.put(c, charMap.get(c) + 1);
////			}
////			else {
////				charMap.put(c, 1);
//			
//			
//		System.out.println(inputPhrase);
//		System.out.println(letters);		
		
	}
}