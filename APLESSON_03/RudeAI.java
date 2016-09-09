import java.util.Scanner; //import Statement 

public class RudeAI
{
	public static void main(String[]args)
	{
		System.out.println("Hi, my name is RudeAI.");
		System.out.println("I'd like to ask you a few questions.");
		
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your name? ");
		
		String name = keyboard.next();
		
		System.out.println(name + "?!!! " + "Why would anyone name a baby that?");
		System.out.println("How old are you, " + name + "?" );
		
		int age = keyboard.nextInt();
		
		System.out.println("Oooo!!! " + age + " is getting up there.");
		System.out.println("What do you do for fun, " + name + "?");
		
		String activity = keyboard.next();
		
		System.out.println("I thought that only nerds like to " + activity + "?");
		System.out.println("What kind of music do you like?");
		
		String music = keyboard.next();
		
		System.out.println("Boooo!! I wouldn't wish the sound of " + music + " on my worst enemy.");
		System.out.println("How many siblings do you have?");
		
		String siblings = keyboard.next();
		
		System.out.println(siblings + "? Wow, I hope the rest of your family is better looking.");
		System.out.println("What do you want to be when you grow up?");
		
		String job = keyboard.next();
		
		System.out.println("I think you'd have to be smarter to be a " + job + ". So " + name + ", you're " + age + "...");
		System.out.println("You like to " + activity + " and listen to " + music + "...");
		System.out.println("Good luck becoming a " + job + ".");
		System.out.println("I'm only kidding " + name + ".");
		
	}
}