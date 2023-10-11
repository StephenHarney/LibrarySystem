package com.example.librarysystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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
        System.out.println("Add a book to library" + libraryService.addBook());
        System.out.println("Get a book from library "+ libraryService.getBooks());


    }
    //Links: http://localhost:8080/library






}
