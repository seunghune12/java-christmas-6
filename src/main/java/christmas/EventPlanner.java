package christmas;

import christmas.controller.EventController;

public class EventPlanner {
    private final EventController eventController;

    public EventPlanner(EventController eventController) {
        this.eventController = eventController;
    }

    public void run(){
        startRequestInfo();
        startOrder();
        startEventCalculate();
        printRecipt();
    }

    private void startRequestInfo(){
        eventController.requestInfo();
    }

    private void startOrder(){eventController.startPrintingResult();}

    private void startEventCalculate(){
        eventController.calculateEvent();
    }

    private void printRecipt(){eventController.printEventResult();

    }
}
