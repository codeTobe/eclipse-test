import java.util.Scanner;

class Player {
	Scanner inputword = new Scanner(System.in);
	
	public String name; // 게임 참가자 이름 필드
	
	public String wordin;
	
	public String sayWord() { // 사용자로부터 단어를 입력받는 메소드
		wordin = inputword.next();
		return wordin;
	}
	
	public boolean succeed(char lastChar) { // 끝말잇기 성공여부 메소드
		if(lastChar == wordin.charAt(0)) // 입력받은 단어의 첫글자와 기존 마지막 글자 비교 
			return true;	// 같으면 true 리턴
		else 
			return false;	// 다르면 false 리턴
	}
	
}

public class WordGameApp { // 메인 클래스
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = "아버지"; // 프로그램에서 첫 단어 설정
		System.out.println("끝말잇기 게임을 시작합니다");
		System.out.print("게임에 찾가하는 인원은 몇명입니까>>");
		int Member = sc.nextInt();
		
		Player [] p ; // Player 배열에 대한 레퍼런스 p 선언
		p = new Player[Member]; // Member 수 만큼 레퍼런스 배열 생성
		
		for(int i =0; i < Member; i ++) {  // 배열 원소 객체 생성
			System.out.print("참가자의 이름을 입력하세요>>");
			p[i] = new Player();
			p[i].name = sc.next(); // 입력받은 이름을 Player 배열의 이름 필드에 각각 저장함
		}
		
		System.out.println("시작하는 단어는 아버지입니다");
		
		int i = 0, j = 0;
		while(true) {
				
			j = i % Member; 	// 이 수식은 j가 0부터 (Memder-1)까지 반복하게 함
			int lastIndex = word.length() -1;	// 마지막 문자에 대한 인덱스
			char lastChar = word.charAt(lastIndex);		// 마지막 문자
			
			System.out.print(p[j].name +">>");
			p[j].sayWord(); 	// 사용자의 단어 입력 받기
			
			boolean continuing = p[j].succeed(lastChar); // 마지막 문자를 넣어서 성공 여부 판단
			if(continuing == false) { // 틀렸을 경우
				System.out.println(p[j].name +"이 졌습니다");
				break;
			}
			word = p[j].wordin; // 단어 옮겨주기
			i++;
		}
	}
}
