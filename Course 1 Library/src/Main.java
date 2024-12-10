public class Main {

    public static void main(String[] args) {



        Book book1 = Library.getBookByTitle("1984");
        if (book1 != null) {
            book1.borrowBook();
        }
        System.out.println("-------------------------------------------------");

        Library.printAvailableBooks();
        System.out.println("-------------------------------------------------");

        Library.findBooksByAuthor("George Orwell");
    }
}
