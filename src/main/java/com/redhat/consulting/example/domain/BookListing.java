package com.redhat.consulting.example.domain;

import java.util.List;

public class BookListing
{
   private List<Book> books;

   public BookListing()
   {
   }

   public BookListing(List<Book> books)
   {
      this.books = books;
   }

   
   public List<Book> getBooks()
   {
      return books;
   }
}
