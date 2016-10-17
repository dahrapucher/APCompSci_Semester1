import java.util.Scanner;

public class adventure
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("You are trying to find the stolen diamond...");
		System.out.println("Please choose a location to begin your search:" +
							"\n1. the musuem" +
							"\n2. the park");
		int choice1 = kb.nextInt();
		if(choice1 == 1)
		{
			System.out.println("Okay. After you go into the musuem there are two hallways..." +
								"\nWhich hallway do you want to take?" +
								"\n1. the hallway to the right" +
								"\n2. the hallway to the left");
								int hallway = kb.nextInt();
								if(hallway == 1)
								{
									System.out.println("Okay. When walking through the hallway you see a trash can and a plant..." +
														"\nWhich do you want to look underneath for the stolen diamond?" +
														"\n1. the trash can" +
														"\n2. the plant");
														int tOrP = kb.nextInt();
														if(tOrP == 2)
														{
															System.out.println("Congratulations! You have found the stolen diamond!");
														}
														else
														{
															System.out.println("You lost! The stolen diamond is not underneath the trash can.\nTry again.");
														}
								}
								else
								{
									System.out.println("Okay. When walking through the hallway you see a bench and a chair..." +
														"\nWhich do you want to look underneath for the stolen diamond?" +
														"\n1. the bench" +
														"\n2. the chair");
														int bOrC = kb.nextInt();
														if(bOrC == 1)
														{
															System.out.println("You lost! The stolen diamond is not underneath the bench.\nTry again.");
														}
														else
														{
															System.out.println("You lost! The stolen diamond is not underneath the chair.\nTry again.");
														}
								}
		}
		else
		{
			System.out.println("Okay. After walking to the park you see two paths..." +
								"\nWhich do you want to take?" +
								"\n1. the path on the right" +
								"\n2. the path on the left");
								int path = kb.nextInt();
								if(path == 1)
								{
									System.out.println("Okay. After you go right you see a rock and a wooden bench..." +
														"\nWhich do you want to look underneath for the stolen diamond?" +
														"\n1. the rock" +
														"\n2. the wooden bench");
														int rOrB = kb.nextInt();
														if(rOrB == 1)
														{
															System.out.println("You lost! The stolen diamond is not underneath the rock.\nTry again.");
														}
														else
														{
															System.out.println("You lost! The stolen diamond is not underneath the wooden bench.\nTry again.");
														}
								}
								else
								{
									System.out.println("Okay. After you go left you see a playground slide and a large tree..."+
														"\nWhich do you want to look underneath for the stolen diamond?" +
														"\n1. the playground slide" +
														"\n2. the large slide");
														int sOrT = kb.nextInt();
														if(sOrT == 1)
														{
															System.out.println("You lost! The stolen diamond is not underneath the playground slide.\nTry again.");
														}
														else
														{
															System.out.println("You lost! The stolen diamond is not underneath the large tree.\nTry again.");
														}
								}
		}
	}
	
}