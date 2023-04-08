/*
    If I wanna print all elements in arraList , I can use for each for(className  varName : arrayListName)    // Line 36
*/
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("\n\t\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * *\n\t\t\t\t\t\t\t\t*\t\t\t\t\t\t\t\t\t\t\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t*\t\t\t\t\t#Main List..!\t\t\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t*\t\t\tPress 1 To Display All Books\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t*\t\t\tPress 2 To Add Book\t\t\t\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t*\t\t\tPress 3 To Update Book\t\t\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t*\t\t\tPress 4 To Delete Book\t\t\t\t\t*");
           // System.out.println("\t\t\t\t\t\t\t\t*\t\t\tPress 5 To Search For Book\t\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t*\t\t\tPress 5 To Exit\t\t\t\t\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t*\t\t\tHello, Enter Your Choice..\t\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t*\t\t\t                          \t\t\t\t*");
            System.out.println("\t\t\t\t\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
            int choiceNumber = 0;
            try {
                choiceNumber = scanner.nextInt();
            } catch (ArithmeticException ex) {
                System.out.println("Error! /n You Must Enter Invalid value");
            }
            switch(choiceNumber)
            {
                case 1:
                    Book.displayAllBooks();
                    break;
                case 2:
                    Book.addBooks(scanner);
                    break;
                case 3:
                    Book.updateBooks(scanner);
                    break;
                case 4:
                    Book.deleteBooks(scanner);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
    public static void exitProgram(){
        System.exit(0);
    }
}
