package christmas;

import christmas.config.Dependency;
import christmas.domain.EventPlanner;

public class Application {
    public static void main(String[] args) {

        try {
            EventPlanner eventPlanner = Dependency.eventPlannner();
            eventPlanner.run();
        } catch (Exception e) {
            System.out.println();
            throw e;
        }
    }
}
