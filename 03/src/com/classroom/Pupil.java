package com.classroom;

/**
 * Abstract object Pupil.
 * Contains a name field, a constructor with arguments, getters and setters.
 * Also has study(), read(), write(), and relax() methods. These methods represent a partial
 * implementation of the pupil`s success.
 */
public abstract class Pupil {
    private String name;

    public Pupil(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String study() {
        return "Study - ";
    }

    public String read() {
        return "Reading - ";
    }

    public String write() {
        return "Writing - ";
    }

    public String relax() {
        return "Relaxing - ";
    }
}
