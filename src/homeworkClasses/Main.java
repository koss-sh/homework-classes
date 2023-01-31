package homeworkClasses;

import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Stephen", "King");
        Author author2 = new Author("George", "Orwell");
        System.out.println("author1 = " + author1.firstName + " " + author1.lastName);
        System.out.println("author2 = " + author2.firstName + " " + author2.lastName);
        Book book1 = new Book("It", author1, 1990);
        System.out.println("book1 = " + book1.bookName + " " + book1.authorName + " " + book1.publishingYear);
    }
}