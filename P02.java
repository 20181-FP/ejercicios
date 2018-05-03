import java.util.Scanner;

public class P02 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("n:");
		int n = Integer.parseInt( reader.nextLine() );
		int i=1;
		int cont_num_pares=0;
		while(cont_num_pares < n) {
			if (i % 2 == 0 ) {				
				System.out.println(i+" ");
				cont_num_pares++;
			}
			i++;
		}
	}
} 