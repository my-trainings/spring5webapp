package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Walid LARABI on Sep, 2020
 */

@Controller
public class BookController {
    private final BookRepository bookRepository;

    BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        // A model is provided to the method, a model object, and our code is saying for that
        // model we are going to add the attribute called Books and we're going to get execute book repository
        // which is going to give us a list of books.
        // Now this model is going to get return back to our view layer and it's going to have an attribute books
        // and a list of books on that and then we'll be able to utilize that value inside of our view layer
        model.addAttribute("books", bookRepository.findAll());
        return "books/list";
    }
}
