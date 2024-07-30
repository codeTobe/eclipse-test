
public class MerhodSample {
	static double getSum(double a[]) { // 총 합 구해 리턴하는 메소드
		double sum=0;
		for(double n : a) {
			sum += n;
		}
		return sum;
	}
	
	public static void main(String []args) {
		
		double a[]; // 배열 선언
		a = new double[4]; // 배열 생성
		
		double g = 1.1;
		
		for(int i =0; i< a.length; i++) { // 배열에 숫자 넣음
			a[i] = g; 
			
			g++;
		}
		
		for(int i=0; i< a.length ; i++) { // 배열 전체 출력
			System.out.println(a[i]);
		}
		
		System.out.print(getSum(a)); // 총합 출력

		
	}
}
