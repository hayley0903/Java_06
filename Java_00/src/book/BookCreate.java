package book;

import java.util.Scanner;

import myUtil.Myutil;

public class BookCreate {
	
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void bookInfoInsert() {

		
		//도서 정보를 입력받아 Book1을 만들어주세요. 
		
		
		System.out.println("도서명을 입력해주세요. :");
		String bookTitle = sc.next();
		
		
		System.out.println("도서가격을 입력해주세요. :");
		int bookPrice = sc.nextInt();
		
		System.out.println("출판사를 입력해주세요. :");
		String bookPublisher = sc.next();
		
		
		System.out.println("저자를 입력해주세요. :");
		String bookAuthor = sc.next();
		
		System.out.println("출판년도를 입력해주세요. :");
		String bookPubYear = sc.next();
		
		System.out.println("ISBN을 입력해주세요. :");
		String bookIsbn = sc.next();
		
		System.out.println("총 페이지를 입력해주세요. :");
		int Page = sc.nextInt();
		
		
		Book b1 = new Book();
		
		b1.setTitle(bookTitle);
		b1.setAuthor(bookAuthor);
		b1.setPublisher(bookPublisher);
		b1.setPage(Page);
		b1.setPubYear(bookPubYear);
		b1.setIsbn(bookIsbn);
		
	
		bookInfoSelect(b1);
	}

	
	public static void bookInfoSelect(Book book) {
		System.out.println(book.bookInfo());
		
		return book;
		
	}
	
}
