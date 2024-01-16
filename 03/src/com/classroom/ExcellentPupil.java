package com.classroom;

/**
 * ExcellentPupil extends Pupil and formally represents the success of the smartest pupils.
 */
public class ExcellentPupil extends Pupil {
    public ExcellentPupil(String name) {
        super(name);
    }

    public String study() {
        return super.study() + "5\n";
    }

    public String read() {
        return super.read() + "5\n";
    }

    public String write() {
        return super.write() + "5\n";
    }

    public String relax() {
        return super.relax() + "5\n";
    }
}
