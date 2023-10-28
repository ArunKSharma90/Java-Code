package ArrayPgms;
import java.util.Arrays;

/*1. Find the max number from an array and print it.  Also Print the index of it.
E.g.: 
input: [2,5,1,9,6]
output: 9*/
public class Sel1_MaxOfArray {
	public static void main(String[] args) {
		int[] arr = { 22, 5, 6, 9, 1, 10, 51, -7, 87, -6,89 };
		System.out.println("The given Array is => " + Arrays.toString(arr));
		
		int max = arr[0], min = arr[0];
		int maxIndex = 0, minIndex = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
			else if(arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
		}
		System.out.println("max value of array is - " + max);
		System.out.println("Index of max value of the array is - " + maxIndex);
	
		System.out.println("min value of array is - " + min);
		System.out.println("Index of min value of the array is - " + minIndex);
	}
	
}
