// 카드 번호 맞추기 게임

import java.util.Scanner;
import java.util.Random;

public class UpDown {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int count = 1 ;
		int min = 0;
		int max = 99;
		int key = r.nextInt(100); // 0~99까지 임의의 정수 생성
		
		System.out.println("수를 결정했어요 맞춰보세요");
		System.out.println(min + "-" + max);
		
		while(true) {

			System.out.print(count +" >> ");
			int n = sc.nextInt();
			
			if(n > key) {
				System.out.println("더 작게");
				if(max > n) {
					max = n ;
				}
				System.out.println(min+ "-"+n);
			}
			
			if(n < key) {
				System.out.println("더 크게");
				if(min < n) {
					min = n ;
				}
				System.out.println(n+"-"+max);
			}
			
			if(n == key) {
				System.out.println("맞았습니다");
				System.out.print("다시하시겠습니까(y/n) >> ");
				String Answer = sc.next();
					
				if ("n".equalsIgnoreCase(Answer)) {
					System.out.println("종료합니다");
					break;
				}
				if ("y".equalsIgnoreCase(Answer)){
					key = r.nextInt(100);
					System.out.println("수를 결정했어요 맞춰보세요");
					min = 0;
					max = 99;
					System.out.println(min + "-" + max);
					count = 1 ;
					continue;
				}
			}
			
			count++;
		}
	}
}
