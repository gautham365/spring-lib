package com.pes1ug20cs152.library.Service;

import com.pes1ug20cs152.library.Exception.ResourceNotFoundException;
import com.pes1ug20cs152.library.Model.Book;
import com.pes1ug20cs152.library.Repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.h2.fulltext.FullTextLucene.search;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    @Override
    public List<Book> searchBooks(String keyword) {
        //            return bookRepository.search(keyword);
        return bookRepository.findAll();
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    @Override
    public Book findBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Book not found with ID %d", id)));
    }

    @Override
    public void createBook(Book book) {
        bookRepository.save(book);
    }

//    @Override
//    public void updateBook(Book book) {
//        bookRepository.save(book);
//    }

//    @Override
//    public void deleteBook(Long id) {
//        final Book book = bookRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException(String.format("Book not found with ID %d", id)));
//
//        bookRepository.deleteById(book.getId());
//    }

}