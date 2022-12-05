public class ButterFly {

	static void pattern(int n)
	{
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= (2 * n); j++) {
				
				if (i < j)
					System.out.print(" ");
				else
					System.out.print("*");

				if (i <= ((2 * n) - j))
					System.out.print(" ");
				else
					System.out.print("*");
			}
			
			System.out.println("");
		}

		// This is lower half of pattern
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= (2 * n); j++) {
				
				// Left part of pattern
				if (i > (n - j + 1))
					System.out.print(" ");
				else
					System.out.print("*");

				// Right part of pattern
				if ((i + n) > j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			
			System.out.println("");
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		pattern(7);
	}
}