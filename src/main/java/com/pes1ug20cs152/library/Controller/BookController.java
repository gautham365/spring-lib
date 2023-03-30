package com.pes1ug20cs152.library.Controller;

import java.util.List;

import com.pes1ug20cs152.library.Model.Book;
import com.pes1ug20cs152.library.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@Controller()
public class BookController {

    @Autowired
    private BookRepository bookRepository;
    @GetMapping("/books")
    public String findAllBooks(Model model) {
        final List<Book> books = bookRepository.findAll();
        model.addAttribute("books", books);
        return "books";
    }
    @GetMapping("/books/add")
    public String createBookForm(Model model) {

        model.addAttribute("book", new Book());
        return "addBook";
    }

    @PostMapping("/books/add")
    public String createBook(@ModelAttribute("bookForm") Book book, Model model) {
        // Here, we create a new Book object based on the form data submitted by the user
        Book bookObj = new Book();
        bookObj.setName(book.getName());
//        bookObj.setSerialName(book.getSerialName());
        bookObj.setAuthor(book.getAuthor());

//        System.out.println(bookObj.getName());
        // Here, we save the book object to the database using a BookService (assuming one exists)
        bookRepository.save(bookObj);

        // Finally, we redirect the user back to the book list page
        return "redirect:/books";
    }

//
//    @GetMapping("/update/{id}")
//    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
//        final Book book = bookService.findBookById(id);
//
//        model.addAttribute("book", book);
//        return "update-book";
//    }

//    @RequestMapping("/update-book/{id}")
//    public String updateBook(@PathVariable("id") Long id, Book book, BindingResult result, Model model) {
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

