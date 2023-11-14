package christmas.controller;

import christmas.Repository.EventRepository;
import christmas.view.InputView;

public class EventController {
    private final EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public void requestInfo() {
        eventRepository.saveInfo();
    }
}
