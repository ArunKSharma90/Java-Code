package test;

public class String2ndNonRepeatChar {
	static int count=0;
	static char ch1, ch2;
	
	public static void main(String[] args) { 
		String str = "aabcdefgh ijklmn";
		System.out.println(str.length());
		
		for(int i=0; i< str.length(); i++) {
		
			if((str.substring(i+1, (str.length()-i)).contains(""+str.charAt(i))==false) && 
				(str.substring(0, i-1).contains(""+str.charAt(i))==false))
					
					{
				++count;
			}
			
			if(count ==1) {
				ch1= str.charAt(i);
			}
					
			if(count ==2) {
				ch2= str.charAt(i);
				break;
			}
			
		}
		System.out.println("the 1st not repeat char is " + ch1);
		System.out.println("the 2nd not repeat char is " + ch2);			
	}
	
}
