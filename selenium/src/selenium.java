//import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;//Scanner is a class is used to input from keyboard

public class selenium {


	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);//Scanner is predefined class under java.util.Scanner
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
	
	
	
	}	
}
