package first;

class C{
	C(){
		System.out.println("This is class C constructor");
	}
	int classCmethod() {
		int i=10;
		return i;
	}
}

class D extends C{
	D(){
		System.out.println("This is class D constructor");
	}
	void test(){
		System.out.println("This is not a constructor. It is inside class D");
	}
}

class E extends D{
	E(){
		System.out.println("This is class E constructor");
		
	}
	void test2() {
		System.out.println();
	}
}
public class Constructors {

	public static void main(String[] args) {
		E classE=new E();
		//classE.D();//constructor cannot be inherited.
		classE.test();//But a method can be inherited.
		System.out.println(classE.classCmethod());//method with a return value.
		
		
	}

}
