package assignmentTwo;

import java.util.Scanner;

public class Ontariolicense {
int age;
String currentLevel, alreadyHolder;
Scanner sc = new Scanner(System.in);
void status() {
	
	//check current level
	if (alreadyHolder.equals("yes")) {
		System.out.println("enter your current license:\nG1\nG2\nG");
	}
	currentLevel = sc.next();
	 if(currentLevel.equals("G1"))
	{
		System.out.println("person can apply for G2 OR G");
	}
	 else if(currentLevel.equals("G2")){
System.out.println("person can apply for G");		 
	 }
	 else 
	 { System.out.println("INVALID LICENSE");		 
		 	 }
 }
else {
		 
	System.out.println("enter age"); 
}

}
