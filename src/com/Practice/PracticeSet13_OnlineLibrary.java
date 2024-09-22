package com.Practice;

import java.sql.SQLOutput;

class CentralLibrary {
     String[] books;
     int no_of_books;

    public CentralLibrary(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    public void addBook(String book, String ...arr){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" Book has been added !");

        for(String Book : arr){
            this.books[no_of_books] = Book;
            no_of_books++;
        }
    }

    public void showAvailableBooks(){
        for(String book : books) {
            if (book == null) {
                continue;
            } else {
                System.out.println(book+", ");
            }
        }
    }

    public void issueBook(String book){

        for(int i=0; i<=this.books.length-1; i++){

            if(this.books[i] == book){
                System.out.println(this.books[i]+"- has  been issued !!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println(book+" this book dose not exists");
    }

    public void returnBook(String book){
        addBook(book);
    }
}

public class PracticeSet13_OnlineLibrary {
    public static void main(String[] args) {

        CentralLibrary cl = new CentralLibrary();
        cl.addBook("Rich dad", "Harry Potter", "New Book 1", "New Book 2", "New Book 3");
        cl.showAvailableBooks();
        cl.issueBook("New Book 2");
        cl.issueBook("happy Birthday");
        cl.showAvailableBooks();
        cl.returnBook("New Book 4");


    }
}
