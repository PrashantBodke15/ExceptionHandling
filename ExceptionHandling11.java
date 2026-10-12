package ExceptionHandling;

public class ExceptionHandling11 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a = 90;
//		if(a<= 20) {
//			throw new ArithmeticException("Greater then 20");
//		}
//		System.out.println("less than 20");
//
//	}

	
	public static void checknum(int a) throws ArithmeticException{
		if(a>=20) {
			throw new ArithmeticException("greater than 20");
			
		}
		System.out.println("Smaller than 20");
	}
}



