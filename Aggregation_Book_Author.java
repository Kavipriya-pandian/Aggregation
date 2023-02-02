package dxc;

import java.util.Scanner;





class Author
{
	String name;
	String emailId;
	char gender;
	public Author(String name, String emailId, char gender) {
	
		this.name = name;
		this.emailId = emailId;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}
	
	
class Book
{
	String name;
	double price;
	int quantity;
	Author author;
	public Book(String name, double price, int quantity, Author author)
	{
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.author = author;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void displayAuthorDetails()
	{
		
		Author a=new Author("Joshua Bloach","joshua@email.com",'M');
		System.out.println("Displaying author details");
		System.out.println("------------------------------------------------");
		System.out.println("Auhor Name  :  "+a.getName()+"\nAuthor Email ID  :   "+a.getEmailId()+"\nAuthor Gender  :  "+a.getGender());
	
	}
	
}
	


public class Aggregation_Book_Author {
	
	public static void main(String[] args)
	{
		
		Author author = null;
		Book b1=new Book("Effective Java",45d,15,author);
		Author a=new Author("Joshua Bloach","joshua@email.com",'M');
		b1.displayAuthorDetails();
	
		
		
		
	}

}
