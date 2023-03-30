package com.pes1ug20cs152.library.Service;

import com.pes1ug20cs152.library.Model.Book;

import java.util.List;

public interface BookService {

    public List<Book> findAllBooks();

    public List<Book> searchBooks(String keyword);

    public Book findBookById(Long id);

    public void createBook(Book book);

//    public void updateBook(Book book);

//    public void deleteBook(Long id);

}