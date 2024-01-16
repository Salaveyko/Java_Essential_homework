package Worker;

/**
 * The Worker class contains the name of the employee, his position, year of starting work, constructors,
 * getters, setters and an overridden toString().
 * This class is compared by employee names.
 */
public class Worker implements Comparable<Worker> {
    private String name;
    private String position;
    private int startingWorkYear;

    public Worker() {
        this.name = "";
        this.position = "";
        this.startingWorkYear = 0;
    }

    public Worker(String name, String position, int startingWorkYear) {
        this.name = name;
        this.position = position;
        this.startingWorkYear = startingWorkYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setStartingWorkYear(int startingWorkYear) {
        this.startingWorkYear = startingWorkYear;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getStartingWorkYear() {
        return startingWorkYear;
    }

    @Override
    public String toString() {
        return name + "\nEmployee position: " + position + "\nYear of appointment: " + startingWorkYear + "\n";
    }

    @Override
    public int compareTo(Worker other) {
        return this.name.compareTo(other.name);
    }
}
