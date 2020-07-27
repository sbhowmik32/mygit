package inheritance;

public class B extends A {
	
	public void demo() {
		
	
	System.out.println("B class demo function");
	}
	public static void main(String[] args) {
		
		B b=new B();
		b.msg();
		System.out.println(b.age);
	}

}
