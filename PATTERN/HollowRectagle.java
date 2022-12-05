// JAVA code for hollow squares
import java.io.*;

class HollowRectangle{

	static void print_square(int n)
	{
		int i, j;
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (i == 1 || i == n || j == 1 || j == n)		
					System.out.print("*");		
				else		
					System.out.print(" ");		
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int rows = 8;
		print_square(rows);
	}
}
