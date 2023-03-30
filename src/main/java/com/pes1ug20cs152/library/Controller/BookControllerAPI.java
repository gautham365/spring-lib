package com.pes1ug20cs152.library.Controller;

import java.util.List;

import com.pes1ug20cs152.library.Model.Book;
import com.pes1ug20cs152.library.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController()
@RequestMapping("/api/v1")
public class BookControllerAPI {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public List<Book> findAllBooksAPI() {
        return bookRepository.findAll();
    }


//    @RequestMapping("/searchBook")
//    public String searchBook(@Param("keyword") String keyword, Model model) {
//        final List<Book> books = bookService.searchBooks(keyword);
//
//        model.addAttribute("books", books);
//        model.addAttribute("keyword", keyword);
//        return "list-books";
//    }
//
//    @RequestMapping("/book/{id}")
//    public String findBookById(@PathVariable("id") Long id, Model model) {
//        final Book book = bookService.findBookById(id);
//
//        model.addAttribute("book", book);
//        return "list-book";
//    }
//
//    @GetMapping("/add")
//    public String showCreateForm(Book book, Model model) {
//        return "add-book";
//    }
//
//    @RequestMapping("/add-book")
//    public String createBook(Book book, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            return "add-book";
//        }
//
//        bookService.createBook(book);
//        model.addAttribute("book", bookService.findAllBooks());
//        return "redirect:/books";
//    }
//
//    @GetMapping("/update/{id}")
//    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
//        final Book book = bookService.findBookById(id);
//
//        model.addAttribute("book", book);
//        return "update-book";
//    }

//    @RequestMapping("/update-book/{id}")
//    public String updateBook(@PathVariable("id") Long id, Book, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            book.setId(id);
//            return "update-book";
//        }
//
//        bookService.updateBook(book);
//        model.addAttribute("book", bookService.findAllBooks());
//        return "redirect:/books";
//    }

//    @RequestMapping("/remove-book/{id}")
//    public String deleteBook(@PathVariable("id") Long id, Model model) {
//        bookService.deleteBook(id);
//
//        model.addAttribute("book", bookService.findAllBooks());
//        return "redirect:/books";
//    }

}

