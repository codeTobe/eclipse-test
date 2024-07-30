/*Scanner 클래스를 이용해 정수로 된 돈의 액수를 입력받아 
 * 오만 원권, 만 원권, 천 원권, 500원짜리 동전, 100원짜리 동전, 
 * 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력*/

import java.util.Scanner;

public class Hello2030 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력해 주세요 >> ");
		int Money = sc.nextInt();
		
		System.out.println("오만원권 " + Money/50000 + "매");
		System.out.println("만원권 " + (Money - (50000 * (Money%50000)/10000 + "매");
		System.out.println("천원권 " + Money -  + "매");
		
		sc.close();
	}
}
