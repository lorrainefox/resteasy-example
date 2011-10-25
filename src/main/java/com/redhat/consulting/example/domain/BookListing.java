package com.redhat.consulting.example.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlRootElement(name="listing")
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

   @XmlElement(name="books")
   public List<Book> getBooks()
   {
      return books;
   }
}
