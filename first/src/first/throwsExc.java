package first;

import java.io.IOException;

class banking{
	int balance=10000;
	void withdraw(int amt) throws IOException{ //checked exception//
		int diff=balance-amt;
		if(diff<5000) {
			IOException io=new IOException();
			throw io;
			
			//System.out.println("the balance is low");
			//NullPointerException ne=new NullPointerException();//unchecked exception.
			//throw ne;
			
		
		}
		else {
			balance=balance-amt;
			System.out.println("the balance is: "+ balance);
		}
	}
}
public class throwsExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		banking b=new banking();
		//b.withdraw(2000);
		try {
		b.withdraw(2000);
		b.withdraw(3000);
		b.withdraw(900);

	}
		catch(Exception e) {
			System.out.println("Exception for banking"+e);
		}

}
}
