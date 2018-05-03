import java.util.Scanner;

public class P03 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("n:");
		int n = Integer.parseInt( reader.nextLine() );
		int i=2;
		while(i < n ) {
			if (n % i == 0 ) {				
				System.out.println(i+" ");
			}
			i++;
		}
	}
} 