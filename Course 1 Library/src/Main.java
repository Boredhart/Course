public class Main {

    public static void main(String[] args) {


        System.out.println("-------------------------------------------------");

        Book book1 = Library.getBookByTitle("1984");
        if (book1 != null) {
            book1.borrowBook();
        }

        Library.printAvailableBooks();
        System.out.println("-------------------------------------------------");

        Library.findBooksByAuthor("George Orwell");
    }
}
