import java.util.Scanner;

public class P01 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("vi:");
		int vi = Integer.parseInt( reader.nextLine() );
		System.out.print("vf:");
		int vf = Integer.parseInt( reader.nextLine() );
		for (int i=vi; i<=vf; i++) {
			if (i % 2 == 0 ) {
				System.out.println(i+" ");
			}
		}
	}
}