package first;
 class test{
	static int i=10;
	static int count=0;
	void first() {
		
		++i;
	}
	void second() {

		i++;
		count++;
	}
	void printit() {
		System.out.print("  i= "+i+ "\t"+ "c= "+count);
	}
}
public class StaticKey {

	public static void main(String[] args) {
		test one=new test();
		test two=new test();
		//one.i=13;
		//two.i=20;
		one.first();
		one.printit();
		two.printit();
		

	}

}