import java.util.Scanner;

class Book {
	String title, author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String [] args) {
		Book [] book = new Book[2]; // 배열 선언 + 생성
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < book.length; i++) {
			System.out.print("제목>>");
			String title = sc.nextLine(); // 한줄을 하나의 문자열로 읽음 (빈칸 포함)
			System.out.print("저자>>");
			String author = sc.nextLine();
			
			book[i] = new Book(title, author); // 배열 원소 객체 생성
		}
		
		for(int i = 0; i < book.length; i++) {
			System.out.print("("+ book[i].title + ","+ book[i].author +")");
		}
		
		sc.close();
	}
}
