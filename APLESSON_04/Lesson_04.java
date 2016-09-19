public class Lesson_04
{
	public static void main(String[]args)
	{
		Lesson_04 form = new Lesson_04();
	
		String word1 = "blaaah";
		double number1 = 4564.3453;
		
		form.format(word1, number1);
		
		String word2 = "yessss";
		double number2 = 8937528.982762;
		form.format(word2, number2);
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s %10.2f", word, number);
	}
	
}