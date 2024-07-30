//  정수를 10개 저장하는 배열을 만들고 1에서 10까지 
// 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 
// 그리고 배열에 든 숫자들과 평균을 출력하라

public class numder {
	public static void main(String[] args) {
		int intArray[] = new int[10];
		int sum= 0;
		System.out.print("랜덤정수 : ");
		for(int n : intArray) {
			int i = (int)(Math.random()*10+1);
			n = i;
			System.out.print(n+" ");
			sum += n;
		}
		System.out.println();
		System.out.print("평균은"+ sum/10);
	}
}
