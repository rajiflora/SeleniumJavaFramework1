package demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		int i = 0;
		try {
			System.out.println("Exception Handling Demo");
			i=1/0;
		}
		catch(Exception e){
			System.out.println("The Exception is : " +e.getMessage());
		}
		finally {
			System.out.println("The Value of I is "+i);
		}
		
	}

}
