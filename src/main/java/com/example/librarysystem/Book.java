package com.example.librarysystem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {//getters and setters


    private String title;
    private String author;
    private  int isbn;
    private  int publishedYear;


}