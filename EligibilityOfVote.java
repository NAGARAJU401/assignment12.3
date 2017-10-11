package Electionvoting;

import java.util.Scanner;

//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
//package is Electionvoting
public class EligibilityOfVote {
	//public : members which can access as public,public members are visible to all other classes.
			//class : is a context of java that are used to create objects and to define object data types and methods.
			//classes are the basics of opps(object oriented programming)
	static int age;//static is a keyword which identifies class related thing
    //initializing age
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
			//static used to prepare a field,method or inner classes as a class field.
			//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
			//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		 System.out.print("enter age");
		//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
		 Scanner sc =new Scanner(System.in);//taking new scanner sc
		    int Scanner=sc.nextInt();
		    
	     if(age<18) { //age lessthan 18
	    	
	      System.out.println("not eligible for vote"); 
	      //system is used to return code
       //out is a static number
       //println is used to print text and gives output
      
	     }
	    	 else {
	    	 
	    {
	      System.out.println("eligible for vote");  
	      //system is used to return code
       //out is a static number
       //println is used to print text and gives output
      
	    	 
	}}
	}

}
