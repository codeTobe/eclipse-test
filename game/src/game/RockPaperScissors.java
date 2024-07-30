//가위바위보 게임 만들기
//입력하고 엔터치면 컴퓨터가 냄 -> 비교해서 누가 이겼는지 판단 , '그만'입력시 종료

package game;

import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"가위", "바위", "보"};
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다");
		
		while(true) {
		
			System.out.print("가위 바위 보!>> ");
			String Answer = sc.nextLine();
		
			int n = (int)(Math.random()*3); // n 은 0, 1, 2 중에서 랜덤하게 결정
		
			if(Answer.equals("그만")) {
				System.out.println();
				System.out.println("게임을 종료합니다...");
				break;
			}
		
			if(str[n].equals("바위")) {
				System.out.print("컴퓨터: 바위, 당신: "+Answer+" //");
				if(Answer.equals("바위")) {
					System.out.println("비김");
				}
				if(Answer.equals("보")) {
					System.out.println("당신이 이겼습니다");
				}
				if(Answer.equals("가위")) {
					System.out.println("짐");
				}
			}
			if(str[n].equals("보")) {
				System.out.print("컴퓨터: 보, 당신: "+Answer+" //");
				if(Answer.equals("바위")) {
					System.out.println("짐");
				}
				if(Answer.equals("보")) {
					System.out.println("당신이 비김습니다");
				}
				if(Answer.equals("가위")) {
					System.out.println("이김");
				}
			}
			if(str[n].equals("가위")) {
				System.out.print("컴퓨터: 가위, 당신: "+Answer+" //");
				if(Answer.equals("바위")) {
					System.out.println("이김");
				}
				if(Answer.equals("보")) {
					System.out.println("당신이 졌습니다");
				}
				if(Answer.equals("가위")) {
					System.out.println("비김");
				}
			}
			System.out.println();
		
		}
		sc.close();
	}
}
