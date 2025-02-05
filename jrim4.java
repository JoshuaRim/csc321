//josh rim
//lab 4b
import java.util.Scanner;
public class jrim4
{
	public static void main(String[] args)
	{
		int x = 0;
		System.out.println("Choose 1 of the four options");
		System.out.println("1. Yes");
		System.out.println("2. No");
		System.out.println("3. Maybe");
		System.out.println("4. I don't know");

		Scanner userinput = new Scanner(System.in);
		x = userinput.nextInt();

		if (x == 1)
		{
			System.out.println("You chose 'Yes' - You do like school!")
				}
		else if (x == 2)
		{
			System.out.println("You chose 'No' - You do not like school!")
				}
		else if (x == 3)
		{
			System.out.println("You chose 'Maybe' - You kinda like school!")
				}
		else if (x == 4)
		{
			System.out.println)"You chose 'I don't know' - You dont know if you like or dislike school!")
				}
		
	}
}


