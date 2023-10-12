package com.example.librarysystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class LibraryController {


    private LibraryService libraryService;


    @Autowired
    public void setLibrary(LibraryService libraryService){
        this.libraryService = libraryService;

    }
    @PostMapping("library")
    @ResponseStatus(HttpStatus.CREATED)
    public void Shelve(@RequestBody Book book){
        libraryService.addBook(book);
        System.out.println("Get a book from library " + libraryService.getBooks());


    }
    //Links: http://localhost:8080/library


    @GetMapping("/getbook")
        public ArrayList getlist(){
        return libraryService.getBooks();

    }
//links http://localhost:8080/getbook




}
