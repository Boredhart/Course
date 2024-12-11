public class Library {

    private static Book[] books = new Book[100];
    private static int bookCount = 0;


    {
        Book book1 = new Book("1984", "George Orwell", 1949, true);
        Book book2 = new Book("Animal Farm", "George Orwell", 1945, true);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        addBook(book1);
        addBook(book2);
        addBook(book3);

        printAvailableBooks();
        System.out.println("-------------------------------------------------");
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added: " + book.getTitle());
        } else {
            System.out.println("The library is full. It can't house any more books.");
        }
    }

    public void printAvailableBooks() {
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            if (book.isAvailable()) {
                book.displayInfo();
                System.out.println();
            }
        }
    }

    public void findBooksByAuthor(String author) {
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            if (book.getAuthor().equalsIgnoreCase(author)) {
                book.displayInfo();
                System.out.println();
            }
        }
    }

    public Book getBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }
}