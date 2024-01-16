package com.itvdn.book001;

/**
 * Contains the book`s content and boilerplate code.
 */
public class Content {
    private String content;

    public Content(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Prints the content to the console.
     */
    public void show() {
        System.out.println(content);
    }
}
