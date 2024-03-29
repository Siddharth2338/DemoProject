package Exception;

public class ExceptionOrder {

	public static void main(String[] args) {
		
		//ExceptionOrder.m1();
		System.out.println(m1());
	}
		
	public static int m2() {
		
		try {
			System.out.println(10/0);
			return 1;
		}catch(ArithmeticException e) {
			
			return 3;
		}catch (Exception e){
			return 2;
		}
	}
		
		 @SuppressWarnings("finally")
		public static int m1() {
			
		try {
			System.out.println(10/0);
			return 1;
		}catch (Exception e){
			return 2;
		}
			finally {
			//System.gc();
			return 3;
		}
	
		 
	
}
}
