package homeworkClasses;

import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Stephen", "King");
        Author author2 = new Author("George", "Orwell");
        System.out.println("author1 = " + author1.getFirstName() + " " + author1.getLastName());
        System.out.println("author2 = " + author2.getFirstName() + " " + author2.getLastName());
        Book book1 = new Book("It", author1, 1990);
        Book book2 = new Book("1984", author2, 2000);
        System.out.println("book1 = " + book1.getBookName() + " " + book1.getAuthorName() + " " + book1.getPublishingYear());
        System.out.println("book2 = " + book2.getBookName() + " " + book2.getAuthorName() + " " + book2.getPublishingYear());
        book1.setPublishingYear(1995);
        System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());
    }
}