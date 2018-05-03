import java.util.Scanner;

public class P03 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("n:");
		int n = Integer.parseInt( reader.nextLine() );
		if (primo(n)) {
			System.out.println(n+" es primo");
		}else{
			System.out.println(n+" NO es primo");
		}
	}
	public static boolean primo(int n) {
		int i=2;
		boolean esPrimo= true;
		while(i < n && esPrimo) {
			if (n % i == 0 ) {				
				System.out.println(i+" ");
				esPrimo = false;
			}
			i++;
		}
		return esPrimo;
	}
} 