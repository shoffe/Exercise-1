package OOP;

public class Book {
    String name;
    String author;
    int yearPublic;

    public Book(String name, String author, int yearPublic) {
        this.name = name;
        this.author = author;
        this.yearPublic = yearPublic;
    }

    public static void printProperties(String name, String author, int yearPublic) {
        System.out.println("Имя: " + name + ", Автор: " + author + ", Дата публикации: " + yearPublic);
    }

    public static void main(String[] args) {
        Book shild = new Book("Java", "Shild", 2012);
        Book magic = new Book("Магия", "Магистр Йода", 2013);
        Book bober = new Book("Бобриная хата", "Бобёр!", 1999);

        Book[] booksArray = {shild, magic, bober};

        for (Book book : booksArray) {
            book.printProperties(book.name, book.author, book.yearPublic);
        }
    }
}
