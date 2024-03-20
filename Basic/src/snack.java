import java.util.Scanner;
import java.util.Random;
public class snack {
	public static void main(String[] args) {
		
	
		Random rc = new Random();
		int human = rc.nextInt(6);
		System.out.println("your turn");
		if (human == 1){
			System.out.println("take one step forward");

		}
		if (human == 2){
			System.out.println("take two step forward");
		}
		if (human == 3){
			System.out.println("take three step forward");
			if (human == 4){
				System.out.println("take four step forward");

			}
			if (human == 5){
				System.out.println("take five step forward");
			}
			if (human == 6){
				System.out.println("take six step forward");				
			}
			System.out.println("now its 2nd player  turn!");
			int player2 = rc.nextInt(3);
				if (player2 == 1){
						System.out.println("take one step forward");
				}
				if (player2 == 2){
						System.out.println("take two step forward");
				}
				if (player2 == 3){
						System.out.println("take three step forward");
				}
				if (player2 == 3){
						
				}
				if (player2 == 4){
					System.out.println("take four step forward");

				}
				if (player2 == 5){
					System.out.println("take five step forward");
				}
				if (player2==6){
					System.out.println("take six step forward");
				}
		}}}


		
