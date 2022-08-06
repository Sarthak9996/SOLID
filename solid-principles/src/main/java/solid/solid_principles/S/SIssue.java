package solid.solid_principles.S;

public class SIssue {
	private String bookName;
	private String author;
	private String text;

	// Duty related to book property
	public boolean findByAuthor(String authName) {
		return author.contains(authName);
	}

	public boolean findByName(String bookName) {
		return bookName.contains(bookName);
	}

	/*
	 * Problem - The printTextToConsole() function breaks the rule of one class
	 * having only one responsibility
	 */

	// Printing it on console
	void printTextToConsole() {

	}
}
