/*
 * David Casarrubias-Mena
 * Joshua Cheeseman
 * COSC 201
 * October 14, 2015
 * 
 * This program compares the insertion and removal speeds of ArrayList and LinkedList
 * 
 * Observations: I notice that the insertion and removal time for ArrayList takes about 86 seconds to show up on the screen.
 * 				Which means that we can infer that a LinkedList is slower than an ArrayList when dealing with bigger numbers. 
 * 
 * For linked list I observed that it took around 3 hours for it to display the removal time. 
 * 				
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


public class LLPractice {
	
	public static void main(String [] args){
		ArrayList<Double>testList1 = new ArrayList<Double>();  // Array List type Double
		LinkedList<Double>testList2 = new LinkedList<Double>();  // LinkedList type Double
		
		
		testList1.add(7.5); // initializes Array List list1 with a double so list wont be empty and to fix error that appears if ArrayList is empty.
		testList1.add(4.1); // initializes Array List list1 with a double so list wont be empty and to fix error that appears if ArrayList is empty.
		testList2.add(6.2); // initializes LinkedList list2 with a double so list wont be empty and to fix error that appears if ArrayList is empty.
		testList2.add(5.1); // initializes Linked List list2 with a double so list wont be empty and to fix error that appears if ArrayList is empty.
		Random r = new Random();  // Random Generator
		
		long starttime = System.nanoTime();  // starts timer

		// testList1 code ArrayList
		for(int i = 0; i < 1000000; i++){  // for loop that continues looping as long as i is less than 1000000
			double num = r.nextInt(1000000) + 1; // generates number between 1 and 1000000 and stores it in variable num
			int num2 = r.nextInt(testList1.size() - 1);  //inserts numbers into random indices
			testList1.add(num2,num);  // adds random numbers generated to testList1 array list
		
		
		//System.out.println(testList1.get(num2)); // test to make sure numbers are randomly printing
		
			
		}
		for(int i = 0; i < 250000; i++){ // for loop that continues to loop as long as i is less than 250000
			double number = r.nextInt(250000) + 1; // generates random number between 1 and 250000
			int rnum = r.nextInt(testList1.size() - 1); // inserts numbers into random indices
			
			testList1.remove(r.nextInt(testList1.size() - 1)); // removes 250000 elements from list at Random indices
		}
			
			long totaltime = System.nanoTime() - starttime; // create variable totaltime and set equal to time minus start time
			System.out.println("ArrayList insertion and removal time: " + totaltime + " ns");  // prints out the time it took ArrayList in nano seconds
			
			
			starttime = System.nanoTime();  //starts time for LinkedList
			//testList2 code LinkedList
	for(int i = 0; i < 1000000; i++){
		
		double x = r.nextInt(1000000) + 1;  // generates number between 1 and 1000000
		int y = r.nextInt(testList2.size() - 1); // inserts numbers into random indices
		testList2.add(y,x);  // adds numbers generated to the LinkedList
			
		
			//System.out.println("LinkedList" +testList2.get(y));  testing numbers being generated
	}
	for(int i = 0; i < 250000; i++){ 
		double x = r.nextInt(250000) + 1;  // 
		int y = r.nextInt(testList2.size() - 1); // inserts numbers into random indices
		testList2.remove(r.nextInt(testList2.size() - 1));  // removes 250000 elements from Linked list at random indices
	}
	totaltime = System.nanoTime() - starttime;
	System.out.println("LinkedList insertion and removal time: " + totaltime + " ns"); // prints out total time of LinkedList in nanoseconds
	}
	}
