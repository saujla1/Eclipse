package first;
class A{
	  int b=2;
	  A(){
		  
	  }
	void showA() {
		int a=1;
		System.out.println("This is show A "+a+" "+b);
	}
	
}
class B extends  A{
	int b=3;
}

public class InheritanceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println();
B show=new B();

show.b=5;
show.showA();
	}

}
