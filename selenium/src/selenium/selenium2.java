package selenium;//another class within same package


public class selenium2 extends selenium//selenium2 inherited selenium class of same package of type public
{
	int x=25,y=35;
	//if the fuction with same name is defined inside child class then
    //then child class function is called with child class class object
	//in this case to call parent function , object of parent class will be used
	public static void add_st()
	{
		System.out.println("selenium2");
	}
	public void add()
	{
		int c=x+y;
		System.out.println(c);
	}
	
	
	
	
	
	public static void main(String[] args) {
		selenium obj = new selenium();//object created to access non static member of parent class
		selenium2 obj2 = new selenium2();//object of selenium2 class can access non static member of parent class due to inheritance
		obj2.add();//parent class method called with child class object
		obj.add();//
		add_st();//parent class meth can be accessed with obejct
		
		selenium.add_st();//static can be called with class name
		selenium.d=50;
		
		
		
	}

}
