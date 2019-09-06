package WhatToEatPackage;

import java.util.Scanner;

public class WhatToEat {
	public static void main(String [] args) {
		// declaring variables
		String eventType = "null";
		int partySize = 0;
		String mealSuggestion = "null";
		String preparationSuggestion = "null";
		boolean retry = true;
		String result = "null";
		
		//initializing scanner
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("What is your event type? (casual, semi-formal, or formal?)");
			System.out.print("Enter response: ");
			eventType = input.nextLine();
		
			retry = false;
			
			if (eventType.equals("casual")) {
				mealSuggestion = "sandwiches";
			}
			else if (eventType.equals("semi-formal")) {
				mealSuggestion = "fried chicken";
			}
			else if (eventType.equals("formal")) {
				mealSuggestion = "chicken parmesan";
			}
			else {
				//returning error if user inputs incorrect value
				System.out.println("Input not understood for event type, please type the event type exactly as shown. (case sensitive)");
				retry = true;
			}
		}
		while (retry == true);
		retry = true;
		do {
			System.out.println("How many are you cooking for?");
			System.out.print("Enter response: ");
			partySize = input.nextInt();
			
			retry = false;
			
			if (partySize == 1) {
				preparationSuggestion = "in the microwave";
			}
			else if (partySize <= 12) {
				preparationSuggestion = "in your kitchen";
			}
			else if (partySize > 12) {
				preparationSuggestion = "by a caterer";
			}
			else {
				//returning error if user inputs incorrect value
				System.out.println("Input not understood for party size, please type an integer number of guests.");
				retry = true;
			}
		}
		while (retry == true);
		//creating final string
		result = "Since you are hosting a " + eventType + " event for " + partySize + " participants, you should serve " + mealSuggestion + " prepared " + preparationSuggestion;
		System.out.println(result);
	}
}
