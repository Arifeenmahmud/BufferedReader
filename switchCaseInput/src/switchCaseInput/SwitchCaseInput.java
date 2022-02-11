package switchCaseInput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwitchCaseInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = getInput("Enter Month Number: ");
		
//		int month = Integer.parseInt(s1);
		
		
		
		Month month = Month.JANUARY;
		
		switch (month) {
		case JANUARY:
			System.out.println("1st Month is January");  
			break;
		case february:
			System.out.println("2nd Month is February");  
			break;
		case march:
			System.out.println("3rd Month is March");  
			break;
		case APRIL:
			System.out.println("4th Month is April");  
			break;
		case MAY:
			System.out.println("5th Month is May");  
			break;

		default:
			System.out.println("you input the Wrong value");
			break;
		}
	}
	
	private static String getInput(String pronpt) { 
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print(pronpt); 
		System.out.flush(); 
		try { 
		return stdin.readLine(); 
		}
		catch (Exception e) { 
		return "Error: " + e.getMessage();
		} 
		}

}
