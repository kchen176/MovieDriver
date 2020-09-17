import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		Scanner keyboard = new Scanner(System.in);
		Movie test = new Movie();
		
		boolean cont = true;
		
		String rating;
		
		String choice;
		
		int soldTickets;
		
		while(cont) { 
		
		System.out.print("Enter the name of the movie ");
		
		String title = input.nextLine();
		
		test.setTitle(title);
		
		System.out.print("Enter the rating of the movie ");
		
	    rating = input.nextLine();
		
		test.setRating(rating);
		
		System.out.print("Enter number of tickets sold for the movie ");
		
		soldTickets = input.nextInt();
		
		test.setSoldTickets(soldTickets);	
		
		System.out.println(test.toString());
		
		System.out.print("Do you want to enter another? (y or n) ");
		
		choice = keyboard.nextLine();
		
		
		if (choice.equalsIgnoreCase("y")) {
			
			cont = true;
			
		} else if (choice.equalsIgnoreCase("n")) { 
			
			cont = false;
			
		} 
		
		}  
		System.out.println("Goodbye");
	}

}
