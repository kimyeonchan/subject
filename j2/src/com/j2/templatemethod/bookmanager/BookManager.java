package com.j2.templatemethod.bookmanager;


import java.util.*;
public class BookManager {
	ArrayList<Book> A;
	int n = 0;
	public BookManager(){
		A = new ArrayList<Book>();
	}
	void Add(String _title , String _Author, int _isbn)
	{
		Book Book = new Book(_title,_Author,_isbn);
		A.add(n,Book);
		n++;
	}
	public void show(){
		Iterator<Book> it = A.iterator();
		while(it.hasNext()){
			Book n = it.next();
			System.out.println(n);
		}
	}
	public void sort(){
		Collections.sort(A);
		}
}




