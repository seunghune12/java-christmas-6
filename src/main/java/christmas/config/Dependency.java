package christmas.config;

import christmas.Repository.EventService;
import christmas.controller.EventController;
import christmas.domain.Date;
import christmas.EventPlanner;
import christmas.domain.Menu;

public class Dependency {

    public static EventPlanner eventPlannner(){
        return new EventPlanner(eventController());
    }

    public static EventController eventController(){
        return new EventController(eventRepository());
    }

    public static EventService eventRepository(){
        return new EventService(menu(),date());
    }

    public static Menu menu(){
        return new Menu();
    }

    public static Date date(){
        return new Date();
    }
}
