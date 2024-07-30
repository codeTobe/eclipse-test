
public class Circle {
	
	int radius; // 원의 반지름 필드
	String name; // 원의 이름 필드
	
	public Circle() {} // 원의 생성자 메소드
	
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	
	public double getArea() { // 원의 면적 계산 메소드
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza; // 레퍼런스 변수 pizza 선언
		pizza = new Circle(); // Circle 객체 생성
		pizza.radius = 10; // 피자의 반지름을 10으로 설정
		pizza.name = "자바피자"; // 피자의 이름 설정
		double area = pizza.getArea(); // 피자의 면적 알아내기
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle(2, "자바도넛");
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		
	}
	
}
