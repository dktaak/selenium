package selenium;

public class abstract_child extends abstractt {//The type abstract_child must implement the inherited abstract method abstractt.add1()

	public static void main(String[] args) {
		
abstract_child ob = new abstract_child();
ob.add();
ob.add1();
ob.add_st();
	}

	@Override
	public void add1() {//added unimplemented method
		System.out.println("abstract class function hv to be implemented to be inherited");
		
	}

}
