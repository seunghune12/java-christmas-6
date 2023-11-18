package christmas.config;

import christmas.service.EventService;
import christmas.controller.EventController;
import christmas.domain.Date;
import christmas.EventPlanner;
import christmas.domain.Menu;
import java.util.HashMap;
import java.util.Map;

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
        return new Menu(createMap());
    }

    private static Date date(){
        return new Date();
    }

    private static Map<String,Integer> createMap(){
        return new HashMap<>();
    }
}