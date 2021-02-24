package com.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

class Book {
	
	//class variables
	int id;
	String name,author,publisher;
	int qty;
	
	//constructor
	public Book(int id,String name,String author,String publisher) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;	
	}
}

//main class where i create objects of Book class
public class BooksAl{
	public static void main(String[] args) {
		//creating list of books		
		Book b1 = new Book(101,"LetusC","Yeshwantkanetkar","xyz");
		Book b2 = new Book(102,"C++","BalaGuruSwamy","xyz");
		
		List<Book> al = new ArrayList<Book>();
		al.add(b1);
		al.add(b2);
		
		
		for(Book b : al) {
			System.out.println(b.id + " | " + b.name + " | " + b.author + " | " + b.publisher);
		}
				
				
				
				
	}
	
	
	
}