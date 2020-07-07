//NOTE multiple inheritance NOT allowed


package selenium;
/*
//import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;//Scanner is a class is used to input from keyboard
*/
public class selenium {
	
	//inheritance
     
	public int x=10,y=13;
	public static int d=25;//static variable can be used for entire class
	
	public void add()
	{int c=x+y;//inside non static function , we can static and non static variables
	
	System.out.println(c);
	}

	public static void add_st()//**static method can be defined only outsude of main method
	{
		int c=d;//inside static only static variable can be used
		
	System.out.println(c);
	}
	public static void main(String[] args) throws IOException {
		int g=90,h=100;
		selenium se=new selenium();
		//System.out.println(d);//static variable can only be called with or without object
		//System.out.println(se.y);//non static variable can only be called with object
		//selenium.add_st();//static can be called with class name
		
		//se.add();//non static function call using object
		//add();  can't call non static fun without objectif object is out of main defined
	    //se.add_st();//static can be called with or without object
		//add_st();//called static without object
	
		
		//Scanner scan = new Scanner(System.in);//Scanner is predefined class under java.util.Scanner
		/*System.out.println("enter ur name");//scan is an obj of Scanner
		String name = scan.nextLine();//nextLine() is a method to input complete data data
		System.out.println("ur name is :"+ name);//next() inputs word only from a line
		String city =scan.next();
		System.out.println("ur city is :"+ city);
		System.out.println("");// to give a space of one line
		System.out.println("enter ur no. is :");
		long ph = scan.nextLong();
		System.out.println("ur no. is :"+ ph);
		int id = scan.nextInt();
		System.out.println("ur id is :"+ id);
		
		double marks = scan.nextDouble();
		System.out.println("ur marks is :"+ marks);
		boolean value = scan.nextBoolean();
		System.out.println("ur value is :"+ value);
		char a = scan.next().charAt(2);//here next() is the method nd charAt(2) is the option nd value of parameter is showing index 2nd means 
		                               //it will consider 3rd letter from a word
		System.out.println("ur a is :"+ a);
		for (int i=1;i<=3;i++) 
		{
			System.out.println("enter ur 10 digit ph no.");
		long ph = scan.nextLong();
		System.out.println("ur no. is :"+ ph);
		}
		int a=10,b=20;
		System.out.println("ur no. is :"+(a+b));
		System.out.println("a is ="+a+"\nb is ="+b);
		System.out.println(a+b);*/
		
		//File fileobject=new  File("C:\\Users\\Infosys\\Desktop\\java.txt");//use \\ or / for path
		                                                                   //File is the class; File() is the method to access directories
		//File fileobject=new  File("C:\\Users\\Infosys\\Desktop\\java.xls");
		//File fileobject=new  File("C:\\Users\\Infosys\\Desktop\\java.pdf");
		//File fileobject=new  File("C:\\Users\\Infosys\\Desktop\\java.doc");
		
		//fileobject.mkdir();
		//fileobject.delete();//name not case sensitive
		//fileobject.createNewFile();//throws ioexception mean if path(mention drive) is available then it will create file otherwise ignore creating 
		
		//Note: using file object we can create, delete all type of files, but can't conduct internal operations for all files like edit, written, read
		//Note: for internal operation use word,doc,pdf internal object
		
		//open the the txt file in read mode
		//FileReader ob=new FileReader("C:\\Users\\Infosys\\Desktop\\java.txt");
		/*
		//read data from opened file
		BufferedReader br = new BufferedReader(ob);//pass ob as argument in bufferedreader
		
		String line; //line variable of type string to store red data
		while((line=br.readLine())!=null)//chking red data in line should not be equal to null
		{
		System.out.println(line);
		}
		br.close();//to realease the mem occupied by the ob and br
		ob.close();
		*/
		/*
		//To write data to a text file
		FileWriter file= new FileWriter("C:\\Users\\Infosys\\Desktop\\java.txt");
		//To write data in file
		BufferedWriter wr= new BufferedWriter(file);
		String data="welcome to selenium world";
		wr.write(data);//overwriting
		wr.close();//must to close bec it means save and close
		file.close();//close
		*/
		/*
		//open file in read mode
		FileReader rd= new FileReader("C:\\Users\\Infosys\\Desktop\\java0.txt");
		BufferedReader br= new BufferedReader(rd);//to read data
		
		File wr= new File("C:\\Users\\Infosys\\Desktop\\java1.txt");
		wr.createNewFile();
		//open file in write mode
		FileWriter wrr=new 	FileWriter("C:\\Users\\Infosys\\Desktop\\java1.txt");
		BufferedWriter bw=new BufferedWriter(wrr);//to write data
		
		String line;
		
		while((line=br.readLine())!=null)
		{
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
		rd.close();
		wrr.close();
	    */
		/*
		int a=5,b=0,c=9;
		 try 
		 {  c=a/b;
		 System.out.println(c);
		 }
		 catch(ArithmeticException e1)
		 {
			 System.out.println("divide by zero error"); }*/
		/*
		//caomparision 
		System.out.println("JAVA".equals("JAVA"));//COMPARISION
		int a=7;
		Integer x=a;
	    System.out.println(x.compareTo(6));//returns 1
	    System.out.println(x.compareTo(8));//returns -1
	    System.out.println(x.compareTo(7));//returns 0
	
	    System.out.println(Math.random());//returns random no.
	    Date mydate = new Date();//date is class mydate is created object 
	    System.out.println(mydate);//returns date
	    */
		
		//function calling by (1) invoking object(on static method) and (2) without invoking object done with static method
		
		
	    //calling fuction using invoking object
		/*
		selenium ob= new selenium();
		int r=ob.add(25,30);
		System.out.println(r);*/
		/*
		//calling staic function
	   int r= selenium.add();
	    System.out.println(r);
	    System.out.println(selenium.add());//with class name
	    System.out.println(add());//without class name
	    int v=add();//without class name
	    System.out.println(v);
		*/
	
	/*
	public int add(int a,int b)
	{
		int result=a+b;
		return result;
		
	}
      */
	
	//calling fuction without wihtout invoking object can be done with static fuction
	// can be done by calling fuction with class name outside class and inside class without class name
	/*
		public static int add()
	{
		int a=20,b=10;
		int result=a+b;
		return result;
		
	}
	
	*/
	/*
	//for calling in class2
	public static int add()
	{
		int a=20,b=10;
		int result=a+b;
		return result;
		
	}
	
	*/
	/*
	//JAVA predefined methods
	               // 1)string method
                   // 2)number meth
                   // 3)character meth
	//1) isLetter : give boolean o/p whether the value is letter(alphabet) or not
	char a='w';
	System.out.println(Character.isLetter('w'));//true
	System.out.println(Character.isLetter('1'));//false
	System.out.println(Character.isLetter('a'));//true
	System.out.println(Character.isLetter('*'));//false
	
	//isDigit() returns weather the value is number or not
	
	System.out.println(Character.isDigit('5'));//true
	System.out.println(Character.isDigit('w'));//f
	System.out.println(Character.isDigit('%'));//f
	System.out.println(Character.isDigit('1'));//true
	
	System.out.println(Character.isLowerCase('1'));//f
	System.out.println(Character.isLowerCase('w'));//true
	System.out.println(Character.isLowerCase('A'));//f
	
	System.out.println(Character.isUpperCase('1'));//f
	System.out.println(Character.isUpperCase('w'));//f
	System.out.println(Character.isUpperCase('A'));//true
	System.out.println();
	//Array method
	//1) lenth of array
	int x[]= {10,20,30,50};
	String y[]= {"dinesh","rohit"};
	System.out.println(x.length);//4
	// copy array to srting
	String str=Arrays.toString(x);
	System.out.println(Arrays.toString(y));
	System.out.println(str);
	System.out.println();
	
	
	String str1=" Selenium ";
	String str4="Testing";
	String str3="Testing";
	String str2="selenium";
	String str5="Selenium";
	
	//string concatenation using + operator
	System.out.println(str1+str2);
	
	//using concat method
	System.out.println(str1.concat(str2));
	
	System.out.println("dinesh"+" taak");
	System.out.println("dinesh".concat(" taak"));
	System.out.println("dinesh"+1+2);
	System.out.println(4+3+"dinesh");
	
	//comparison using relational == operator
	System.out.println(str1==str2);//f
	System.out.println("Selenium"=="selenium");//f
	System.out.println("Selenium"==" Selenium");//f
	System.out.println("Selenium"=="selenium");//f
	System.out.println(str3==str4);//f
	//two way comparion
	System.out.println(str1.equals(str2));//f
	System.out.println(str3.equals(str4));//t
	
	//three way comparison
	System.out.println("sel".compareTo("Sel"));//+
	System.out.println(str3.compareTo(str4));//0
	System.out.println(str1.compareTo(str2));//-
	System.out.println(str5.compareTo(str2));//-
	*/
	/*
		String str1=" SELENIUM ";
		String str4="Testing";
		String str3="Testing is done";
		String str2="selenium";
		String str5="Selenium";
		
	System.out.println(str5.charAt(5));//i
	//System.out.println(str5.charAt(11));//will give runtime error
	
	System.out.println(str5.equalsIgnoreCase(str1));//false due space before selenium
	System.out.println(str5.charAt(2));//t
	System.out.println(str2.toUpperCase());//i
	System.out.println(str1.toLowerCase());//lower
	System.out.println(str2.substring(3));//enium
	System.out.println(str2.substring(3,6));//eni
	
	System.out.println(str1.endsWith("ium"));//false due to lower case so it chks 2 way comparison
	System.out.println(str2.endsWith("nium"));//t
	System.out.println(str3.endsWith("done"));//t
	System.out.println(str3.endsWith("is"));//false ,only chk ends with word not inbetween
*/
	/*
	//arrray
	int a[];//array declared 1st method
	a= new int [5];//size defined
	a[0]=10;
	a[1]=30;
	a[2]=60;
	System.out.println(a[0]+a[2]);
	
	//2nd
	
	int []a=new int[3];
	a[0]=10;
	a[1]=30;
	a[2]=60;
	System.out.println(a[0]+a[2]);
	
	int a[]= {10,20,30};
	char b[]= {'d','v','f'};
	System.out.println(a[2]);
	System.out.println(b[2]);
	System.out.println(b[2]+b[0]);
	
		
    // use of absolute fuction which gives +ve values or take modulus
	int a=-136;
	int b=33;
	double c=-1.24;
	double d=235.6;
	
	System.out.println(Math.abs(a));//136
	System.out.println(Math.abs(b));//33
	System.out.println(Math.abs(c));//1.24
	System.out.println(Math.abs(d));//235.6
	
	//round() round nearest to integer
	System.out.println(Math.round(a));//-136
	System.out.println(Math.round(b));//33
	System.out.println(Math.round(c));//-1
	System.out.println(Math.round(d));//235
	//max min
	System.out.println();//n

	System.out.println(Math.min(a,b));//a
	System.out.println(Math.min(b,a));//a
	System.out.println(Math.min(c,d));//c
	System.out.println(Math.max(a,b));//b
	System.out.println(Math.max(c,d));//d

	System.out.println(Math.random());//generate random no.
    */
	/*
	//array chk
	String b[]= {"Dinesh","kumar","taak"};
	boolean r1=Arrays.asList(b).contains("kumar");//true
	System.out.println(r1);
	
	//array is static ArrayList is dynamic(add/remove elements dynamically)
	 ArrayList <Integer> a=new ArrayList<>(); 
	//add elements
	a.add(10);
	a.add(20);
	a.add(40);
	a.add(5);
	
	System.out.println(a.size());//4 return size of array in term of number of lements stored
    System.out.println(a.get(1));//20
    int u=a.get(2);
    System.out.println(u);//
    a.remove(0);
    System.out.println(a.size());
    System.out.println(a.get(0));
    a.clear();
    System.out.println(a.size());
    a.add(0,10);
    a.add(60);
    a.add(1,20);//replace element at index 1
    a.add(30);
    a.set(1, 50);//replace element
    System.out.println(a.get(1));
    System.out.println(a.get(1)); 
    
    //type casting
    int a=10;
    byte b=30;
    
    int c=a+b;//implicit type casting is converted smaller to bigger
    System.out.println(c);
    byte d;
    //d=a+b; is error as implicitly int is not converted to byte
    d=(byte) (a+b);//so explicit type casting is done
    System.out.println(d);
    
    //to convert string to int
    //only convert digits assigned in "" //not convert alphabetic and special charater cxcept with "."
    
    String a="10";
    String b="20";
    String c="abc";
    String k="30.36";
    
    System.out.println(a+b);//1020 only concatenate here bec not converted to int
    
    int n1=Integer.parseInt(a);
    int n2=Integer.parseInt(b);
    
    System.out.println(n1+n2);//30 here o/p is 30 bec 10 and 20 converted to integer
    //int d =System.out.println(c);//here it will give run time error bec not convert string 
    
    System.out.println(Double.parseDouble(k));//convert to double
    
    */
		
	//Inheritance
		
	
		
    
    
    
    
    
    
    
    
    
    
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
	}	
}
