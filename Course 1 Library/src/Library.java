public class Library {

    private static Book[] books = new Book[100];
    private static int bookCount = 0;

    static void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added: " + book.getTitle());
        } else {
            System.out.println("The library is full. It can't house any more books.");
        }
    }

    static void printAvailableBooks() {
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            if (book.isAvailable()) {
                book.displayInfo();
                System.out.println();
            }
        }
    }

    static void findBooksByAuthor(String author) {
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            if (book.getAuthor().equalsIgnoreCase(author)) {
                book.displayInfo();
                System.out.println();
            }
        }
    }
}