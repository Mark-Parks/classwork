package arrays2D;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Array2DSampler test = new Array2DSampler();
	}
//	Important to check ArrayIndexOutOfBoundsExceptions
	private static void changeNeighbors(int[] arr, int i) {
		if(i< arr.length) arr[i] = arr[i] + 1;
		if(i >= 1) arr[i-1] = arr[i-1] - 1;
		if(i <= arr.length - 2)arr[i+1] = arr[i+1] - 1;
	}

}
