package first;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is main starting");
		int i=10;
		int p=20;
		int c=i+p;
		//
		int arr[] = {10,20,30,40};
		try {
		//System.out.println("print arr[2]"+arr[20]);
		System.out.println("division by zero"+i/0);

		}
		catch(Exception s) {
			System.out.println("Message from your exception: "+ s);
		}
		//catch(ArrayIndexOutOfBoundsException aref) {
			//System.out.println("array out of bounds exception");
		//}
		//catch(ArithmeticException ref) {
		//System.out.println("division by zero not possible");
		//}
		finally {
			System.out.println("the end!"+c);
		}
	}
}

	


