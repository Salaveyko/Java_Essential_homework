package com.classroom;

/**
 * GoodPupil extends Pupil and formally represents the success of average pupils.
 */
public class GoodPupil extends Pupil{
    public GoodPupil(String name) {
        super(name);
    }

    public String study() {
        return super.study() + "4\n";
    }
    public String read() {
        return super.read() + "4\n";
    }
    public String write() {
        return super.write() + "4\n";
    }
    public String relax() {
        return super.relax() + "5\n";
    }
}
