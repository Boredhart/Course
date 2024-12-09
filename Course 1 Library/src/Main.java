public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 1949, true);
        Book book2 = new Book("Animal Farm", "George Orwell", 1945, true);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        Library.addBook(book1);
        Library.addBook(book2);
        Library.addBook(book3);
        System.out.println("-------------------------------------------------");

        Library.printAvailableBooks();
        System.out.println("-------------------------------------------------");

        book1.borrowBook();

        Library.printAvailableBooks();
        System.out.println("-------------------------------------------------");

        Library.findBooksByAuthor("George Orwell");
    }
}
