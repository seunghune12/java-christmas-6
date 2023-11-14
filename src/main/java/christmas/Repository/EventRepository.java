package christmas.Repository;

import christmas.domain.Date;
import christmas.domain.Menu;
import christmas.view.InputView;

public class EventRepository {
    private final Menu menu;
    private final Date date;

    public EventRepository(Menu menu, Date date) {
        this.menu = menu;
        this.date = date;
    }

    public void saveInfo(){
        date.saveDate();
        menu.saveMenu();
    }
}
