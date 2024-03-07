package playsAndStuff;
import java.util.EnumSet;

public class BookTest {
    public static void main(String[] args) {
        System.out.println("All books: ");

        for (Book book : Book.values()) {
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
        }
        System.out.printf("%nDisplay range of enum constants: %n");

        for (Book book: EnumSet.range(Book.JHTP,Book.CPPHTP )){
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(),book.getCopyrightYear());
        }
    }
}
