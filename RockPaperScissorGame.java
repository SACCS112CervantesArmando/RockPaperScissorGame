import java.util.Scanner;

public class RockPaperScissorGame {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		String userchoice;
		
	System.out.print("Lets play Rock, Paper, Scissors!\nChoose your move: ");
		userchoice = input.next();
	
	if (userchoice.equalsIgnoreCase("rock") )
		System.out.print("The computer chose paper, you lose!");
		
	if (userchoice.equalsIgnoreCase("paper"))
		System.out.print("Great minds think alike, the computer chose paper, it's a tie!");
	
	if (userchoice.equalsIgnoreCase("scissors"))
		System.out.print("The computer chose paper, you win!");
	
		
		
	}
}
