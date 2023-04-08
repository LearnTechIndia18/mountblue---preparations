import java.util.Scanner;

public class FlipBits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();

		long mask = (1L << 32) - 1;
		
		for (int t = 0; t < T; t++) {
			long n = scanner.nextLong();
			System.out.println(n ^ mask);			
		}
		
		scanner.close();

	}

}



