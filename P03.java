import java.util.Scanner;

public class P03 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("n:");
		int n = Integer.parseInt( reader.nextLine() );
		int i=2;
		boolean esPrimo= true;
		while(i < n ) {
			if (n % i == 0 ) {				
				System.out.println(i+" ");
				esPrimo = false;
			}
			i++;
		}
		if (esPrimo) {
			System.out.println(n+" es primo");
		}else{
			System.out.println(n+" NO es primo");
		}
	}
} 