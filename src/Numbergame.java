import java.util.Random;
import java.util.Scanner;
public class Numbergame {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random random=new Random();
		int min=1;
		int max=100;
		int attempts=10;
		int rounds=1;
		while(rounds<=3)
		{
			int generate_random=random.nextInt(max-min+1)+min;
			int userguess;
			int attemptsleft=attempts;
			
			System.out.println("Round no"+rounds);
			System.out.println("Guess a number between"+min+"and"+max+":");
			while(attemptsleft>0)
			{
				userguess=s.nextInt();
				attemptsleft--;
				if(userguess==generate_random)
				{
					System.out.println("Congratulations!! you have guessed the correct number:"+generate_random);
					break;
				}
				else if(userguess<generate_random)
				{
					System.out.println("Too low! make another try");
				}
				else
				{
					System.out.println("Too high! make another try");
				}
			}
			
		
				if(attemptsleft==0)
				{
					System.out.println("Sorry you didn't make correct guess.The correct number is "+generate_random);
				}
				System.out.println("Do you want to play another round? (y/n)");
				String playagain=s.next();
				if(playagain.equalsIgnoreCase("y"))
				{
					rounds++;
				}
				else
				{
					System.out.println("Thanks for playing!!");
					break;
				}
				
		}
		
		// TODO Auto-generated method stub

	}
}