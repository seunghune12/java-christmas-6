package christmas.domain;

public class Price {

    int beforePrice;
    int afterPrice;
    int discountPrice;


    public Price(int totalPrice) {
        this.beforePrice = totalPrice;
        this.afterPrice = totalPrice;
        this.discountPrice = 0;
    }

    public boolean checkChapangeEvent(){
        if(120000 <= beforePrice){
            return true;
        }
        return false;
    }

    public void saleChristmasEvent(int christmasEventDiscount){
        this.afterPrice -= christmasEventDiscount;
        this.discountPrice += christmasEventDiscount;
    }

    public void saleStarEvent(boolean starBoolean){
        if(starBoolean){
            this.afterPrice -= 1000;
            this.discountPrice += 1000;
        }
    }

    public void saleWeekdayAndWeekendEvent(int daySalePrice){
        this.afterPrice -= daySalePrice;
        this.discountPrice += daySalePrice;
    }


}
