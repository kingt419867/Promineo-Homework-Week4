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
		
	
	static void beginEnd(int endNum) {
	    // WRITE YOUR CODE HERE
		List<Integer> newList = new ArrayList<Integer>();
		if (endNum > 0) {
			for (int i = 1; i <= endNum; i++) {
				newList.add(i);
			} //for
			System.out.println("The first number in the List is " + newList.get(0));
			System.out.println("The last number in the List is " + (newList.get(endNum-1)));
		} else {
			System.out.println("Your List cannot be created with a number less than one.");
		}


	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 
	}
	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		int endNum = 0;
		beginEnd(endNum);
		
	}
}