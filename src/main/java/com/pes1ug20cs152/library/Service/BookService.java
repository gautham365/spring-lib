package com.pes1ug20cs152.library.Service;

import java.util.List;
import com.pes1ug20cs152.library.Model.Book;

public interface BookService {
    
    List<Book> getAllBooks();
    
    // Book getBookById(long id);
    
    Book createBook(Book book);
    
    // Book updateBook(long id, Book book);

    // void deleteBookById(long id);
    
}
