
public class ArrayPassingEx {
	
	static void replaceSpace(char a[]) { // 배열 a의 공백문자를 ','로 변경
		for(int i = 0; i < a.length; i++) {
			if(a[i] == ' ') { // 공백 문자를 ','로 변경
				a[i] = ',';
			}
		}
	}
	
	static void printCharArray(char a[]) { // 배열 a의 문자들을 화면에 출력
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]); // 배열 원소 문자 출력
		}
		System.out.println(); // 배열 원소 모두 출력 후 줄바꿈
	}
	
	public static void main(String [] args) {
		char c[] = {'t','h','i','s',' ','i','s',' ','a'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}
}
