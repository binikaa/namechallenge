package namechallenge;

import java.util.Scanner;

public class nameCompare {
	public static void main(String[] args)
{
		Scanner scr = new Scanner(System.in);
		String firstName,secondName,thirdName;
		
      System.out.println("Enter the first name");
      firstName = scr.nextLine();
      System.out.println("Enter the second name");
      secondName = scr.nextLine();
      System.out.println("Enter the third name");
      thirdName = scr.nextLine();
      
      int firstLength= firstName.length();
      int secondLength= secondName.length();
      int thirdLength= thirdName.length();
      
      if(firstLength==secondLength && firstLength==thirdLength)
      {
    	  System.out.println("All three names are of same length");
      }else if (firstLength>secondLength && firstLength> thirdLength)
      {
    	  System.out.println(firstName+" has the longest name");
      }else if (secondLength>firstLength && secondLength>thirdLength)
      {
    	  System.out.println( secondName+ " has the longest name");
      }else
      {
    	  System.out.println( thirdName + " has the longest name");
      }
       
    	  
}
}
