package com.printer;

public class SuperClass {
    protected static final String ANSI_RESET = "\u001B[0m";
    protected static final String ANSI_GREEN = "\u001B[32m";
    protected static final String ANSI_YELLOW = "\u001B[33m";
    protected static final String ANSI_RED = "\u001B[31m";

    public void print() {
        System.out.println(ANSI_GREEN + "Super class" + ANSI_RESET);
    }
}
