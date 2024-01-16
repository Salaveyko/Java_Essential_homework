package com.classroom;

/**
 * Classroom contains a pupils array and populates it using a hardcode approach in
 * the default constructor.
 * getJournal() method returns a string that contains pupils` performance journal.
 */
public class Classroom {
    private Pupil[] pupils;

    public Classroom() {
        Pupil p1 = new ExcellentPupil("Alex");
        Pupil p2 = new GoodPupil("Lidia");
        Pupil p3 = new GoodPupil("Vladislav");
        Pupil p4 = new BadPupil("Marina");

        pupils = new Pupil[]{p1, p2, p3, p4};
    }

    public Classroom(Pupil[] pupils) {
        this.pupils = pupils;
    }

    public String getJournal() {
        StringBuilder sb = new StringBuilder("\n\tPupils` performance journal\n");
        for (var p : pupils) {
            sb.append(p.getName());
            sb.append(":\n");
            sb.append(p.study());
            sb.append(p.write());
            sb.append(p.read());
            sb.append(p.relax());
            sb.append("\n");
        }
        return sb.toString();
    }
}
