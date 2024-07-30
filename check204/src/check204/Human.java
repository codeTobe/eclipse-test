package check204;

import java.util.Scanner;

public class Human {
	String name;
	int age;
	double height;
	double weight;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Human [] aHuman;
		aHuman = new Human[2];
		
		for(int i = 0; i < aHuman.length ; i++) {
			System.out.print("이름>> ");
			String name = sc.next();
			System.out.print("나이>> ");
			int age = sc.nextInt();
			
			aHuman[i] = new Human(name, age);
		}
		
		for(int i =0; i<aHuman.length; i++) {
			System.out.println("이름 : "+ aHuman[i].name+ " / 나이 : "+ aHuman[i].age );
		}
		
	}
	
}
