package OOP;

public class Book {
    private String name;
    private String author;
    private int yearPublic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }

    public Book(String name, String author, int yearPublic) {
        this.name = name;
        this.author = author;
        this.yearPublic = yearPublic;
    }
    public String toString() {
        return "Имя: " + name + ", Автор: " + author + ", Дата публикации: " + yearPublic;
    }
}
    class Playbook {
        public static void main(String[] args) {
            Book shildBook = new Book("Java", "Shild", 2012);
            Book magicBook = new Book("Магия", "Магистр Йода", 2013);
            Book boberBook = new Book("Бобриная хата", "Бобёр!", 1999);

            Book[] booksArray = {shildBook, magicBook, boberBook};

            for (Book book : booksArray) {
                    System.out.println(book);
            }
        }
    }