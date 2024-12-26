package belajar.graphql;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QueryResolver {

    @QueryMapping
    public String hello() {
        return "Hello, GraphQL!";
    }

    @QueryMapping()
    public Book getBook(@Argument  Long id) {
        System.out.println("getBooks()");
        // Misalnya logika untuk mencari buku berdasarkan id
        return new Book(id, "Spring Boot in Action", "Craig Walls");
    }

    @QueryMapping
    public List<Book> books(){
        List<Book> lb = new ArrayList<>();
        lb.add(new Book(1L, "1", "2"));
        lb.add(new Book(2L, "2", "2"));
        lb.add(new Book(3L, "3", "2"));
        lb.add(new Book(4L, "4", "2"));

        return lb;
    }
}
