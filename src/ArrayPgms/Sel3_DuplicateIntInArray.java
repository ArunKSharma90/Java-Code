package ArrayPgms;
public class Sel3_DuplicateIntInArray {
	/*
	 * 4. Find how many numbers are repeated in an integer array and print the count
	 * E.g.: input: {2,5,1,9,6,1,8,6,5,3,7} output: 3
	 */		
	public static void main(String[] args) {
		
		int arr[] = {2,5,1,9,6,1,8,6,5,3,7,5,6};
		int count =0;
		for(int i=0; i< arr.length; i++) {
			
			for(int j=i+1; j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					count++;
					System.out.println(arr[i]);
					break;
				}
			}
		}
		System.out.println("Total no. of duplicate/repeat element in Array is => " + count);
	}

}
