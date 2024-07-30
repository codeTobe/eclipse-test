// 369게임에서 박수를 쳐야하는 경우를 순서대로 화면에 출력해보자 
// 1~99

public class game369 {
	public static void main(String [] args) {
		
		for(int i = 1; i <= 99 ; i ++) {
			boolean a = false;
			boolean b = false;
			
			int result = i % 10;
			if(result ==3 || result == 6 || result ==9) {
				a = true;
			}
			
			result = i /10;
			if(result ==3 || result ==6 || result ==9) {
				b = true;
			}
			if (a && b == true) {
				System.out.println(i +"박수 짝짝");
			}
			if(a||b == true) {
				System.out.println(i + "박수 짝");
			}
		}
		
	}
}
 