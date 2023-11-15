package christmas.Repository;

import christmas.domain.Date;
import christmas.domain.Menu;
import christmas.domain.Price;

public class EventService {
    private final Menu menu;
    private final Date date;

    public EventService(Menu menu, Date date) {
        this.menu = menu;
        this.date = date;
    }

    public void saveInfo(){
        date.saveDate();
        menu.saveOrder();
    }


    public void printFristLineAndMenus(){
        date.printStartResultLine();
        menu.printOrderedMenus();

    }

    public void calculatePrice(){
        Price price = new Price(menu.calculateTotalPrice());
        price.saleChristmasEvent(date.calculateChristmasEvent());
        price.saleStarEvent(date.checkStarEvent());
        price.saleWeekdayAndWeekendEvent(calculateWeekEvent());

    }

    public void printCalculateResult(){

    }

    private int calculateWeekEvent(){
        String saleKind = date.checkSaleSort();
        return menu.calculatedaysEvent(saleKind);
    }
}
