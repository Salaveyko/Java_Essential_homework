package com.itvdn.book001;

/**
 * Contains the book`s title and boilerplate code.
 */
public class Title {
    private String title;

    public Title(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Prints the title to the console.
     */
    public void show() {
        System.out.println(title);
    }
}
