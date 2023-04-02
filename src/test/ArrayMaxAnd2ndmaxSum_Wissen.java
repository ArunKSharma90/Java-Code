package test;

public class ArrayMaxAnd2ndmaxSum_Wissen {

	static int high = 0;
	static int secHigh = 0;
	static boolean flag;

	public static void main(String[] args) {
		System.out.println("starting ....");
		int[] arr = { 5, 7, 19, 25, 67 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					flag = false;
					break;			
				}	
			}
		
				if (flag==true) {
					System.out.println(arr[i] + "is the highest value in Array");
					high = arr[i];
					
				}
			
		}
		
	}

}
