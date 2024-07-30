import java.util.Scanner;
import java.util.InputMismatchException;

public class foreachEx {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("곱하고자하는 두수 입력>>");
		int n=0;
		int m=0;
		
		try {
			n = sc.nextInt();
			m = sc.nextInt();
		}
		catch(InputMismatchException e) {
			sc.nextLine();
			System.out.print("오류");
		}
		
		System.out.print(n + "x" + m + "=" + n*m);
		
		sc.close();
		
	}
}
