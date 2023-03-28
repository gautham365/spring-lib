package com.pes1ug20cs152.library.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.pes1ug20cs152.library.Model.Book;
import com.pes1ug20cs152.library.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
// import java.util.Optional;
// import com.pes1ug20cs152.library.Exception.ResourceNotFoundException;
// import com.pes1ug20cs152.library.Service.BookService;



@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // @Override
    // public Book getBookById(Long id) {
    //     Optional<Book> bookOptional = bookRepository.findById(id);
    //     return bookOptional.orElseThrow(() -> new ResourceNotFoundException("Book not found with id: " + id));
    // }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    // @Override
    // public Book updateBook(Long id, Book bookD) {
    //     Book book = getBookById(id);
    //     book.setTitle(book.getTitle());
    //     book.setAuthor(book.getAuthor());
    //     return bookRepository.save(book);
    // }

    // @Override
    // public void deleteBookById(Long id) {
    //     Book book = getBookById(id);
    //     bookRepository.delete(book);
    // }
}
