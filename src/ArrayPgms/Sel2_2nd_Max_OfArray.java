/**
 * 
 */
package ArrayPgms;

/**
 * 2. Find the second highest number from an array and print it along with the
 * index E.g.: input: [2,5,1,9,6] output: Second highest number is - 6 & the
 * index for second number is 4
 */
public class Sel2_2nd_Max_OfArray {

	public static void main(String[] args) {
		int arr[] = { 20, 2, 11, 9, 63, 1, 8 };
		int max = arr[0];
		int secMax = arr[0];
		int maxIndex=0, secMaxIndex=0;
		
		System.out.println("the given array is " );
		for(int a: arr) {
			System.out.print(a + "\t");
		}
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > max) {		
				secMax = max; //63
				max = arr[i]; //81
				maxIndex = i;
			}
			else if (arr[i] > secMax ) {
				secMax = arr[i];
				secMaxIndex = i;
			}
		}
		System.out.println();
		System.out.println("Max value is => " + max);
		System.err.println("Index of Max value is => " + maxIndex);
		System.out.println("Second Max value is => " + secMax);
		System.err.println("Index of Second Max value is => " + secMaxIndex);
		
	}

}
