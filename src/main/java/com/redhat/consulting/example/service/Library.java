package com.redhat.consulting.example.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.redhat.consulting.example.domain.Book;
import com.redhat.consulting.example.domain.BookListing;

@Path("library")
public class Library
{
   private HashMap<String, Book> books = new HashMap<String, Book>();

   public Library()
   {
      books.put("596529260", new Book("Leonard Richardson", "596529260", "RESTful Web Services"));
      books.put("333333333", new Book("Bill Burke", "596529260", "EJB 3.0"));
   }

   @GET
   @Path("books")
   @Produces("application/json")
   //@Mapped // mapped is the default format
   public BookListing getBooksMapped()
   {
      return getListing();
   }
   
   private BookListing getListing()
   {
      ArrayList<Book> list = new ArrayList<Book>();
      list.addAll(books.values());
      return new BookListing(list);
   }


}
