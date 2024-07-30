
public class ReturnArray {
	static char[] makeCharArray() {
		char [] c = {'a','g','r','f'};
		return c;
	}
	
	public static void main(String []args) {
		char intArray[]; // 배열 래퍼런스 변수 선언
		intArray = makeCharArray(); // 메소드로부터 배열 전달받음
		for ( char k : intArray) {
			System.out.print( k +" ");
		}
	}
}
