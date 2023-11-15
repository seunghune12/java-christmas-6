package christmas.Repository;

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

    public void saveInfo(){
        date.saveDate();
        menu.saveOrder();
    }


    public void printFristLineAndMenus(){
        date.printStartResultLine();
        menu.printOrderedMenus();

    }

    public void startCalculateAndPrint(){
        Price price = new Price(menu.calculateTotalPrice());
        runTotalPriceBeforeDiscount(price);
        runChampagneEvent(price);
//        runBenefitList(price);
//        runTotalBenefitPrice(price);
//        runDiscountedPrice(price);
//        runDecemberBadge(price);
    }

//    private void runDecemberBadge(Price price){
//        OutputView.printDecemberEventBadge();
//        price.checkDecemberBadge();
//    }
//
//    private void runDiscountedPrice(Price price) {
//        OutputView.printDiscountedPrice();
//        price.printDiscountedTotalPrice();
//    }
//
//    private void runTotalBenefitPrice(Price price){
//        OutputView.printTotalDiscountPrice();
//        price.printBenefitTotalPrice();
//    }

//    private void runBenefitList(Price price){
//        OutputView.printBenefitList();
//        price.printBenefitListAndPrice();
//
//    }

    private void runChampagneEvent(Price price){
        OutputView.printGiftMenu();
        price.printChampagneEvent();
    }

    private void runTotalPriceBeforeDiscount(Price price){
        OutputView.printTotalPriceBeforeDiscount();
        price.printTotalPrice();
    }

//    private Price calculateEvents(){


//        price.printChampagneEvent();
//        price.saleChristmasEvent(date.calculateChristmasEvent());
//        price.saleStarEvent(date.checkStarEvent());
//        price.saleWeekdayAndWeekendEvent(calculateWeekEvent());

//        return price;
//    }

    private Map<String, Integer> calculateWeekEvent(){
        Map<String, Integer> weeklyEvent = new HashMap<>();
        String saleKind = date.checkSaleSort();
        weeklyEvent.put(saleKind, menu.calculatedaysEvent(saleKind)) ;
        return weeklyEvent;
    }
}
