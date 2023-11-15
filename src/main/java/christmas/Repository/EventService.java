package christmas.Repository;

import christmas.domain.Date;
import christmas.domain.Menu;

public class EventService {
    private final Menu menu;
    private final Date date;

    public EventService(Menu menu, Date date) {
        this.menu = menu;
        this.date = date;
    }

    public void saveInfo(){
        date.saveDate();
        menu.saveMenu();
    }

    public void calculatePrice(){

    }
}
