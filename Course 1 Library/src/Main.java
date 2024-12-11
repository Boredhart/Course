public class Main {

    public static void main(String[] args) {


        Library repo = new Library();
        Book book1 = new Book("If We Were Villains", "Rio");

        repo.addBook(book1);
        System.out.println("-------------------------------------------------");

        repo.printAvailableBooks();
        System.out.println("-------------------------------------------------");

        book1.borrowBook();

        repo.printAvailableBooks();
        System.out.println("-------------------------------------------------");

        repo.findBooksByAuthor("George Orwell");
    }
}
