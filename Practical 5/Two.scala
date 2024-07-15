package Practical_5
import scala.io.StdIn.readLine

object Two extends App {
  class Book(val title: String, val author: String, val isbn: String) {
    override def toString: String = s"Title: $title, Author: $author, ISBN: $isbn" // overridden the toString
                                                                                  // library function to make printing easier
  }

  object Library {
    var library: List[Book] = List( // Library is created as a list of books
      new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", "978-0345391803"),
      new Book("Pride and Prejudice", "Jane Austen", "978-0140435225"),
      new Book("To Kill a Mockingbird", "Harper Lee", "978-0446310727")
    )

    def displayLibrary(): Unit = {
      if (library.isEmpty) {
        println("The library is empty.")
      } else {
        println("Current library collection:")
        library.foreach(book => println(book.toString))
      }
    }

    def searchBookByTitle(title: String): Unit = {
      val book = library.find(_.title.equalsIgnoreCase(title))
      book match {
        case Some(b) => println(s"Book found: $b")
        case None => println(s"Book with title '$title' not found in the library")
      }
    }

    def displayBooksByAuthor(author: String): Unit = {
      val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
      if (booksByAuthor.isEmpty) {
        println(s"No books found by author '$author'")
      } else {
        println(s"Books by '$author':")
        booksByAuthor.foreach(book => println(book.toString))
      }
    }

    def addBook(book: Book): Unit = {
      if (library.exists(_.isbn == book.isbn)) {
        println(s"Book with ISBN ${book.isbn} already exists in the library")
      } else {
        library = library :+ book
        println(s"Book '${book.title}' by ${book.author} added successfully")
      }
    }

    def removeBook(isbn: String): Unit = {
      val initialSize = library.size
      library = library.filterNot(_.isbn == isbn)
      if (library.size < initialSize) {
        println(s"Book with ISBN $isbn removed from the library")
      } else {
        println(s"Book with ISBN $isbn not found in the library")
      }
    }

    def isBookInLibrary(isbn: String): Boolean = {
      library.exists(_.isbn == isbn)
    }
  }

  // Sample Usage
  Library.addBook(new Book("1984", "George Orwell", "978-0451524935"))
  Library.displayLibrary()
  println(Library.isBookInLibrary("978-0451524935"))
  Library.removeBook("978-0451524935")
  println(Library.isBookInLibrary("978-0451524935"))

  Library.searchBookByTitle("Pride and Prejudice")
  Library.displayBooksByAuthor("Jane Austen")
}

