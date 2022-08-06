package solid.solid_principles.S;

public class SSolution {
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
}

/*
 * So the problem that one class should have only one responsibility rule was
 * not followed is not being followed by segregating classes on the basis of
 * responsibility
 */
class BookPrinter {

	// methods for outputting text
	void printTextToConsole(String text) {

	}

	// Share text to other medium like logger, email, etc.
	void shareTextToOtherMedium(String text) {

	}
}