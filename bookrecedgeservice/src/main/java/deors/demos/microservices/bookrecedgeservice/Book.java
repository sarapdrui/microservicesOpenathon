package deors.demos.microservices.bookrecedgeservice;

public class Book {

    private Long id;// Long that represents the id of the Book

    private String title;// String that represents the title of the Book

    private String author;// String that represents the author of the Book
    
    
    
    /**
     * Book´s complete constructor
     * @param id 
     * @param title
     * @param author
     */
	public Book(Long id, String title, String author) {
		
		this.id = id;
		this.title = title;
		this.author = author;
	}

	/**
	 * Book´s empty constructor
	 */
	public Book() {
		
	}

	/**
	 * Gets a long that represent the id
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets a long that represent the id
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets a String that represent the title
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets a String that represent the title
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets a String that represent the author
	 * @return author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets a String that represent the author
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
    
    
}