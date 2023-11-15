package christmas.domain;

import christmas.view.OutputView;
import java.util.Map;

public class Price {

    int totalPriceBeforeDiscount;
    EventPrices eventPrices;


    public Price(int totalPrice) {
        this.totalPriceBeforeDiscount = totalPrice;

    }

    public void printTotalPrice(){

        System.out.println(totalPriceBeforeDiscount + "원");
    }

    public void printChampagneEvent(){
        if(120000 <= totalPriceBeforeDiscount){
            OutputView.printChampagne();
            eventPrices.addChampagneBenefit(25000);
        } else if (totalPriceBeforeDiscount < 120000) {
            OutputView.printNone();
        }
    }

    public void saleChristmasEvent(int christmasEventDiscount){
        if (christmasEventDiscount != 0){
            eventPrices.addChristBenefit(christmasEventDiscount);
        }
    }

    public void saleStarEvent(boolean starBoolean){
        if(starBoolean){
            eventPrices.addStarBenefit(1000);
        }
    }

    public void saleWeekdayAndWeekendEvent(Map<String, Integer> weeklyEvent){
        if(weeklyEvent.values() != null){
            eventPrices.addWeekdayAndWeekendBenefit(weeklyEvent);
        }
    }

    public void printBenefitListAndPrice(){
        eventPrices.calculateBenefitList();
    }

    public void printBenefitTotalPrice(){
        eventPrices.printTotalprice();
    }
//
//    public void printDiscountedTotalPrice(){
//        eventPrices.printDiscountedPrice(totalPriceBeforeDiscount);
//    }
//
//    public void checkDecemberBadge(){
//        eventPrices.printDecemberBadge();
//    }



}
