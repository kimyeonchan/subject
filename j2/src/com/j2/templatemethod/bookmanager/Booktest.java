package com.j2.templatemethod.bookmanager;

public class Booktest {
	public static void main(String[] args) {
		BookManager A= new BookManager();
		A.Add("java programing2","dooly",20151111);
		A.Add("java programing1","kim",20151112);
		A.Add("java programing1","park",20151113);
		System.out.println("before sorting\n");
		A.show();
		A.sort();
		System.out.println("after sorting\n");
		A.show();
	}
}