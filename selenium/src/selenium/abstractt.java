package selenium;

public abstract class abstractt {

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
	
	
	
	//abstract method
	//it means fuction with no body or dummy function
	//abstrct class can hv abstra ct method
	//it should hv atleat one concrete method
	//abtract class dont hv object
	//if we want to inherit abstract class then abstract function of parent class will hv to be defined
	//object of child class can be created in abstract parent class and all function of abstarct as well as child class can be called
	
	public abstract void add1();
	public static void main(String[] args) {
		
	
    //abstractt ob=new abstractt();  can not create object
	}

}
