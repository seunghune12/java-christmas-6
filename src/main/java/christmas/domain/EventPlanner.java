package christmas.domain;

import christmas.controller.EventController;

public class EventPlanner {
    private final EventController eventController;

    public EventPlanner(EventController eventController) {
        this.eventController = eventController;
    }

    public void run(){
        startRequestInfo();
        calculateEvents();
        printOrderResult();
    }

    private void startRequestInfo(){
        eventController.requestInfo();
    }

    private void calculateEvents(){
        eventController.calculateEvent();
    }

    private void printOrderResult(){

    }
}
