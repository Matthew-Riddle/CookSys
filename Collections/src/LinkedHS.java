import java.util.ArrayList;
import java.util.LinkedHashSet;


public class LinkedHS {

	/**/
	
	LinkedHashSet<Book> books = new LinkedHashSet<Book>();
	
	ArrayList<Book> hBooks = new ArrayList<Book>();
	
	Book b1 = new Book(1, "Harry Potter", "JK lol", "MemeHouse inc", 42);
	Book b2 = new Book(2, "Catcher in my Pie", "Betty Crocker", "Flavor of the month", 1000);
	Book b3 = new Book(3, "Spiderman and Deadpool: A love story", "le'Cameo", "Edgar allen Bro", 1337);
	Book b4 = new Book(4, "Hub as a last name", "Gitty The Kitty", "GitPub(lisher)", 1);
	Book b5 = new Book(5, "H...This starts with H", "H-Man", "H-Pages", 10);
	

	
	public void print() {
		System.out.println("");
		System.out.println("");
		
		for (Book book : books) {
			System.out.println("Id: " + book.id + ". Title: " + book.name + ". Author: " + book.author + ". Publisher: " + book.publisher + ". Copies: " + book.quantity);
		}
	}
	
	
	public void run() {
		//Add all the books to the set. Note the order
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		//Add books that has a title that begins with "H"
		hBooks.add(b1);
		hBooks.add(b4);
		hBooks.add(b5);
		
		//Display the books
		for (Book book : books) {
			System.out.println("Id: " + book.id + ". Title: " + book.name + ". Author: " + book.author + ". Publisher: " + book.publisher + ". Copies: " + book.quantity);
		}
		
		//Lets add a duplicate and see what happens
		books.add(b2);
		
		
		//Adding a few spaces and then lets display again
		print();
		
		//No copies were added, the addition was just discarded.
		
		//Now lets see what happens when we remove book 2
		
		books.remove(b2);
		
		print();
		
		//Book 2 was removed, but the order in which they were originally entered has been preserved
		
		//Time to add another book just for fun and add the other book back to see where it goes
		
		books.add(b4);
		books.add(b2);
		
		print();
		
		/*Just for fun, we will use the retainAll method to compare the collection hBooks to or linked HashSet
		 * It will see what the 2 collections have in common and delete the rest.
		 * Notice that Even though we had book 5 in the hBooks collection, it had no effect
		 * on our LinkedHashset*/
		
		books.retainAll(hBooks);
		
		print();
		
		/*So now we see that when we add a new book, it goes at the end of the Linked HashSet and if we re-add the book
		 * from before, it does not go back into its original location since it was removed and its spot was filled in by
		 * book 3*/
		
		
	}
	
	public static void main(String args[]) {
	
		LinkedHS lhs =  new LinkedHS();
		
		lhs.run();
		
	}
}

