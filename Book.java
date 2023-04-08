package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    static ArrayList<Book> booksList = new ArrayList();

    private String bookName;
    private String authorName;
    private double bookPrice;

    public Book() {
    }

    public Book(String bookName, String authorName, double bookPrice) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookPrice = bookPrice;
    }



    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }


    public static void displayAllBooks(){
        ArrayList<Book> listBook = Book.booksList;
        if(listBook.isEmpty())
            System.out.println("There is no book");
        else
        {
            System.out.println("Name      "+"Author      "+"Price      ");
            for(Book book : listBook)
            {
                System.out.println(book.getBookName()+"       "+book.getAuthorName()+"      "+book.getBookPrice());
            }
        }
    }

    public static void addBooks(Scanner scanner){
        System.out.println("Enter Numbers Of Books You Need Add");
        int numBook = scanner.nextInt();
        if(numBook<0)
            System.out.println("Invalid value");
        else
        {
            for(int i=0; i<numBook; i++)
            {
                System.out.println("Enter Book "+ (i+1) + " Name");
                String bookName = scanner.next();
                System.out.println("Enter Book "+ (i+1) + " Author");
                String bookAuthour = scanner.next();
                System.out.println("Enter Book "+ (i+1) + " Price");
                double bookPrice = scanner.nextDouble();
                Book b = new Book();
                b.setBookName(bookName);
                b.setAuthorName(bookAuthour);
                b.setBookPrice(bookPrice);
                Book.booksList.add(b);
            }
        }
    }

    public static Book getBookByName(String name) {
        for(Book book : booksList) {
            if(book.bookName.equals(name)){
                return book;
            }
        }
        return null;
    }

    public static boolean updateBook(Book newBook, Book oldBook){
        if(booksList.size()>0){
            int index=0;
            for(int i=0; i<booksList.size(); i++){
                if(booksList.get(i).getBookName().equals(oldBook.getBookName())){
                    index=i;
                    break;
                }
            }
            if(index!=0){
                booksList.get(index).setBookName(newBook.getBookName());
                booksList.get(index).setAuthorName(newBook.getAuthorName());
                booksList.get(index).setBookPrice(newBook.getBookPrice());
                return true;
            }
        }
        return false;
    }

    public static void updateBooks(Scanner scanner){
        boolean condition = true;
        while(condition)
        {
            System.out.println("\n\t\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * *\n\t\t\t\t\t\t\t\t*\t\t\t\t\t\t\t\t\t\t\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t*\t\t\t\t\t#Update Book..!\t\t\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t*\t\t\tPress 1 To Update Book Name\t\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t*\t\t\tPress 2 To Update Book Author\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t*\t\t\tPress 3 To Update Book Price\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t*\t\t\tPress 4 To Back to Main Menu\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t*\t\t\tPress 5 To Exit\t\t\t\t\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t*\t\t\tHello, Enter Your Choice..\t\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t*\t\t\t                          \t\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * *\n");

            int updateNumber = scanner.nextInt();
            switch (updateNumber)
            {
                case 1:
                    System.out.println("Enter Book Name");
                    String bookName = scanner.next();
                    // After that I wanna search for this book in arrayList and return all information about it;
                    Book oldBook = Book.getBookByName(bookName);
                    Book newBook = Book.getBookByName(bookName);
                    if(oldBook==null){
                        System.out.println("There is no book with this name..!!");
                    }
                    else{
                        System.out.println("Enter New Name");
                        String newName = scanner.next();
                        newBook.setBookName(newName);
                        if(Book.updateBook(newBook,oldBook))
                            System.out.println("Updated Successfully");
                        else
                            System.out.println("Updated succssfully");
                    }
                    // After I find this, I go to function to update this book name in arryList;
                    break;
                case 2:
                    System.out.println("Enter Book Name");
                    String bookName1 = scanner.next();
                    // After that I wanna search for this book in arrayList and return all information about it;
                    Book oldBook1 = Book.getBookByName(bookName1);
                    Book newBook1 = Book.getBookByName(bookName1);
                    if(oldBook1==null){
                        System.out.println("There is no book with this name..!!");
                    }
                    else{
                        System.out.println("Enter New Author");
                        String newAuthor = scanner.next();
                        newBook1.setAuthorName(newAuthor);
                        if(Book.updateBook(newBook1,oldBook1))
                            System.out.println("Updated Successfully");
                        else
                            System.out.println("Updated Failed");
                    }
                    // After I find this, I go to function to update this book name in arryList;
                    break;
                case 3:
                    System.out.println("Enter Book Name");
                    String bookName2 = scanner.next();
                    // After that I wanna search for this book in arrayList and return all information about it;
                    Book oldBook2 = Book.getBookByName(bookName2);
                    Book newBook2 = Book.getBookByName(bookName2);
                    if(oldBook2==null){
                        System.out.println("There is no book with this name..!!");
                    }
                    else{
                        System.out.println("Enter New Price");
                        double newPrice = scanner.nextInt();
                        newBook2.setBookPrice(newPrice);
                        if(Book.updateBook(newBook2,oldBook2))
                            System.out.println("Updated Successfully");
                        else
                            System.out.println("Updated Failed");
                    }
                    // After I find this, I go to function to update this book name in arryList;
                    break;
                case 4:
                    condition=false;
                    break;
                case 5:
                    Main.exitProgram();
                    break;
            }

        }
    }

    public static boolean deleteBook(Book book) {
        if(!booksList.isEmpty()){
            booksList.remove(book);
            return true;
        }
        return false;
    }

    public static void deleteBooks(Scanner scanner) {
        System.out.println("Enter Book Name");
        String bookName = scanner.next();
        Book book = Book.getBookByName(bookName);
        if(book==null){
            System.out.println("There is no book with this name");
        }else{
            if(Book.deleteBook(book))
                System.out.println("Book Deleted Successfully");
            else
                System.out.println("Deleted Failed");
        }
    }

}
