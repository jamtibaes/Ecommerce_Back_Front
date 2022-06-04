package com.jamdigital.ecommerce.service;

import com.jamdigital.ecommerce.domain.Book;
import com.jamdigital.ecommerce.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private BookRepository bookRepository;

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public Book setBook(Book book) {
        return bookRepository.save(book);
    }

}
