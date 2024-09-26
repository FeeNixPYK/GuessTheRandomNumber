package codingbat;
import java.util.Random;
import java.util.Scanner;

public class RandomNumGame {
	
		public static void main(String[] args) {
			Random random = new Random();
			int num = random.nextInt(100)+1;
			
			Scanner scanner = new Scanner(System.in);
			int userinput = 0;
			int counter =0;
			System.out.print("Guess The number between 1 to 100: ");
			
			
			while (userinput!=num) {
				
				if(scanner.hasNextInt()) {
				userinput = scanner.nextInt();
				if(userinput<num) {
					System.out.println("Too Low, go higher: ");
				
			}	else if (userinput>num) {
				System.out.println("Too High, go lower: ");
			}
				counter++;
				}else {
					System.out.println("Invalid input, try again: ");
					scanner.next();
				}
			}
			System.out.print("Congratulations!! you guessed right in " + counter + " moves");
			scanner.close();	
	}
}
