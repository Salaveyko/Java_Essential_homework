package com.classroom;

/**
 * BadPupil extends Pupil and formally represents the success of bad pupils.
 */
public class BadPupil extends Pupil {
    public BadPupil(String name) {
        super(name);
    }

    public String study() {
        return super.study() + "3\n";
    }
    public String read() {
        return super.read() + "4\n";
    }
    public String write() {
        return super.write() + "3\n";
    }
    public String relax() {
        return super.relax() + "5\n";
    }
}
