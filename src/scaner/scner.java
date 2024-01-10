package scaner;

import java.util.*;

public class scner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the id");
		byte id = sc.nextByte();
		
		
		System.out.println("Enter the name");
		String name = s.nextLine();
	    
	    
	    System.out.println("Enter the gender");
	    char gender = s.next().charAt(0);
	    
	    
	    System.out.println("The id is :"+id);
	    System.out.println("The Name is :"+name);
	    System.out.println("The gender is :"+gender);
	}

}
