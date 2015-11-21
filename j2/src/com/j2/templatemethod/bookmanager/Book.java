package com.j2.templatemethod.bookmanager;

public class Book implements Comparable<Book> {
	public String title;
	public String Author;
	public int isbn;

	public Book()
	{
		title=null;
		Author= null;
		isbn= 0;	
	}
	public Book(String _title,String _Author, int _isbn)
	{
		title = _title;
		Author = _Author;
		isbn = _isbn;
	}
	public int compareTo(Book a) {
		if (title.compareTo(a.title) == 0) {
			if (Author.compareTo(a.Author) == 0){
				if(isbn > a.isbn)
					return 1;
				else if (isbn < a.isbn)
					return -1;
				else
					return 0;
			}
			else
				return Author.compareTo(a.Author);
	        }
		else {
			return title.compareTo(a.title);
			} 	
	}
    public String toString() {
        return "\"(" + title + "," + Author + "," + isbn +")\"" ;
    }
}


