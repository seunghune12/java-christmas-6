package christmas.domain;

import christmas.constant.BenefitList;
import christmas.view.OutputView;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class EventPrices {
    Map<String,Integer> benefitList;
    int totalPrice;

    public EventPrices() {

        this.benefitList = new HashMap<>();
        this.totalPrice = 0;
    }

    public void addChampagneBenefit(int discountPrice){
        benefitList.put("GIFT",discountPrice);
    }
//
    public void addChristBenefit(int discountPrice){
        benefitList.put("CHRISTMAS", discountPrice);
    }

    public void addStarBenefit(int discountPrice){
        benefitList.put("STAR",discountPrice);
    }

    public void addWeekdayAndWeekendBenefit(Map<String, Integer> weeklyEvent){
        if(weeklyEvent.containsKey("DESSERT") && weeklyEvent.get("DESSERT") != 0){
            benefitList.put("DESSERT",weeklyEvent.get("DESSERT"));
        } else if (weeklyEvent.containsKey("MAIN") && weeklyEvent.get("MAIN") != 0) {
            benefitList.put("MAIN",weeklyEvent.get("MAIN"));
        }
    }

    public void calculateBenefitList(){
        if(benefitList.isEmpty()){
            OutputView.printNone();
            return;

        } else if (benefitList != null) {

            for (Map.Entry<String, Integer> entry : benefitList.entrySet()){
                addTotalPrice(entry.getValue());
                printBenefits(entry.getKey(),entry.getValue());
            }
        }
    }

    private void printBenefits(String benefitName, int discountPrice){
        DecimalFormat format = new DecimalFormat("-###,###원");
        String benefitPrint = BenefitList.getEventNameByValue(benefitName);
        benefitPrint += format.format(discountPrice);
        System.out.println(benefitPrint);
    }

    private void addTotalPrice(int price){
        this.totalPrice += price;
    }

    public void printTotalprice(){
        DecimalFormat format = new DecimalFormat("-###,###원");
        System.out.println(format.format(totalPrice));
    }

    public void printDiscountedPrice(int totalPriceBeforeDiscount){
        DecimalFormat format = new DecimalFormat("-###,###원");
        int discountedPrice = totalPriceBeforeDiscount - totalPrice;
        System.out.println(format.format(discountedPrice));
    }

    public void printDecemberBadge(){
        if(totalPrice < 5000){
            OutputView.printNone();
            return;
        }else if(totalPrice < 10000) {
            OutputView.printStarBadge();
            return;
        }else if(totalPrice < 20000){
            OutputView.printTreeBadge();
            return;
        }else if(20000 <= totalPrice){
            OutputView.printSantaBadge();
            return;
        }
    }
}
