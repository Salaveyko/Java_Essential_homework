package Worker;

import java.util.Scanner;

/**
 * 1. Entering data, checking the correctness of the entered year of the employee`s start work.
 * 2. Sorting the list of employees.
 * 3. Printing the entire list of employees and the list of experienced employees.
 */
public class Main {
    public static void main(String[] args) {
        Workers workers = new Workers();

        while (true) {
            Scanner sc = new Scanner(System.in);
            Worker w = new Worker();

            System.out.print("\nEnter the employee`s name: ");
            w.setName(sc.nextLine());
            System.out.print("What position he/she holds: ");
            w.setPosition(sc.nextLine());
            System.out.print("Enter еру year in which he/she started working: ");
            w.setStartingWorkYear(sc.nextInt());

            try {
                workers.addWorker(w);
            } catch (IncorrectYearCommencementException e) {
                System.out.print("\u001B[31m");
                System.out.println(e.getMessage());
                System.out.print("\u001B[0m");
            }

            System.out.print("Are you finished entering the data? (y): ");
            if (sc.next().charAt(0) == 'y') break;
        }

        workers.sortByName();

        System.out.println("\n" + workers);
        System.out.println("\tExperienced workers:\n" + workers.getWorkersWithExperience(5));
    }
}
