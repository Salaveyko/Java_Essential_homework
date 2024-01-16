package com.itvdn.book001;

/**
 * Contains the author`s name and boilerplate code.
 */
public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Prints the name to the console.
     */
    public void show() {
        System.out.println(name);
    }
}
