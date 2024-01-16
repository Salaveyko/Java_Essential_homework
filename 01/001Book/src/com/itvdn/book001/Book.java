package com.itvdn.book001;

import java.util.Scanner;

/**
 * The program creates instances of Author, Content, and Title, to which the data read from the
 * console is transferred. Printing data to the console.
 */
public class Book {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the author`s name: ");
        Author author = new Author(in.nextLine());
        System.out.print("Enter a book title: ");
        Title title = new Title(in.nextLine());
        System.out.print("Enter the contents of the book: ");
        Content content = new Content(in.nextLine());

        System.out.println();

        System.out.println("\tAuthor");
        author.show();
        System.out.println("\tTitle");
        title.show();
        System.out.println();
        content.show();
    }
}
