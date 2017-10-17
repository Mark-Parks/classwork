package arrays;

import java.util.Arrays;

public class ArraysMain {

	private String[] suits;
	private String[] values;
	
	public ArraysMain() {
		tuesdayMethods();
	}
	
	private void tuesdayMethods() {
		int [] orderTest = {1,2,3,4,5,5,5,5,5,5};
		System.out.println(Arrays.toString(orderTest));
		System.out.println(longestConsecutiveSequence(orderTest));
	}

	private int longestConsecutiveSequence(int[] arr) {
		int count = 1;
		int max = 1;
		for(int i = 0; i < arr.length; i++) {
			while(i + count < arr.length && isConsecutive(subArray(arr,i,count))) {
				count++;
			}
			if(count > max) {
				max = count;
			}
			i = i + count-1;
			count = 1;
		}
		return max;
	}
	
	private boolean isConsecutive(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			if(!(arr[i] == arr[i+1]-1)) {
				return false;
			}
		}
		return true;
	}
	
	private void cycleThrough(int[] arr, int n) {
		for(int i = 0; i < n; i++) {
			frontToBack(arr);
		}
	}

	private void frontToBack(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			swap(arr,i,i+1);
		}
	}

	private void warmUpMethods() {
		int [] orderTest = {1,2,3,4,5,6,7,8,9,10};
		reverseOrder(orderTest);
		System.out.println(Arrays.toString(orderTest));
		System.out.println(Arrays.toString(subArray(orderTest,3,4)));
		
	}
	
	public void cardMethods() {

		suits = new String[4];
		suits[0] = "Clubs";
		suits[1] = "Hearts";
		suits[2] = "Diamonds";
		suits[3] = "Spades";
		values = new String[13];
		for(int i = 0; i < values.length; i++) {
			values[i] = ""+(i+1);
		}
		values[0] = "Ace";
		values[12] = "King";
		values[11] = "Queen";
		values[10] = "Jack";
		printDeck();
		
		
	}
	
	private int[] subArray(int[] arr, int start, int length) {
		int[] newArr = new int[length];
		for(int i = 0; i < length; i++) {
			newArr[i] = arr[start+i];
		}
		return newArr;
	}
	private void reverseOrder(int[] arr) {
		for(int i = 0; i < arr.length/2; i++) {
			swap(arr,i,arr.length-1-i);
		}
	}
	private String[] printDeck() {
		String[] deck = new String[52];
		int index = 0;
		for(int i = 0; i < suits.length; i++) {
			for(int j = 0; j < values.length; j++) {
				deck[index] = values[j]+" of "+suits[i];
				index++;
			}
		}
		return deck;
	}
	private void shuffle(int[] arr){
		for(int i = 0; i < arr.length; i++) {
			swap(arr, i, (int)(Math.random()*arr.length));
		}
	}
	private void swap(int[] arr, int j, int k) {
		int placeholder = arr[j];
		arr[j] = arr[k];
		arr[k] = placeholder;
	}
	
	
	private void populate1ToN(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
	}
	private void countOccurences(int[] arr, int start, int end) {
		//why create array with this length
		int[] counter = new int[end - start + 1];
		for(int value: arr ) {
			//why value - start
			counter[value - start]++;
		}
		for(int i = 0; i < counter.length; i++) {
			System.out.println("the value "+(i+start)+" was rolled "+counter[i]+" times.");
		}
	}
	//this method populates arr with rolling 2 dice
	private void populate(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = diceRoll(3);
		}
	}

	public void arrayNotes() {
		//two ways to contruct array
		int[] firstWay = {0,1,2,3,4,5};
		//only will work with declaration
		
		String[] secondWay = new String[5];
		//secondWay[0] = 1;
		//secondWay[1] = 10;
		
		//Two ways to iterate through an array
		for(int i = 0; i < secondWay.length; i++) {
			System.out.println("the #"+i+" element is "+secondWay[i]);
		}
		//for each int in secondWay
		for(String value: secondWay) {
			System.out.println("Element is "+value);
		}
		//primitive arrays are auto populated with zero
		//object arrays are null
	}
	
	public static void main(String[] args) {
		ArraysMain sample = new ArraysMain();
		//1.Arrays are collections of primitives and Objects
		//This is the only collection of primitives
		
		//Size cannot be edited
		
		//Elements of an array are references to objects
		//Changing an element of an array changes the reference
		//not the object
	}
	/**
	 * returns the result after rolling n number of dice
	 * @param n
	 * @return
	 * 
	 */
	public int diceRoll(int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += (int)(Math.random() *  6) + 1;
		}
		return sum;
	}
}
