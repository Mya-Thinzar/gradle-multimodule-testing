package gradle.multi.module.project.book;
import gradle.multi.module.project.list.LinkedList;

import java.util.*;
public class BookDao {

    public static List<String> getBooks() {
        return  Arrays.asList("book1","book2");
    }

    public static List<String> createBook(String bookName) {
        System.out.println("created book successfully");
        return Arrays.asList(bookName);
    }

}
