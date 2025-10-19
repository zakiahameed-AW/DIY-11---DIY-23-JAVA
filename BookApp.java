public class BookApp {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "The Alchemist";
        b1.author = "Paulo Coelho";
        b1.publicationYear = 1988;

        Book b2 = new Book();
        b2.title = "Harry Potter";
        b2.author = "J.K. Rowling";
        b2.publicationYear = 1997;

        Book b3 = new Book();
        b3.title = "Atomic Habits";
        b3.author = "James Clear";
        b3.publicationYear = 2018;

        b1.displayBookInfo();
        b2.displayBookInfo();
        b3.displayBookInfo();
    }
}
