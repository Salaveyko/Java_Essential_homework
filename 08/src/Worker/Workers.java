package Worker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

/**
 * The Workers class contains List<Worker> workers field. You can add new employees, delete
 * them, and sort the list by names. Also, you can get employees by their index and experience.
 */
public class Workers {
    private List<Worker> workers;

    public Workers() {
        workers = new ArrayList<>();
    }


    public void addWorker(Worker worker) throws IncorrectYearCommencementException {
        int yearChecker = Calendar.getInstance().get(Calendar.YEAR) - worker.getStartingWorkYear();
        if (yearChecker > 50 || yearChecker < 0) {
            throw new IncorrectYearCommencementException("Error: An incorrect year is entered");
        }

        workers.add(worker);
    }

    public void removeWorker(int index) {
        workers.remove(index);
    }

    public void sortByName() {
        Collections.sort(workers);
    }

    public Worker getWorker(int index) {
        return workers.get(index);
    }

    public Workers getWorkersWithExperience(int experience) {
        Workers expWorkers = new Workers();
        for (var w : workers) {
            if (Calendar.getInstance().get(Calendar.YEAR) - w.getStartingWorkYear() >= experience) {
                try {
                    expWorkers.addWorker(w);
                } catch (IncorrectYearCommencementException e) {
                    e.printStackTrace();
                }
            }
        }
        return expWorkers;
    }

    @Override
    public String toString() {
        String str = "";

        for (Worker w : workers) {
            str += w.toString() + "\n";
        }

        return str;
    }
}
