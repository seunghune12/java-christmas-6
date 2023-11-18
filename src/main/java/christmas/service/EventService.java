package christmas.service;

import christmas.domain.Date;
import christmas.domain.Menu;
import christmas.domain.Price;
import christmas.view.OutputView;
import java.util.HashMap;
import java.util.Map;

public class EventService {
    private final Menu menu;
    private final Date date;

    public EventService(Menu menu, Date date) {
        this.menu = menu;
        this.date = date;
    }

    public void saveInfo() {
        date.saveDate();
        menu.saveOrder();
    }


    public void printFristLineAndMenus() {
        date.printStartResultLine();
        menu.printOrderedMenus();
    }

    public void startCalculateAndPrint() {
        Price price = new Price(menu.calculateTotalPrice());
        runTotalPriceBeforeDiscount(price);
        runChampagneEvent(price);
        runEventList(price);
        runTotalBenefitPrice(price);
        runDiscountedPrice(price);
        runDecemberBadge(price);
    }

    private void runDecemberBadge(Price price){
        OutputView.printDecemberEventBadge();
        price.checkDecemberBadge();
    }

    private void runDiscountedPrice(Price price) {
        OutputView.printDiscountedPrice();
        price.printDiscountedTotalPrice();
        OutputView.printEnter();
    }

    private void runTotalBenefitPrice(Price price){
        OutputView.printTotalDiscountPrice();
        price.printBenefitTotalPrice();
        OutputView.printEnter();
    }

    private void runBenefitList(Price price){
        OutputView.printBenefitList();
        price.printBenefitListAndPrice();
        OutputView.printEnter();
    }

    private void runEventList(Price price) {
        calculateEventPrices(price);
        runBenefitList(price);
    }

    private void calculateEventPrices(Price price) {
        price.saleChristmasEvent(date.calculateChristmasEvent());
        price.saleStarEvent(date.checkStarEvent());
        price.saleWeekdayAndWeekendEvent(calculateWeekEvent());
    }

    private Map<String, Integer> calculateWeekEvent() {
        Map<String, Integer> weeklyEvent = new HashMap<>();
        String saleKind = date.checkSaleSort();
        weeklyEvent.put(saleKind, menu.calculatedaysEvent(saleKind));
        return weeklyEvent;
    }

    private void runChampagneEvent(Price price) {
        OutputView.printGiftMenu();
        price.printChampagneEvent();
        OutputView.printEnter();
    }

    private void runTotalPriceBeforeDiscount(Price price) {
        OutputView.printTotalPriceBeforeDiscount();
        price.printTotalPrice();
        OutputView.printEnter();
    }
}

