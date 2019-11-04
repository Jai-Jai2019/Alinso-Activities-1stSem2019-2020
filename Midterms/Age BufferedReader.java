import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

	public class AgeB {
		public static void main (String [] args) {

	
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		while(true) {
		try {
		System.out.println("What is Your Age? ");
		int age = Integer.parseInt(br.readLine());
		
		if (age >= 0 && age <= 3)
			System.out.println("You are a Baby!");
		else if (age >= 4 && age <= 12) 
			System.out.println("You are a Child");
		else if (age >= 13 && age <= 19) 
			System.out.println("You are a Teenager");
		else if (age >= 20 && age <= 32) 
			System.out.println("You are a Young Adult");
		else if (age >= 33 && age <= 45) 
			System.out.println("You are a Middle Aged");
		else if (age >= 46 && age <= 59) 
			System.out.println("You are a Adult");
		else if (age >= 60 && age <= 122) 
			System.out.println("You are a Senior");
		else if (age >= 0)
			System.out.println("Input error!");
		break;
			}
		catch (Exception e) {
				}
			}
		}
	}
