package StringProgram;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="welcome";
		
//		for(int i =s.length()-1;i>=0;i--) {
//			
//			System.out.print(s.charAt(i));
//		}
		
		char[] a=s.toCharArray();
		
		for(int i =a.length-1;i>=0;i--) {
			
			System.out.print(a[i]);
		}

	}

}
