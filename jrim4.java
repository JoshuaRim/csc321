//josh rim
//lab 4b
import java.util.Scanner;
public class jrim4
{
	public static void main(String[] args)
	{
		int x = 0;
		System.out.println("Choose 1 of the four options");
		System.out.println("Yes");
		System.out.println("No");
		System.out.println("Maybe");
		System.out.println("I don't know");

		Scanner userinput = new Scanner(System.in);
		x = userinput.nextInt();

		System.out.println("You chose option "+x);
	}
}


