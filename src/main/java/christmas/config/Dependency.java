package christmas.config;

import christmas.Repository.EventRepository;
import christmas.controller.EventController;
import christmas.domain.Date;
import christmas.domain.EventPlanner;
import christmas.domain.Menu;

public class Dependency {

    public static EventPlanner eventPlannner(){
        return new EventPlanner(eventController());
    }

    public static EventController eventController(){
        return new EventController(eventRepository());
    }

    public static EventRepository eventRepository(){
        return new EventRepository(menu(),date());
    }

    public static Menu menu(){
        return new Menu();
    }

    public static Date date(){
        return new Date();
    }
}
