package books;

public class Book {
    String title;
    int pages;
    int currentPage;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        this.currentPage = 1;
    }

    private int turnPage(int firstPage) {
        if (firstPage < 0) {
            firstPage = 0;
        } else {
            firstPage++;
        }
        return firstPage;
    }

    public static void main(String[] args) {
        Book book = new Book("First Movie", 5);
        System.out.println("Title:" + book.title);
        System.out.println("Title:" + book.title);
        System.out.println("Pages: " + book.pages);
        System.out.println("Pages: " + book.pages);
        System.out.println("Pages: " + book.pages);
        System.out.println("Current Page: " + book.turnPage(book.currentPage));

    }

}
