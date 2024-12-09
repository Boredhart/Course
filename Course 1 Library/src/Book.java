public class Book {
    private final String title;
    private final String author;
    private final int year;
    private boolean isAvailable;

    public Book(String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = 0;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (!isAvailable) {
            System.out.println("The book \"" + title + "\" is not available.");
        } else {
            isAvailable = false;
        }

    }

    public void returnBook() {
        if (isAvailable) {
            System.out.println("The book \"" + title + "\" is already returned.");
        } else {
            isAvailable = true;
        }
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + (year > 0 ? year : "Unknown"));
        if (isAvailable) {
            System.out.println("Available.");
        } else {
            System.out.println("Not available.");
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
