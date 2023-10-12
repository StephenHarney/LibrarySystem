package com.example.librarysystem;


import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LibraryService{//Manage Library operations


    private ArrayList<Book> shelf = new ArrayList<>();

    public void addBook(Book book) {
        shelf.add(book);
    }

    public ArrayList<Book> getBooks(){
        return shelf;
    }


    /*public String addBook() {
        return null;
    }*/
}