
class Circle { // 동그라미 클래스
	// 필드
	int radius; // 원의 반지름 필드
	
	// 생성자
	public Circle(int radius) { // 생성자
		this.radius = radius;
	}
	
	// 메소드
	public double getArea() { // 원의 면적 계산 메소드
		return 3.14*radius*radius;
	}
}

public class CircleArray { // 동그라미 배열 클래스 (대표 클래스)
	public static void main(String [] args) {
		Circle [] c ; // Circle 배열에 대한 레퍼런스 c 선언
		c = new Circle[5]; // 5개의 레퍼런스 배열 생성
		
		for(int i = 0; i < c.length; i++) { //배열의 개수 만큼
			c[i] = new Circle(i); // i 번째 원소 객체 생성
		}
		
		for(int i = 0; i < c.length; i++) { // 배열의 모든 Circle 객체의 면적 출력
			System.out.print((int)(c[i].getArea()) + " ");
		}
	}
}
