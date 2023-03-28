package com.pes1ug20cs152.library.Controller;


import java.util.List;
import javax.validation.Valid;

// import com.pes1ug20cs152.library.Exception.ResourceNotFoundException;
import com.pes1ug20cs152.library.Model.Book;
import com.pes1ug20cs152.library.Service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    // @RequestMapping(value = "/hi")
    // public String hi() {
    //     throw new ResourceNotFoundException("Don't bother me please..!");
    // }
    @GetMapping("/o")
    public String Index1() {
        return "hi";
    }

    @GetMapping("/books")
    public String getAllBooks(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "books";
    }

    @GetMapping("/books/create")
   public String createBookForm(Model model) {
       model.addAttribute("book", new Book());
       return "createBook";
   }

   @PostMapping("/books/create")
   public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult bindingResult) {
       if (bindingResult.hasErrors()) {
           return "createBook";
       }
       bookService.createBook(book);
       return "redirect:/books";
   }

}