package belajar.graphql;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MutationResolver {

    // Mutation Mapping untuk "addBook"
    @MutationMapping(name = "addBook")
    public Book addBook(@Argument String title, @Argument String author) {
        System.out.println("Aaaaaaaaaaaaaaaa");
        System.out.println(title);
        System.out.println(author);
        // Logika untuk menambahkan buku, misalnya simpan ke database atau list
        return new Book(1L, title, author);  // Mengembalikan buku yang ditambahkan
    }
}
