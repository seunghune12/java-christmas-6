package christmas.controller;

import christmas.Repository.EventService;

public class EventController {
    private final EventService eventService;

    public EventController(EventService eventRepository) {
        this.eventService = eventRepository;
    }

    public void requestInfo() {
        eventService.saveInfo();
    }

    public void startPrintingResult(){
        eventService.printFristLineAndMenus();
    }

    public void calculateEvent() {
        eventService.calculatePrice();
    }

    public void printEventResult(){

    }
}
