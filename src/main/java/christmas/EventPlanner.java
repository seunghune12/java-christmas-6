package christmas;

import christmas.controller.EventController;

public class EventPlanner {
    private final EventController eventController;

    public EventPlanner(EventController eventController) {
        this.eventController = eventController;
    }

    public void run(){
        startRequestInfo();
        startOrderProgram();
        runOrderProgram();
    }

    private void startRequestInfo(){
        eventController.requestInfo();
    }

    private void startOrderProgram(){eventController.startPrintingResult();}

    private void runOrderProgram(){
        eventController.runDecemberEvent();
    }
}
