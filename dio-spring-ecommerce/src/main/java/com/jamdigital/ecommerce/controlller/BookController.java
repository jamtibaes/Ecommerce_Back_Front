package com.jamdigital.ecommerce.controlller;

import com.jamdigital.ecommerce.domain.Book;
import com.jamdigital.ecommerce.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1")
public class BookController {

    private BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> books = bookService.getBooks();
        return ResponseEntity.ok(books);
    }

    @PostMapping("/book")
    public ResponseEntity<Book> setBook(@RequestBody Book book) {
        Book savedBook = bookService.setBook(book);
        return ResponseEntity.ok(savedBook);
    }

}
